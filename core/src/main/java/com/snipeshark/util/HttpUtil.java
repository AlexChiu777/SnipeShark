package com.snipeshark.util;

import org.apache.commons.io.IOUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class HttpUtil {
	
	private final String USER_AGENT = "Mozilla/5.0";
	private final String HTTP_REQUEST_METHOD_GET = "GET";

	// default encoding
	public static final String DEFAULT_URL_CHARSET = "UTF-8";

	protected HttpUtil() {
	}

	public static HttpUtil getInstance() {
		return httpUtil;
	}

	/**
	 * @param form
	 * @return URL-encoded String (null means wrong data/format)
	 */
	public String urlEncode(HashMap form) {
		if (form == null) {
			return null;
		}

		String rst = null;
		try {
			StringBuffer sbf = new StringBuffer();

			Iterator keys = form.keySet().iterator();
			String key = null;
			String value = null;
			for (int i = 0; keys.hasNext(); i++) {
				// & first
				if (i > 0) {
					sbf.append("&");
				}

				// data
				key = (String) keys.next();
				value = (String) form.get(key);
				sbf.append(URLEncoder.encode(key, DEFAULT_URL_CHARSET));
				sbf.append("=");
				if (value != null) {
					sbf.append(URLEncoder.encode(value, DEFAULT_URL_CHARSET));
				}
			}

			rst = sbf.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return rst;
	}

	/**
	 * @param data
	 *            encoded string
	 * @return HashMap containg key and value pairs (null means wrong data
	 *         format)
	 */
	public HashMap<String, String> urlDecode(String data) {
		if (data == null) {
			return null;
		}

		HashMap<String, String> rst = new HashMap<String, String>();
		try {
			StringTokenizer pairs = new StringTokenizer(data, "&");

			String key = null;
			String value = null;
			while (pairs.hasMoreTokens()) {
				String pair = pairs.nextToken();

				// get key and value
				int index = pair.indexOf("=");
				if (index == -1) {
					continue;
				}

				key = pair.substring(0, index);
				value = "";
				// check value
				if (++index < pair.length()) {
					value = pair.substring(index);
				}

				// decode
				rst.put(URLDecoder.decode(key, DEFAULT_URL_CHARSET), URLDecoder.decode(value, DEFAULT_URL_CHARSET));
			}
		} catch (Exception e) {
			System.out.println("URL Decode Error");

			rst = null;
		}

		return rst;
	}

	// HTTP(s) POST: one way no header
	public boolean postOneWayMessage(String url, String message) {
		return postOneWayMessage(url, message, null);
	}

	// HTTP(s) POST: one way with extra header
	public boolean postOneWayMessage(String url, String message, HashMap header) {
		if (url == null) {
			return false;
		}

		HttpURLConnection connection = null;
		boolean status = false;

		try {
			System.out.println("HTTP POST: Open URL " + url);
			System.out.println(message);

			// create a connection
			connection = (HttpURLConnection) (new URL(url)).openConnection();

			// set connection properties
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setUseCaches(false);
			connection.setAllowUserInteraction(false);
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

			// set extra headers
			if (header != null && header.size() > 0) {
				Iterator keys = header.keySet().iterator();
				while (keys.hasNext()) {
					String key = (String) keys.next();
					connection.setRequestProperty(key, (String) header.get(key));
				}
			}

			System.out.println("HTTP POST: Connect");
			// open the connection
			connection.connect();

			System.out.println("HTTP POST: PostData");

			// write content
			OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
			out.write(message);
			out.flush();
			out.close();

			System.out.println("HTTP POST: Wait Response ");
			int httpStatus = connection.getResponseCode();

			// close connection
			connection.disconnect();
			connection = null;

			status = (httpStatus == HttpURLConnection.HTTP_OK);
			System.out.println("HTTP POST: DONE");
		} catch (Exception e) {
			System.out.println("postOneWayMessage Exception");
		} finally {
			if (connection != null) {
				connection.disconnect();
				connection = null;
			}
		}

		return status;
	}

	public String getTwoWayMessage(String _url) {
		return getTwoWayMessage(_url, null, null);
	}

	// HTTP(s) GET: both way with parameters
	public String getTwoWayMessage(String _url, HashMap param) {
		return getTwoWayMessage(_url, param, null);
	}

	// HTTP(s) GET: both way with parameters and headers
	public String getTwoWayMessage(String _url, HashMap param, HashMap header) {
		if (_url == null) {
			return null;
		}

		HttpURLConnection connection = null;
		String rst = null;

		try {
			String url = _url;
			// set parameters
			if (param != null && param.size() > 0) {
				url += "?" + urlEncode(param);
			}

			System.out.println("HTTP GET: OpenURL " + url);
			// create a connection
			connection = (HttpURLConnection) (new URL(url)).openConnection();

			// set connection properties
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setUseCaches(false);
			connection.setAllowUserInteraction(false);
			connection.setRequestMethod("GET");

			// set extra headers
			if (header != null && header.size() > 0) {
				Iterator keys = header.keySet().iterator();
				while (keys.hasNext()) {
					String key = (String) keys.next();
					connection.setRequestProperty(key, (String) header.get(key));
				}
			}

			System.out.println("HTTP GET:Connect");

			// open the connection
			connection.connect();

			System.out.println("HTTP GET:WaitResponse");
			int status = connection.getResponseCode();
			// return result only when HTTP code 200 is returned
			if (status == HttpURLConnection.HTTP_OK) {
				rst = getHttpResponse(connection);
			} else {
				String error = getHttpResponse(connection);
				System.out.println("HTTP GET:error " + error);
			}

			// close connection
			connection.disconnect();
			connection = null;

			System.out.println("HTTP GET:Done");
		} catch (Exception e) {
			System.out.println("HTTP Get:Exception - " + e);
		} finally {
			if (connection != null) {
				connection.disconnect();
				connection = null;
			}
		}

		return rst;
	}

	// HTTP(s) POST: both way no header
	public String postTwoWayMessage(String url, String message) {
		return postTwoWayMessage(url, message, null);
	}

	// HTTP(s) POST: both way with extra header
	public String postTwoWayMessage(String url, String message, HashMap header) {
		if (url == null) {
			return null;
		}

		HttpURLConnection connection = null;
		String rst = null;

		try {
			System.out.println("HTTP POST:OpenURL " + url);

			// create a connection
			connection = (HttpURLConnection) (new URL(url)).openConnection();

			// set connection properties
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setUseCaches(false);
			connection.setAllowUserInteraction(false);
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

			// set extra headers
			if (header != null && header.size() > 0) {
				Iterator keys = header.keySet().iterator();
				while (keys.hasNext()) {
					String key = (String) keys.next();
					connection.setRequestProperty(key, (String) header.get(key));
				}
			}

			System.out.println("HTTP POST:Connect");

			// open the connection
			connection.connect();

			System.out.println("HTTP POST:PostData - " + message);

			// write content
			OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
			out.write(message);
			out.flush();
			out.close();

			System.out.println("HTTP POST:WaitResponse");
			int status = connection.getResponseCode();
			// return result only when HTTP code 200 is returned
			if (status == HttpURLConnection.HTTP_OK) {
				rst = getHttpResponse(connection);
			} else {
				String error = getHttpResponse(connection);
				System.out.println("HTTP POST:Error - " + error);
			}

			// close connection
			connection.disconnect();
			connection = null;

			System.out.println("HTTP POST:Done:" + status + ":" + rst);
		} catch (Exception e) {
			System.out.println("HTTP POST:Exception - " + e);

		} finally {
			if (connection != null) {
				connection.disconnect();
				connection = null;
			}
		}

		return rst;
	}


	/**
	 * Remove password from string
	 *
	 * @param message String
	 * @return Masked password
	 */
	private String maskMessage(String message) {
		String returnMessage = "";

		String searchFor = "process_pass=";

		int start = message.indexOf(searchFor);

		// only if it finds
		if (start > -1) {
			start += searchFor.length();

			int end = message.indexOf("&", start);

			String stringToReplace = message.substring(start, end);

			returnMessage = message.replace(stringToReplace, "xxxxxxx");
		} else {
			returnMessage = message;
		}

		return returnMessage;
	}

	private String getHttpResponse(HttpURLConnection connection) throws IOException {
		String rst = "";
		InputStream in = connection.getInputStream();
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		byte[] buf = new byte[1024];
		int count = -1;
		// read byte content
		while ((count = in.read(buf)) != -1) {
			output.write(buf, 0, count);
		}

		// get response in default encoding
		rst = output.toString(DEFAULT_URL_CHARSET);
		return rst;
	}

	public byte[] getTwoWayToByteArray (String _url) {
		if (_url == null) {
			return null;
		}

		HttpURLConnection connection = null;
		byte[] bytes = null;


		try {
			String url = _url;

			System.out.println("HTTP GET:Open URL - " + url);

			// create a connection
			connection = (HttpURLConnection) (new URL(url)).openConnection();

			// set connection properties
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setUseCaches(false);
			connection.setAllowUserInteraction(false);
			connection.setRequestMethod("GET");

			System.out.println("HTTP GET:Connect");

			// open the connection
			connection.connect();

			System.out.println("HTTP GET:WaitResponse");
			int status = connection.getResponseCode();
			// return result only when HTTP code 200 is returned
			if (status == HttpURLConnection.HTTP_OK) {
				bytes = IOUtils.toByteArray(connection.getInputStream());
			}

			// close connection
			connection.disconnect();
			connection = null;

			System.out.println("HTTP GET:DONE - " + status);
		} catch (Exception e) {
			System.out.println("HTTP GET: Exception - " + e);
		} finally {
			if (connection != null) {
				connection.disconnect();
				connection = null;
			}
		}

		return bytes;
	}

	public void sendTextContentViaHttp(HttpServletResponse response, String content, String filename) throws IOException {
		// setup HTTP Response
		// Clear out response stream
		response.reset();
		// Set the browser's mime type
		response.setContentType("text/plain");
		// Ensure the browser's page to expect a file
		response.setHeader("Expires", "0");
		response.addHeader("Content-disposition", "attachment; filename=" + filename + ".txt");

		// send the EFTFile String to the browser
		response.getWriter().print(content);
	}

	public void sendByteContentViaHttp(HttpServletResponse response, ByteArrayOutputStream byteArrayOutputStream, String filename) throws IOException {
		// setup HTTP Response
		// Clear out response stream
		response.reset();
		// Set the browser's mime type
		response.setContentType("application/zip");
		// Ensure the browser's page to expect a zip file
		response.setHeader("Expires", "0");
		response.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\"");

		// write the bytes to http
		response.getOutputStream().write(byteArrayOutputStream.toByteArray());
		response.flushBuffer();
	}

	public void sendExcelContentViaHttp(HttpServletResponse response, ByteArrayOutputStream byteArrayOutputStream, String filename) throws IOException {
		// setup HTTP Response
		// Clear out response stream
		response.reset();
		// Set the browser's mime type
		response.setContentType("application/vnd.ms-excel");
		// Ensure the browser's page to expect a zip file
		response.setHeader("Expires", "0");
		response.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\"");

		// write the bytes to http
		response.getOutputStream().write(byteArrayOutputStream.toByteArray());
		response.flushBuffer();
	}

	private static HttpUtil httpUtil = new HttpUtil();
}



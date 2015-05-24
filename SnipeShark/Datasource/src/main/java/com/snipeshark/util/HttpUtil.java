package com.snipeshark.util;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtil {
	
	private final String USER_AGENT = "Mozilla/5.0";
	private final String HTTP_REQUEST_METHOD_GET = "GET";
	private final static HttpUtil instance = new HttpUtil();
	
	private static final String TV_DB_API_KEY = "DFCDB4071E338637";

	public static HttpUtil getInstance() {
		return instance;
	}
	
	public String sendHTTPGetRequest(String requestURL) {
		String response = null;
		
		try {
		URL object = new URL(requestURL);
		HttpURLConnection con = (HttpURLConnection) object.openConnection();
		
		con.setRequestMethod(HTTP_REQUEST_METHOD_GET);
		con.setRequestProperty("User-Agent", USER_AGENT);
		
		response = con.getResponseMessage();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return response;
		
	}
	
	public static void main(String[] args) {
		String requestURL = "http://thetvdb.com/api/GetSeries.php?seriesname=Chuck";
		
		
	}	
	
	
	

}

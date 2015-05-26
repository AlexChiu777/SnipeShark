package com.snipeshark.provider.thetvdb.service;

import com.snipeshark.provider.thetvdb.model.*;
import com.snipeshark.provider.thetvdb.model.advanced.TVDBZip;
import com.snipeshark.util.HttpUtil;
import com.snipeshark.util.XmlUtil;
import org.apache.commons.io.IOUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by Alex on 5/24/2015.
 */
public class TvdbProcessingService {
    private static final String TV_DB_API_KEY = "DFCDB4071E338637";
    private static final String TV_DB_BASE_URL = "http://thetvdb.com";
    private static final String TV_DB_API_URI = "/api/";
    private static final String TV_DB_MIRROR_URI = "/mirrors.xml";
    private static final String TV_DB_SERVER_TIME_URI = "Updates.php?type=none";
    private static final String TV_DB_GET_SERIES_URI = "GetSeries.php?seriesname=";

    //used for inital processing
    public Mirrors getMirrors(String API_KEY) {
        String url = TV_DB_BASE_URL + TV_DB_API_URI + API_KEY + TV_DB_MIRROR_URI;

        String xml = HttpUtil.getInstance().getTwoWayMessage(url);

        return (Mirrors) new XmlUtil(Mirrors.class).getXmlObject(xml);
    }

    public ServerTime getServerTime() {
        String url = TV_DB_BASE_URL + TV_DB_API_URI + TV_DB_SERVER_TIME_URI;

        String xml = HttpUtil.getInstance().getTwoWayMessage(url);

        return (ServerTime) new XmlUtil(ServerTime.class).getXmlObject(xml);
    }

    public TVDBData getTVDBSeriesInfo(String seriesName) {
        String url = TV_DB_BASE_URL + TV_DB_API_URI + TV_DB_GET_SERIES_URI + seriesName;

        String xml = HttpUtil.getInstance().getTwoWayMessage(url);

        return (TVDBData) new XmlUtil(TVDBData.class).getXmlObject(xml);

    }

    private String api_key="DFCDB4071E338637";
    private String base_url = "http://thetvdb.com";
    private String api_uri = "/api/";
    private String series_uri = "/series/";

    private String all_uri = "/all/";
    private String zip_uri = ".zip";

    private String series_id = "270408";
    private String language_id = "en";


    public TVDBZip getTVDBZipFileContent() {
        TVDBZip tvdbZip = new TVDBZip();
        String url = base_url + api_uri + api_key + series_uri + series_id + all_uri + language_id + zip_uri;

        byte[] zipBytes = HttpUtil.getInstance().getTwoWayToByteArray(url);

        if (zipBytes != null) {
            try {
                ZipInputStream zipStream = new ZipInputStream(new ByteArrayInputStream(zipBytes));
                ZipEntry entry = null;

                while ((entry = zipStream.getNextEntry()) != null) {
                    if (entry.getName().equals("banner.xml")) {
                        //tvdbZip.setBanners((TVDBBanners) new XmlUtil(TVDBBanners.class).getXmlObject(IOUtils.toString(zipStream)));
                    } else if (entry.getName().equals("en.xml")) {
                        tvdbZip.setTvdbData((TVDBData) new XmlUtil(TVDBData.class).getXmlObject(IOUtils.toString(zipStream)));
                    } else if (entry.getName().equals("language.xml")) {
                        //tvdbZip.setActors((TVDBActors) new XmlUtil(TVDBActors.class).getXmlObject(IOUtils.toString(zipStream)));
                    }

                    zipStream.closeEntry();
                }

                zipStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return tvdbZip;
    }


    public static void main(String[] args) {
        TvdbProcessingService tvdbProcessingService = new TvdbProcessingService();
        //TVDBData tvdbData = tvdbProcessingService.getTVDBSeriesInfo("Chuck");

        tvdbProcessingService.getTVDBZipFileContent();


    }
}

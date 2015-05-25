package com.snipeshark.provider.thetvdb.service;

import com.snipeshark.provider.thetvdb.model.Mirrors;
import com.snipeshark.provider.thetvdb.model.TVDBData;
import com.snipeshark.provider.thetvdb.model.TVDBSeries;
import com.snipeshark.provider.thetvdb.model.ServerTime;
import com.snipeshark.util.HttpUtil;
import com.snipeshark.util.XmlUtil;

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




    public static void main(String[] args) {
        TvdbProcessingService tvdbProcessingService = new TvdbProcessingService();
        TVDBData tvdbData = tvdbProcessingService.getTVDBSeriesInfo("Chuck");

        System.out.println("hey");


    }
}

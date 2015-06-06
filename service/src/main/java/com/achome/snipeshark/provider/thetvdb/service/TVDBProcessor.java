package com.achome.snipeshark.provider.thetvdb.service;

import com.achome.snipeshark.provider.thetvdb.TVDBConstants;
import com.achome.snipeshark.provider.thetvdb.model.*;
import com.achome.snipeshark.provider.thetvdb.model.advanced.TVDBZip;
import com.achome.snipeshark.util.HttpUtil;
import com.achome.snipeshark.util.XmlUtil;
import org.apache.commons.io.IOUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by Alex on 5/24/2015.
 */
public class TVDBProcessor {
    private String apiKey;
    private String language;

    public TVDBProcessor(String apiKey, String language) {
        this.apiKey = apiKey;
        this.language = language;
    }

    //Gets a list of mirrors from tvdb
    public Mirrors getMirrors(String apiKey) {
        String url = TVDBConstants.TV_DB_BASE_URL + TVDBConstants.TV_DB_API_URI + apiKey + TVDBConstants.TV_DB_MIRROR_URI;

        String xml = HttpUtil.getInstance().getTwoWayMessage(url);

        return (Mirrors) new XmlUtil(Mirrors.class).getXmlObject(xml);
    }

    //gets the current server time
    public ServerTime getServerTime() {
        String url = TVDBConstants.TV_DB_BASE_URL + TVDBConstants.TV_DB_API_URI + TVDBConstants.TV_DB_SERVER_TIME_URI;

        String xml = HttpUtil.getInstance().getTwoWayMessage(url);

        return (ServerTime) new XmlUtil(ServerTime.class).getXmlObject(xml);
    }

    //get Tvdb by series name
    public TVDBData getTVDBSeriesInfoByName(String seriesName) {
        String url = TVDBConstants.TV_DB_BASE_URL + TVDBConstants.TV_DB_API_URI + TVDBConstants.TV_DB_GET_SERIES_URI + seriesName;

        String xml = HttpUtil.getInstance().getTwoWayMessage(url);

        return (TVDBData) new XmlUtil(TVDBData.class).getXmlObject(xml);

    }

    //get series content in a zip format
    public TVDBZip getTVDBZipFileContent(String seriesId) {
        TVDBZip tvdbZip = new TVDBZip();
        String url = TVDBConstants.TV_DB_BASE_URL + TVDBConstants.TV_DB_API_URI + apiKey + TVDBConstants.TV_DB_SERIES_QUERY_URI
                + seriesId + TVDBConstants.TV_DB_ALL_URI + language + TVDBConstants.ZIP_EXTENSION;

        byte[] zipBytes = HttpUtil.getInstance().getTwoWayToByteArray(url);

        if (zipBytes != null) {
            try {
                ZipInputStream zipStream = new ZipInputStream(new ByteArrayInputStream(zipBytes));
                ZipEntry entry = null;

                while ((entry = zipStream.getNextEntry()) != null) {
                    if (entry.getName().equals(TVDBConstants.TV_DB_ZIP_BANNERS + TVDBConstants.XML_EXTENSION)) {
                        tvdbZip.setBanners((TVDBBanners) new XmlUtil(TVDBBanners.class).getXmlObject(IOUtils.toString(zipStream)));
                    } else if (entry.getName().equals(language + TVDBConstants.XML_EXTENSION)) {
                        tvdbZip.setTvdbData((TVDBData) new XmlUtil(TVDBData.class).getXmlObject(IOUtils.toString(zipStream)));
                    } else if (entry.getName().equals(TVDBConstants.TV_DB_ZIP_ACTORS + TVDBConstants.XML_EXTENSION)) {
                        tvdbZip.setActors((TVDBActors) new XmlUtil(TVDBActors.class).getXmlObject(IOUtils.toString(zipStream)));
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

    //get series content by series id
    public TVDBData getTVDBSeriesInfoById(String seriesId) {
        String url = TVDBConstants.TV_DB_BASE_URL + TVDBConstants.TV_DB_API_URI + apiKey +
                TVDBConstants.TV_DB_SERIES_QUERY_URI + seriesId + TVDBConstants.URL_DIVIDER + language + TVDBConstants.XML_EXTENSION;

        String xml = HttpUtil.getInstance().getTwoWayMessage(url);

        return (TVDBData) new XmlUtil(TVDBData.class).getXmlObject(xml);

    }

    //get series content and episode content
    public TVDBData getTVDBFullSeriesInfoById(String seriesId) {
        String url = TVDBConstants.TV_DB_BASE_URL + TVDBConstants.TV_DB_API_URI + apiKey +
                TVDBConstants.TV_DB_SERIES_QUERY_URI + seriesId + TVDBConstants.TV_DB_ALL_URI + language + TVDBConstants.XML_EXTENSION;

        String xml = HttpUtil.getInstance().getTwoWayMessage(url);

        return (TVDBData) new XmlUtil(TVDBData.class).getXmlObject(xml);

    }

    //get episode content by episode id
    public TVDBData getTVDBEpisodeInfoById(String episodeId) {
        String url = TVDBConstants.TV_DB_BASE_URL + TVDBConstants.TV_DB_API_URI + apiKey + TVDBConstants.TV_DB_EPISODES_URI
                + episodeId + TVDBConstants.URL_DIVIDER + language + TVDBConstants.XML_EXTENSION;

        String xml = HttpUtil.getInstance().getTwoWayMessage(url);

        return (TVDBData) new XmlUtil(TVDBData.class).getXmlObject(xml);
    }

    //get update data (default ZIP format)
    public TVDBData getTVDBUpdate(long timeDiff) {
        return getTVDBUpdate(timeDiff, TVDBConstants.ZIP_EXTENSION);
    }

    //get update data (XML or ZIP)
    public TVDBData getTVDBUpdate(long timeDiff, String format) {
        TVDBData tvdbData = null;
        String fileName = null;
        String url;

        if (timeDiff <= TVDBConstants.DAY_IN_SECONDS) {
            fileName = TVDBConstants.TV_DB_UPDATE_DAY;
        } else if (timeDiff <= TVDBConstants.WEEK_IN_SECONDS) {
            fileName = TVDBConstants.TV_DB_UPDATE_WEEK;
        } else if (timeDiff <= TVDBConstants.MONTH_IN_SECONDS) {
            fileName = TVDBConstants.TV_DB_UPDATE_MONTH;
        } else {
            fileName = TVDBConstants.TV_DB_UPDATE_ALL;
        }

        if (format.equals(TVDBConstants.ZIP_EXTENSION)) {
            url = TVDBConstants.TV_DB_BASE_URL + TVDBConstants.TV_DB_API_URI + apiKey + TVDBConstants.TV_DB_UPDATE_URI + fileName + TVDBConstants.ZIP_EXTENSION;
            tvdbData = getTVDBUpdateZip(url).getTvdbData();
        } else if (format.equals(TVDBConstants.XML_EXTENSION)) {
            url = TVDBConstants.TV_DB_BASE_URL + TVDBConstants.TV_DB_API_URI + apiKey + TVDBConstants.TV_DB_UPDATE_URI + fileName + TVDBConstants.XML_EXTENSION;
            tvdbData = getTVDBUpdateXml(url);
        }

        return tvdbData;
    }

    //get xml update data
    private TVDBData getTVDBUpdateXml(String url) {
        String xml = HttpUtil.getInstance().getTwoWayMessage(url);

        return (TVDBData) new XmlUtil(TVDBData.class).getXmlObject(xml);
    }

    //get zip update data
    private TVDBZip getTVDBUpdateZip(String url) {
        TVDBZip tvdbZip = new TVDBZip();

        byte[] zipBytes = HttpUtil.getInstance().getTwoWayToByteArray(url);

        if (zipBytes != null) {
            try {
                ZipInputStream zipStream = new ZipInputStream(new ByteArrayInputStream(zipBytes));
                ZipEntry entry = null;

                while ((entry = zipStream.getNextEntry()) != null) {
                    //only 1 file in update zip
                    tvdbZip.setTvdbData((TVDBData) new XmlUtil(TVDBData.class).getXmlObject(IOUtils.toString(zipStream)));
                    zipStream.closeEntry();
                }

                zipStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return tvdbZip;

    }

}

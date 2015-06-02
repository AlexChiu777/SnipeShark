package com.achome.snipeshark.provider.thetvdb;

/**
 * Created by Alex on 5/26/2015.
 */
public final class TVDBConstants {
    public static final String TV_DB_BASE_URL = "http://thetvdb.com";
    public static final String TV_DB_API_URI = "/api/";
    public static final String TV_DB_MIRROR_URI = "/mirrors.xml";
    public static final String TV_DB_SERVER_TIME_URI = "Updates.php?type=none";
    public static final String TV_DB_GET_SERIES_URI = "GetSeries.php?seriesname=";

    public static final String TV_DB_SERIES_URI = "/series/";
    public static final String TV_DB_EPISODES_URI = "/episodes/";
    public static final String TV_DB_ALL_URI = "/all/";
    public static final String TV_DB_BANNERS_URI = "/banners/";

    public static final String TV_DB_UPDATE_URI = "/updates/";
    public static final String TV_DB_UPDATE_DAY = "updates_day";
    public static final String TV_DB_UPDATE_WEEK = "updates_week";
    public static final String TV_DB_UPDATE_MONTH = "updates_month";
    public static final String TV_DB_UPDATE_ALL = "updates_all";

    public static final String TV_DB_ZIP_BANNERS = "banners";
    public static final String TV_DB_ZIP_ACTORS = "actors";

    public static final long DAY_IN_SECONDS = 86400;
    public static final long WEEK_IN_SECONDS = 604800;
    public static final long MONTH_IN_SECONDS = 2592000;


    public static final String ZIP_EXTENSION = ".zip";
    public static final String XML_EXTENSION = ".xml";
    public static final String URL_DIVIDER = "/";

    public static final String TVDB_DELIMITER = "|";

}

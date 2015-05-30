package com.achome.snipeshark.service.json;

/**
 * Created by Alex on 5/26/2015.
 */
public interface MediaSourceJSONFactory {
    //Detailed Series info
    String getSeriesById(String seriesId) throws Exception;

    //Skim version of the series
    String getBasicSeriesByName(String seriesName) throws Exception;

    String getFullSeriesById(String seriesId) throws Exception;

    String getEpisodeById(String episodeId) throws Exception;

    String getUpdatesByTimeDiff(long timeDiff) throws Exception;
}

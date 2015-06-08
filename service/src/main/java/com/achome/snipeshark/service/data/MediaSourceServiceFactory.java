package com.achome.snipeshark.service.data;

import com.achome.snipeshark.model.Episode;
import com.achome.snipeshark.model.Series;
import com.achome.snipeshark.model.UpdatedContent;

import java.util.List;

/**
 * Created by Alex on 5/26/2015.
 */
public interface MediaSourceServiceFactory {
    //shared
    List<Series> getBasicSeriesByName(String seriesName);
    Series getSeriesById(String seriesId);


    //tvdb specific
    Series getFullSeriesById(String seriesId);
    Episode getEpisodeById(String episodeId);


    //tmdb specific
    List<Series> getPopularSeries();
    List<Series> getTVPremiere();


    //this is specifically for forced update (if last updated didn,t change - returns null)
    Series getSpecifcSeriesUpdate(long lastUpdated, String seriesId);

    Episode getSpecifcEpisodeUpdate(long lastUpdated, String episodeId);

    //preferred to use daily or weekly - monthly and all are usually not used
    //will only return series that are in the list AND have been updated
    UpdatedContent getUpdatedSince (long timeDiff);

}

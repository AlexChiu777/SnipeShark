package com.achome.snipeshark.service.data;

import com.achome.snipeshark.model.Episode;
import com.achome.snipeshark.model.Series;
import com.achome.snipeshark.model.UpdatedContent;

import java.util.List;

/**
 * Created by Alex on 6/6/2015.
 */
public class TMDBMediaSourceWorker implements MediaSourceServiceFactory {
    @Override
    public List<Series> getBasicSeriesByName(String seriesName) {
        return null;
    }

    @Override
    public Series getSeriesById(String seriesId) {
        return null;
    }

    @Override
    public Series getFullSeriesById(String seriesId) {
        return null;
    }

    @Override
    public Episode getEpisodeById(String episodeId) {
        return null;
    }

    @Override
    public Series getSpecifcSeriesUpdate(long lastUpdated, String seriesId) {
        return null;
    }

    @Override
    public Episode getSpecifcEpisodeUpdate(long lastUpdated, String episodeId) {
        return null;
    }

    @Override
    public UpdatedContent getUpdatedSince(long timeDiff) {
        //not supported
        return null;
    }
}

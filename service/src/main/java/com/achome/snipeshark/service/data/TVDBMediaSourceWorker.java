package com.achome.snipeshark.service.data;


import com.achome.snipeshark.model.Episode;
import com.achome.snipeshark.model.Series;
import com.achome.snipeshark.model.UpdatedContent;
import com.achome.snipeshark.provider.thetvdb.model.TVDBData;
import com.achome.snipeshark.provider.thetvdb.model.TVDBEpisode;
import com.achome.snipeshark.provider.thetvdb.model.TVDBSeries;
import com.achome.snipeshark.provider.thetvdb.service.TVDBProcessor;
import com.achome.snipeshark.provider.thetvdb.translator.TVDBTranslator;

import java.util.ArrayList;
import java.util.List;

/*
        *Created by Alex on 5/26/2015.
*/

public class TVDBMediaSourceWorker implements MediaSourceServiceFactory {
    private TVDBProcessor processor;
    private static final TVDBTranslator translator = new TVDBTranslator();

    public TVDBMediaSourceWorker(String apiKey, String language) {
        processor = new TVDBProcessor(apiKey, language);
    }

    @Override
    public List<Series> getBasicSeriesByName(String seriesName) {
        List<Series> seriesList = null;

        TVDBData basicSeriesData = processor.getTVDBSeriesInfoByName(seriesName);

        if (basicSeriesData != null && basicSeriesData.getSeries().size() > 0) {
            seriesList = new ArrayList<Series>();

            for (TVDBSeries tvdbBasicSeries : basicSeriesData.getSeries()) {
                //for each, we will translate into real series objects and pass it back as a list
                Series series = translator.translateTVDBSeriesToSeries(tvdbBasicSeries);
                if (series != null) {
                    seriesList.add(series);
                }
            }

        }

        return seriesList;
    }

    @Override
    public Series getSeriesById(String seriesId) {
        TVDBData data = processor.getTVDBSeriesInfoById(seriesId);
        return translator.getTranslatedSingleSeries(data);
    }

    @Override
    public Series getFullSeriesById(String seriesId) {
        TVDBData data = processor.getTVDBFullSeriesInfoById(seriesId);
        return translator.getTranslatedSingleSeries(data);
    }

    @Override
    public Episode getEpisodeById(String episodeId) {
        TVDBData data = processor.getTVDBEpisodeInfoById(episodeId);
        return translator.getTranslatedSingleEpisode(data);
    }

    @Override
    public Series getSpecifcSeriesUpdate(long lastUpdated, String seriesId) {
        TVDBData data = processor.getTVDBSeriesInfoById(seriesId);
        if (data != null) {
            TVDBSeries tvdbSeries = data.getSeries().get(0);
            if (tvdbSeries.getLastUpdated() != lastUpdated) {
                return translator.getTranslatedSingleSeries(data);
            }
        }
        return null;
    }

    @Override
    public Episode getSpecifcEpisodeUpdate(long lastUpdated, String episodeId) {
        TVDBData data = processor.getTVDBEpisodeInfoById(episodeId);
        if (data != null) {
            TVDBEpisode tvdbEpisode = data.getEpisodes().get(0);
            if (tvdbEpisode.getLastUpdated() != lastUpdated) {
                return translator.getTranslatedSingleEpisode(data);
            }
        }
        return null;
    }

    @Override
    public UpdatedContent getUpdatedSince(long timeDiff) {
        UpdatedContent updatedContent = new UpdatedContent();

        TVDBData data = processor.getTVDBUpdate(timeDiff);
        for (TVDBSeries tvdbSeries : data.getSeries()) {
            updatedContent.getSeriesList().add(translator.translateTVDBSeriesToSeries(tvdbSeries));
        }

        for (TVDBEpisode tvdbEpisode : data.getEpisodes()) {
            updatedContent.getEpisodeList().add(translator.translateTVDBEpisodeToEpisode(tvdbEpisode));
        }

        return null;
    }
}

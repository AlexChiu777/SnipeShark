package com.achome.snipeshark.service.data;

import com.achome.snipeshark.SSConstants;
import com.achome.snipeshark.model.Episode;
import com.achome.snipeshark.model.Series;
import com.achome.snipeshark.model.UpdatedContent;
import com.achome.snipeshark.provider.tmdb.model.TMDBSeries;
import com.achome.snipeshark.provider.tmdb.service.TMDBProcessor;
import com.achome.snipeshark.provider.tmdb.translator.TMDBTranslator;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Alex on 6/6/2015.
 */
public class TMDBMediaSourceWorker implements MediaSourceServiceFactory {
    private static TMDBProcessor processor = null;
    private static final TMDBTranslator translator = new TMDBTranslator();

    public TMDBMediaSourceWorker (String apiKey) {
        if (processor == null) {
            processor = new TMDBProcessor(apiKey);
        }
    }

    @Override
    public List<Series> getBasicSeriesByName(String seriesName) {
        List<TMDBSeries> tmdbSeriesList = processor.getTMDBTVSeriesByName(seriesName);
        return translator.translateTMDBSeriesList(tmdbSeriesList);
    }

    @Override
    public Series getSeriesById(String seriesId) {
        TMDBSeries tmdbSeries = processor.getTMDBTVSeriesById(seriesId);
        return translator.translateTMDBSeriesIntoSeries(tmdbSeries);
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

    @Override
    public List<Series> getPopularSeries() {
        List<TMDBSeries> tmdbSeriesList = processor.getTMDBTVPopular();
        return translator.translateTMDBSeriesList(tmdbSeriesList);
    }

    @Override
    public List<Series> getTVPremiere() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        List<TMDBSeries> tmdbSeriesList = processor.getTMDBSeriesByFirstAirDate(SSConstants.QUERY_DATE_FORMAT.format(new Date(calendar.getTimeInMillis())));
        return translator.translateTMDBSeriesList(tmdbSeriesList);
    }

    public static void main(String[] args) {
        TMDBMediaSourceWorker worker = new TMDBMediaSourceWorker(SSConstants.TMDB_API_KEY);

        List<Series> seriesList = worker.getTVPremiere();
        System.out.println(seriesList);
    }
}

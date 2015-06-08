package com.achome.snipeshark.provider.tmdb.service;

import com.achome.snipeshark.SSConstants;
import com.achome.snipeshark.provider.tmdb.TMDBConstants;
import com.achome.snipeshark.provider.tmdb.model.TMDBEpisode;
import com.achome.snipeshark.provider.tmdb.model.TMDBSeason;
import com.achome.snipeshark.provider.tmdb.model.TMDBSeries;
import com.achome.snipeshark.provider.tmdb.model.TMDBSeriesWrapper;
import com.achome.snipeshark.util.HttpUtil;
import com.achome.snipeshark.util.JsonUtil;
import com.sun.javafx.fxml.builder.URLBuilder;
import org.codehaus.jackson.map.ObjectMapper;

import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 6/6/2015.
 */
public class TMDBProcessor {
    private String apiKey;

    public TMDBProcessor (String apiKey) {
        this.apiKey = apiKey;
    }

    public List<TMDBSeries> getTMDBTVSeriesByName(String name) {
        String url = TMDBConstants.TMDB_BASE_URL + TMDBConstants.TMDB_TV_SEARCH_TV  + TMDBConstants.TMDB_API_PARAMETER + apiKey + TMDBConstants.TMDB_QUERY_PARAMETER + name;

        String searchResultsJSON = HttpUtil.getInstance().getTwoWayMessage(url);

        TMDBSeriesWrapper wrapper = new JsonUtil<TMDBSeriesWrapper>(TMDBSeriesWrapper.class).getConvertedJSON(searchResultsJSON);

        return wrapper.getResults();
    }

    public TMDBSeries getTMDBTVSeriesById (String id) {
        String url = TMDBConstants.TMDB_BASE_URL + TMDBConstants.TMDB_TV_ID + id + TMDBConstants.TMDB_API_PARAMETER + apiKey;

        String seriesJSON = HttpUtil.getInstance().getTwoWayMessage(url);

        return new JsonUtil<TMDBSeries>(TMDBSeries.class).getConvertedJSON(seriesJSON);
    }

    public TMDBEpisode getTMDBTVEpisode (String seriesId, String seasonNumber, String episodeNumber) {
        String url = TMDBConstants.TMDB_BASE_URL + TMDBConstants.TMDB_TV_ID + seriesId + SSConstants.HTTP_DIVIDER + TMDBConstants.TMDB_SEASON_NUMBER + seasonNumber +
                SSConstants.HTTP_DIVIDER + TMDBConstants.TMDB_EPISODE_NUMBER + episodeNumber;

        String episodeJSON = HttpUtil.getInstance().getTwoWayMessage(url);

        return new JsonUtil<TMDBEpisode>(TMDBEpisode.class).getConvertedJSON(episodeJSON);
    }

    public TMDBSeason getTMDBTVSeason (String seriesId, String seasonNumber) {
        String url = TMDBConstants.TMDB_BASE_URL + TMDBConstants.TMDB_TV_ID + seriesId + SSConstants.HTTP_DIVIDER + TMDBConstants.TMDB_SEASON_NUMBER + seasonNumber;

        String seasonJSON = HttpUtil.getInstance().getTwoWayMessage(url);

        return new JsonUtil<TMDBSeason>(TMDBSeason.class).getConvertedJSON(seasonJSON);
    }

    public List<TMDBSeries> getTMDBTVPopular () {
        String url = TMDBConstants.TMDB_BASE_URL + TMDBConstants.TMDB_TV_POPULAR_URI + TMDBConstants.TMDB_API_PARAMETER + apiKey;

        String popularTVshowJSON = HttpUtil.getInstance().getTwoWayMessage(url);

        //need to convert it to List<TMDBSeries>
        TMDBSeriesWrapper wrapper = new JsonUtil<TMDBSeriesWrapper>(TMDBSeriesWrapper.class).getConvertedJSON(popularTVshowJSON);

        return wrapper.getResults();
    }

    public List<TMDBSeries> getTMDBSeriesByFirstAirDate(String date) { //must be YYYY-MM-DD
        String url = TMDBConstants.TMDB_BASE_URL + TMDBConstants.TMDB_TV_DISCOVER_TV + TMDBConstants.TMDB_API_PARAMETER + apiKey + TMDBConstants.TMDB_TV_SEARCH_AIR_DATE + date;

        String airDateJSON = HttpUtil.getInstance().getTwoWayMessage(url);

        //need to convert it to List<TMDBSeries>
        TMDBSeriesWrapper wrapper = new JsonUtil<TMDBSeriesWrapper>(TMDBSeriesWrapper.class).getConvertedJSON(airDateJSON);

        return wrapper.getResults();
    }













}

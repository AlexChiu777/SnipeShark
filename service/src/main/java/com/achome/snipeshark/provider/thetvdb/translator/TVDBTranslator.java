package com.achome.snipeshark.provider.thetvdb.translator;

import com.achome.snipeshark.SSConstants;
import com.achome.snipeshark.model.*;
import com.achome.snipeshark.provider.thetvdb.TVDBConstants;
import com.achome.snipeshark.provider.thetvdb.model.TVDBData;
import com.achome.snipeshark.provider.thetvdb.model.TVDBEpisode;
import com.achome.snipeshark.provider.thetvdb.model.TVDBSeries;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Alex on 5/27/2015.
 */
public class TVDBTranslator {
    public Series translateTVDBSeriesToSeries(TVDBSeries tvdbSeries) {
        if (tvdbSeries.getOverview() == null || tvdbSeries.getOverview().isEmpty()) {
            return null;
        }

        Series series = new Series();

        Provider provider = new Provider();
        provider.setProviderId(tvdbSeries.getId()); //tvdb id
        provider.setProviderTypeId(SSConstants.PROVIDER_TYPE_TVDB);
        series.setProvider(provider);

        //-1 means null
        series.setAirTime(tvdbSeries.getAirTime() != null ? tvdbSeries.getAirTime().getTime() : 0);
        series.setContentRating(tvdbSeries.getContentRating());
        series.setFirstAired(tvdbSeries.getFirstAired());
        series.setGenreList(tvdbSeries.getGenre());
        series.setFirstAired(tvdbSeries.getFirstAired());
        series.setImdbID(tvdbSeries.getImdb_id());

        series.setAirDayOfWeek(tvdbSeries.getAirsDayOfWeek() != null && !tvdbSeries.getAirsDayOfWeek().isEmpty()
                ? DayOfWeek.valueOf(tvdbSeries.getAirsDayOfWeek().toUpperCase()).getValue() : -1); //convert from MONDAY to integer
        series.setLanguage(tvdbSeries.getLanguage()); //convert
        series.setOverview(tvdbSeries.getOverview());
        series.setRating(tvdbSeries.getRating());
        series.setRuntime(tvdbSeries.getRunTime());
        series.setSeriesName(tvdbSeries.getSeriesName());
        series.setStatus(tvdbSeries.getStatus()); //convert
        series.setLastUpdated(tvdbSeries.getLastUpdated());
        series.setBanner(tvdbSeries.getBanner() != null ? TVDBConstants.TV_DB_BASE_URL + TVDBConstants.TV_DB_BANNERS_URI + tvdbSeries.getBanner() : null);
        series.setFanart(tvdbSeries.getFanart() != null ? TVDBConstants.TV_DB_BASE_URL + TVDBConstants.TV_DB_BANNERS_URI + tvdbSeries.getFanart() : null);
        series.setPoster(tvdbSeries.getPoster() != null ? TVDBConstants.TV_DB_BASE_URL + TVDBConstants.TV_DB_BANNERS_URI + tvdbSeries.getPoster() : null);

        //series.setSeriesID(); --should be auto set later

        TVNetwork network = new TVNetwork();
        network.setNetworkName(tvdbSeries.getNetwork());
        series.setTvNetwork(network);


        return series;
    }

    public List<Season> translateTVDBEpisodeToSeasons(List<TVDBEpisode> tvdbEpisodes) {
        List<Season> seasonList = null;
        HashMap<Integer, Season> seasonHashMap = new HashMap<Integer, Season>();

        for (TVDBEpisode tvdbEpisode : tvdbEpisodes) {
            //episode id generated later
            Episode episode = translateTVDBEpisodeToEpisode(tvdbEpisode);

            //check if season exist in the hashmap
            if (seasonHashMap.get(tvdbEpisode.getSeasonNumber()) != null) {
                seasonHashMap.get(tvdbEpisode.getSeasonNumber()).getEpisodes().add(episode);
            } else {
                Provider seasonProvider = new Provider();
                seasonProvider.setProviderId(tvdbEpisode.getSeasonId());
                seasonProvider.setProviderTypeId(SSConstants.PROVIDER_TYPE_TVDB);

                Season season = new Season();
                season.setProvider(seasonProvider);
                season.setSeasonNumber(tvdbEpisode.getSeasonNumber());
                season.getEpisodes().add(episode);

                seasonHashMap.put(tvdbEpisode.getSeasonNumber(), season);
            }
        }

        if (!seasonHashMap.isEmpty()) {
            seasonList = new ArrayList<Season>();

            for (Integer key : seasonHashMap.keySet()) {
                seasonList.add(seasonHashMap.get(key));
            }
        }

        return seasonList;
    }

    public Episode translateTVDBEpisodeToEpisode(TVDBEpisode tvdbEpisode) {
        //episode id generated later
        Episode episode = new Episode();
        episode.setRating(tvdbEpisode.getRating());
        episode.setAbsoluteNumber(tvdbEpisode.getAbsoluteNumber());
        episode.setGuestStars(tvdbEpisode.getGuestStars());
        episode.setAirBeforeSeason(tvdbEpisode.getAirBeforeSeason());
        episode.setImdbId(tvdbEpisode.getImdbId());
        episode.setEpisodeName(tvdbEpisode.getEpisodeName());
        episode.setEpisodeNumber(tvdbEpisode.getEpisodeNumber());
        episode.setRatingCount(tvdbEpisode.getRatingCount());
        episode.setLanguage(tvdbEpisode.getLanguage());
        episode.setFirstAired(tvdbEpisode.getFirstAired());
        episode.setLastUpdated(tvdbEpisode.getLastUpdated());
        episode.setImage(episode.getImage() != null ? TVDBConstants.TV_DB_BASE_URL + TVDBConstants.TV_DB_BANNERS_URI + tvdbEpisode.getFilename() : null);

        Provider provider = new Provider();
        provider.setProviderTypeId(SSConstants.PROVIDER_TYPE_TVDB);
        provider.setProviderId(tvdbEpisode.getId());

        episode.setProvider(provider);

        episode.setSeasonId(tvdbEpisode.getSeasonId());
        episode.setSeriesId(tvdbEpisode.getSeriesId());

        return episode;
    }

    public Series getTranslatedSingleSeries(TVDBData data) {
        Series series = null;
        if (data != null && data.getSeries().size() > 0) {
            series = translateTVDBSeriesToSeries(data.getSeries().get(0));

            if (series != null) {
                if (data.getEpisodes() != null && data.getEpisodes().size() > 0) {
                    series.setSeasons(translateTVDBEpisodeToSeasons(data.getEpisodes()));
                }
            }
        }

        return series;
    }

    public Episode getTranslatedSingleEpisode(TVDBData data) {
        Episode episode = null;
        if (data != null && data.getEpisodes().size() > 0) {
            episode = translateTVDBEpisodeToEpisode(data.getEpisodes().get(0));
        }

        return episode;
    }
}


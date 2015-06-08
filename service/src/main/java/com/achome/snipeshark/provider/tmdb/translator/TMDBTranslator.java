package com.achome.snipeshark.provider.tmdb.translator;

import com.achome.snipeshark.SSConstants;
import com.achome.snipeshark.model.Provider;
import com.achome.snipeshark.model.Season;
import com.achome.snipeshark.model.Series;
import com.achome.snipeshark.model.TVNetwork;
import com.achome.snipeshark.provider.tmdb.TMDBConstants;
import com.achome.snipeshark.provider.tmdb.model.TMDBGenre;
import com.achome.snipeshark.provider.tmdb.model.TMDBNetwork;
import com.achome.snipeshark.provider.tmdb.model.TMDBSeason;
import com.achome.snipeshark.provider.tmdb.model.TMDBSeries;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Alex on 6/7/2015.
 */
public class TMDBTranslator {
    public Series translateTMDBSeriesIntoSeries(TMDBSeries tmdbSeries) {
        Series series = new Series();

        Provider provider = new Provider();
        provider.setProviderTypeId(SSConstants.PROVIDER_TYPE_TMDB);
        provider.setProviderId(tmdbSeries.getId());

        series.setProvider(provider);
        series.setFirstAired(tmdbSeries.getFirst_air_date());
        series.setOverview(tmdbSeries.getOverview());

        //get air day of week
        if (tmdbSeries.getLast_air_date() != null) {
            Calendar c = Calendar.getInstance();
            c.setTime(tmdbSeries.getLast_air_date());
            series.setAirDayOfWeek(c.get(Calendar.DAY_OF_WEEK));
        }

        series.setSeriesName(tmdbSeries.getName());
        series.setUrl(tmdbSeries.getHomepage());
        series.setAirTime(tmdbSeries.getEpisode_run_time() != null && tmdbSeries.getEpisode_run_time().size() > 0 ? tmdbSeries.getEpisode_run_time().get(0).longValue() : 0L);
        series.setContentRating(String.valueOf(tmdbSeries.getPopularity()));

        if (tmdbSeries.getGenres() != null && tmdbSeries.getGenres().size() > 0) {
            List genreList = new ArrayList();
            for (TMDBGenre genre : tmdbSeries.getGenres()) {
                genreList.add(genre.getName());
            }
            series.setGenreList(genreList);
        }

        series.setFanart(tmdbSeries.getBackdrop_path() != null ? TMDBConstants.TMDB_IMAGE_BASE_URL + TMDBConstants.TMDB_BACK_DROP_URI + tmdbSeries.getBackdrop_path() : null);
        series.setPoster(tmdbSeries.getPoster_path() != null ? TMDBConstants.TMDB_IMAGE_BASE_URL + TMDBConstants.TMDB_POSTER_URI + tmdbSeries.getPoster_path() : null);

        series.setRating(tmdbSeries.getVote_average());
        series.setRatingCount(tmdbSeries.getVote_count());
        series.setLanguage(tmdbSeries.getOriginal_language());
        series.setLastUpdated(new Date().getTime());
        series.setStatus(tmdbSeries.getStatus());

        if (tmdbSeries.getSeasons() != null && tmdbSeries.getSeasons().size() > 0) {
            List<Season> seasonList = new ArrayList<Season>();

            for (TMDBSeason tmdbSeason : tmdbSeries.getSeasons()) {
                seasonList.add(convertTMDBSeasonToSeason(tmdbSeason));
            }
            series.setSeasons(seasonList);
        }

        if (tmdbSeries.getNetworks() != null && tmdbSeries.getNetworks().size() > 0) {
            List<TVNetwork> networkList = new ArrayList<TVNetwork>();

            for (TMDBNetwork network : tmdbSeries.getNetworks()) {
                TVNetwork tvNetwork = convertTMDBNetworkToTVNetwork(network);
                networkList.add(tvNetwork);
            }
            series.setTvNetworks(networkList);
        }

        return series;
    }

    public List<Series> translateTMDBSeriesList(List<TMDBSeries> tmdbSeriesList) {
        List<Series> seriesList = new ArrayList<Series>();
        if (tmdbSeriesList != null && tmdbSeriesList.size() > 0) {
            for (TMDBSeries tmdbSeries : tmdbSeriesList) {
                seriesList.add(translateTMDBSeriesIntoSeries(tmdbSeries));
            }
        }
        return seriesList;
    }

    private TVNetwork convertTMDBNetworkToTVNetwork(TMDBNetwork network) {
        TVNetwork tvNetwork = new TVNetwork();
        tvNetwork.setNetworkName(network.getName());
        return tvNetwork;
    }

    private Season convertTMDBSeasonToSeason(TMDBSeason tmdbSeason) {
        Season season = new Season();
        season.setAir_date(tmdbSeason.getAir_date());
        season.setEpisodeCount(tmdbSeason.getEpisode_count());
        season.setOverview(tmdbSeason.getOverview());
        season.setPosterPath(tmdbSeason.getBackdrop_path() != null ? TMDBConstants.TMDB_IMAGE_BASE_URL + TMDBConstants.TMDB_BACK_DROP_URI + tmdbSeason.getBackdrop_path() : null);
        season.setFanartPath(tmdbSeason.getPoster_path() != null ? TMDBConstants.TMDB_IMAGE_BASE_URL + TMDBConstants.TMDB_POSTER_URI + tmdbSeason.getPoster_path() : null);

        Provider seasonProvider = new Provider();
        seasonProvider.setProviderId(tmdbSeason.getId());
        seasonProvider.setProviderTypeId(SSConstants.PROVIDER_TYPE_TMDB);

        season.setProvider(seasonProvider);
        season.setSeasonNumber(tmdbSeason.getSeason_number());

        return season;
    }

}

package com.achome.snipeshark.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 5/27/2015.
 */
public class Season {
    private Series series;
    private int seasonNumber;
    private int episodeCount;
    private Date air_date;
    private String name;
    private String fanartPath;
    private String posterPath;
    private String overview;

    private List<Episode> episodes = new ArrayList<Episode>();
    private Provider provider;

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public int getEpisodeCount() {
        return episodeCount;
    }

    public void setEpisodeCount(int episodeCount) {
        this.episodeCount = episodeCount;
    }

    public Date getAir_date() {
        return air_date;
    }

    public void setAir_date(Date air_date) {
        this.air_date = air_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFanartPath() {
        return fanartPath;
    }

    public void setFanartPath(String fanartPath) {
        this.fanartPath = fanartPath;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}

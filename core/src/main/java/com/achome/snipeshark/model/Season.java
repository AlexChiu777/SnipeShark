package com.achome.snipeshark.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 5/27/2015.
 */
public class Season {
    private Series series;
    private int seasonNumber;
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
}

package com.achome.snipeshark.provider.tmdb.model;

import com.achome.snipeshark.provider.tmdb.model.advanced.CommonTMDBData;

import java.sql.Date;
import java.util.List;

/**
 * Created by Alex on 6/6/2015.
 */
public class TMDBSeason extends CommonTMDBData {
    private Date air_date;
    private int episode_count;
    private int season_number;
    private List<TMDBEpisode> episodes;
    private String name;

    public Date getAir_date() {
        return air_date;
    }

    public void setAir_date(Date air_date) {
        this.air_date = air_date;
    }

    public int getEpisode_count() {
        return episode_count;
    }

    public void setEpisode_count(int episode_count) {
        this.episode_count = episode_count;
    }
    public int getSeason_number() {
        return season_number;
    }

    public void setSeason_number(int season_number) {
        this.season_number = season_number;
    }

    public List<TMDBEpisode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<TMDBEpisode> episodes) {
        this.episodes = episodes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

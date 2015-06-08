package com.achome.snipeshark.provider.tmdb.model;

import com.achome.snipeshark.provider.tmdb.model.advanced.CommonTMDBData;

import java.sql.Date;
import java.util.List;

/**
 * Created by Alex on 6/6/2015.
 */
public class TMDBEpisode extends CommonTMDBData {
    private String production_code;
    private int season_number;
    private String still_path;
    private int episode_number;
    private Date air_date;
    private List<TMDBPeople> guest_stars;
    private List<TMDBPeople> crew;

    public String getProduction_code() {
        return production_code;
    }

    public void setProduction_code(String production_code) {
        this.production_code = production_code;
    }

    public int getSeason_number() {
        return season_number;
    }

    public void setSeason_number(int season_number) {
        this.season_number = season_number;
    }

    public String getStill_path() {
        return still_path;
    }

    public void setStill_path(String still_path) {
        this.still_path = still_path;
    }

    public int getEpisode_number() {
        return episode_number;
    }

    public void setEpisode_number(int episode_number) {
        this.episode_number = episode_number;
    }

    public List<TMDBPeople> getGuest_stars() {
        return guest_stars;
    }

    public void setGuest_stars(List<TMDBPeople> guest_stars) {
        this.guest_stars = guest_stars;
    }

    public List<TMDBPeople> getCrew() {
        return crew;
    }

    public void setCrew(List<TMDBPeople> crew) {
        this.crew = crew;
    }

    public Date getAir_date() {
        return air_date;
    }

    public void setAir_date(Date air_date) {
        this.air_date = air_date;
    }
}

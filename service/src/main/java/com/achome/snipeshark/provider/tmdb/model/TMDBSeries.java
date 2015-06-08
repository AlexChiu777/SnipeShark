package com.achome.snipeshark.provider.tmdb.model;

import com.achome.snipeshark.provider.tmdb.model.advanced.CommonTMDBData;

import java.sql.Date;
import java.util.List;

/**
 * Created by Alex on 6/6/2015.
 */

public class TMDBSeries extends CommonTMDBData {
    //for popular, top rated, airing today, on the air
    private String original_name;
    private Date first_air_date;
    private Date last_air_date;
    private float popularity;
    private List<String> origin_country;
    private List<String> created_by;
    private List<Float> episode_run_time;
    private List<TMDBGenre> genres;
    private String homepage;
    private boolean in_production;
    private List<String> languages;
    private List<TMDBNetwork> networks;
    private int number_of_episodes;
    private int number_of_seasons;
    private List<TMDBProductionCompany> production_companies;
    private String type;
    private String status;
    private List<TMDBSeason> seasons;

    public String getOriginal_name() {
        return original_name;
    }

    public void setOriginal_name(String original_name) {
        this.original_name = original_name;
    }

    public Date getFirst_air_date() {
        return first_air_date;
    }

    public void setFirst_air_date(Date first_air_date) {
        this.first_air_date = first_air_date;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public List<String> getOrigin_country() {
        return origin_country;
    }

    public void setOrigin_country(List<String> origin_country) {
        this.origin_country = origin_country;
    }

    public List<String> getCreated_by() {
        return created_by;
    }

    public void setCreated_by(List<String> created_by) {
        this.created_by = created_by;
    }

    public List<Float> getEpisode_run_time() {
        return episode_run_time;
    }

    public void setEpisode_run_time(List<Float> episode_run_time) {
        this.episode_run_time = episode_run_time;
    }

    public List<TMDBGenre> getGenres() {
        return genres;
    }

    public void setGenres(List<TMDBGenre> genres) {
        this.genres = genres;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public boolean isIn_production() {
        return in_production;
    }

    public void setIn_production(boolean in_production) {
        this.in_production = in_production;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<TMDBNetwork> getNetworks() {
        return networks;
    }

    public void setNetworks(List<TMDBNetwork> networks) {
        this.networks = networks;
    }

    public int getNumber_of_episodes() {
        return number_of_episodes;
    }

    public void setNumber_of_episodes(int number_of_episodes) {
        this.number_of_episodes = number_of_episodes;
    }

    public int getNumber_of_seasons() {
        return number_of_seasons;
    }

    public void setNumber_of_seasons(int number_of_seasons) {
        this.number_of_seasons = number_of_seasons;
    }

    public List<TMDBProductionCompany> getProduction_companies() {
        return production_companies;
    }

    public void setProduction_companies(List<TMDBProductionCompany> production_companies) {
        this.production_companies = production_companies;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<TMDBSeason> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<TMDBSeason> seasons) {
        this.seasons = seasons;
    }

    public Date getLast_air_date() {
        return last_air_date;
    }

    public void setLast_air_date(Date last_air_date) {
        this.last_air_date = last_air_date;
    }
}

package com.achome.snipeshark.model;

import java.util.Date;
import java.util.List;

/**
 * Created by Alex on 5/27/2015.
 */
public class Series {
    private long seriesID;

    private String seriesName;

    private int airDayOfWeek;

    private long airTime;

    private String contentRating;

    private Date firstAired;

    private List<String> genreList;

    private String imdbID;

    private String language;

    private TVNetwork tvNetwork;

    private String overview;

    private float rating;

    private int ratingCount;

    private int runtime;

    private String status;

    private List<Season> seasons;

    private Provider provider;

    private long lastUpdated;

    private String banner;

    private String fanart;

    private String poster;

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getFanart() {
        return fanart;
    }

    public void setFanart(String fanart) {
        this.fanart = fanart;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public long getSeriesID() {
        return seriesID;
    }

    public void setSeriesID(long seriesID) {
        this.seriesID = seriesID;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public int getAirDayOfWeek() {
        return airDayOfWeek;
    }

    public void setAirDayOfWeek(int airDayOfWeek) {
        this.airDayOfWeek = airDayOfWeek;
    }

    public long getAirTime() {
        return airTime;
    }

    public void setAirTime(long airTime) {
        this.airTime = airTime;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public Date getFirstAired() {
        return firstAired;
    }

    public void setFirstAired(Date firstAired) {
        this.firstAired = firstAired;
    }

    public List<String> getGenreList() {
        return genreList;
    }

    public void setGenreList(List<String> genreList) {
        this.genreList = genreList;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public TVNetwork getTvNetwork() {
        return tvNetwork;
    }

    public void setTvNetwork(TVNetwork tvNetwork) {
        this.tvNetwork = tvNetwork;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}

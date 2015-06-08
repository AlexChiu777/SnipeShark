package com.achome.snipeshark.provider.tmdb.model;

import com.achome.snipeshark.provider.tmdb.model.advanced.CommonTMDBData;

import java.util.Date;
import java.util.List;

/**
 * Created by Alex on 6/6/2015.
 */
public class TMDBMovie extends CommonTMDBData {
    private boolean adult;
    private Date release_date;
    private String original_title;
    private String title;
    private List<Integer> genre_ids;
    private float popularity;
    private boolean video;

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Integer> getGenre_ids() {
        return genre_ids;
    }

    public void setGenre_ids(List<Integer> genre_ids) {
        this.genre_ids = genre_ids;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }
}

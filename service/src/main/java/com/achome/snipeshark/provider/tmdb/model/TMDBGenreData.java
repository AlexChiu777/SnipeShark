package com.achome.snipeshark.provider.tmdb.model;

/**
 * Created by Alex on 6/6/2015.
 */
public class TMDBGenreData {
    //movie and tv show uses the same format
    //pull once in a while to update or when we get an unkown genre

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

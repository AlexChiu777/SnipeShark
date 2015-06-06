package com.achome.snipeshark.provider.tmdb.model;

import java.util.List;

/**
 * Created by Alex on 6/6/2015.
 */
public class TMDBSeriesWrapper {
    private int page;
    private List<TMDBSeries> results;
    private int total_pages;
    private int total_results;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<TMDBSeries> getResults() {
        return results;
    }

    public void setResults(List<TMDBSeries> results) {
        this.results = results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }
}

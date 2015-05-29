package com.snipeshark.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 5/27/2015.
 */
//general update class used to fetch all new updates
public class UpdatedContent {
    private List<Series> seriesList = new ArrayList<Series>();
    private List<Episode> episodeList = new ArrayList<Episode>();

    //no banner support atm
    //not going to add it

    public List<Series> getSeriesList() {
        return seriesList;
    }

    public void setSeriesList(List<Series> seriesList) {
        this.seriesList = seriesList;
    }

    public List<Episode> getEpisodeList() {
        return episodeList;
    }

    public void setEpisodeList(List<Episode> episodeList) {
        this.episodeList = episodeList;
    }
}

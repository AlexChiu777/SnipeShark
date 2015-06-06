package com.achome.snipeshark.provider.tmdb.model;

import javax.xml.bind.annotation.XmlElement;
import java.sql.Date;
import java.util.List;

/**
 * Created by Alex on 6/6/2015.
 */

public class TMDBSeries extends CommonTMDBData{
    //for popular, top rated, airing today, on the air
    private String original_name;
    private Date first_air_date;
    private float popularity;
    private String name;
    private List<String> origin_country;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getOrigin_country() {
        return origin_country;
    }

    public void setOrigin_country(List<String> origin_country) {
        this.origin_country = origin_country;
    }
}

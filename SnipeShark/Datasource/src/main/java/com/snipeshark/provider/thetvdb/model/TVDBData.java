package com.snipeshark.provider.thetvdb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Alex on 5/24/2015.
 */

@XmlRootElement(name = "data")
@XmlAccessorType(XmlAccessType.FIELD)
public class TVDBData {
    @XmlElement(name="series")
    private List<TVDBSeries> series;

    public List<TVDBSeries> getSeries() {
        return series;
    }

    public void setSeries(List<TVDBSeries> series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "TVDBData{" +
                "series=" + series +
                '}';
    }
}

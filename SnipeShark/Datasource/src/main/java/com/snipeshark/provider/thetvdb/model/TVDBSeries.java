package com.snipeshark.provider.thetvdb.model;

import com.snipeshark.entity.Actor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Alex on 5/24/2015.
*/
@XmlRootElement(name="series")
@XmlAccessorType(XmlAccessType.FIELD)
public class TVDBSeries {
    @XmlElement(name="id")
    public long id;

    @XmlElement(name="actors")
    public String actors;

    @XmlElement(name="airs_dayofweek")
    public String airsDayOfWeek;

    @XmlElement(name="airs_time")
    public String airTime;

    @XmlElement(name="contentrating")
    public String contentRating;

    @XmlElement(name="firstaired")
    public String firstAired;

    @XmlElement(name="genre")
    public String genre;

    @XmlElement(name="imdb_id")
    public String imdb_id;

    @XmlElement(name="language")
    public String language;

    @XmlElement(name="network")
    public String network;

    @XmlElement(name="networkId")
    public String networkId;

    @XmlElement(name="overview")
    public String overview;

    @XmlElement(name="rating")
    public double rating;

    @XmlElement(name="ratingcount")
    public int ratingCount;

    @XmlElement(name="runtime")
    public int runTime;

    @XmlElement(name="seriesid")
    public long seriesId;

    @XmlElement(name="seriesname")
    public String seriesName;

    @XmlElement(name="status")
    public String status;

    @XmlElement(name="added")
    public String added;

    @XmlElement(name="addedby")
    public String addedBy;

    @XmlElement(name="zap2it_id")
    public String zap2itId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getAirsDayOfWeek() {
        return airsDayOfWeek;
    }

    public void setAirsDayOfWeek(String airsDayOfWeek) {
        this.airsDayOfWeek = airsDayOfWeek;
    }

    public String getAirTime() {
        return airTime;
    }

    public void setAirTime(String airTime) {
        this.airTime = airTime;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public String getFirstAired() {
        return firstAired;
    }

    public void setFirstAired(String firstAired) {
        this.firstAired = firstAired;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public long getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(long seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAdded() {
        return added;
    }

    public void setAdded(String added) {
        this.added = added;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public String getZap2itId() {
        return zap2itId;
    }

    public void setZap2itId(String zap2itId) {
        this.zap2itId = zap2itId;
    }

    @Override
    public String toString() {
        return "TVDBSeries{" +
                "id=" + id +
                ", actors='" + actors + '\'' +
                ", airsDayOfWeek='" + airsDayOfWeek + '\'' +
                ", airTime='" + airTime + '\'' +
                ", contentRating='" + contentRating + '\'' +
                ", firstAired='" + firstAired + '\'' +
                ", genre='" + genre + '\'' +
                ", imdb_id='" + imdb_id + '\'' +
                ", language='" + language + '\'' +
                ", network='" + network + '\'' +
                ", networkId='" + networkId + '\'' +
                ", overview='" + overview + '\'' +
                ", rating=" + rating +
                ", ratingCount=" + ratingCount +
                ", runTime=" + runTime +
                ", seriesId=" + seriesId +
                ", seriesName='" + seriesName + '\'' +
                ", status='" + status + '\'' +
                ", added='" + added + '\'' +
                ", addedBy='" + addedBy + '\'' +
                ", zap2itId='" + zap2itId + '\'' +
                '}';
    }
}

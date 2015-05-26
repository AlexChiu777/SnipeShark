package com.snipeshark.provider.thetvdb.model;

import com.snipeshark.entity.Actor;
import com.snipeshark.provider.thetvdb.model.adapter.AddedTimestampAdapter;
import com.snipeshark.provider.thetvdb.model.adapter.AirTimeAdapter;
import com.snipeshark.provider.thetvdb.model.adapter.FirstAiredAdapter;
import com.snipeshark.provider.thetvdb.model.adapter.StringListAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
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
    @XmlJavaTypeAdapter(StringListAdapter.class)
    public List<String> actors;

    @XmlElement(name="airs_dayofweek")
    public String airsDayOfWeek;

    @XmlElement(name="airs_time")
    @XmlJavaTypeAdapter(AirTimeAdapter.class)
    public Date airTime;

    @XmlElement(name="contentrating")
    public String contentRating;

    @XmlElement(name="firstaired")
    @XmlJavaTypeAdapter(FirstAiredAdapter.class)
    public Date firstAired;

    @XmlElement(name="genre")
    @XmlJavaTypeAdapter(StringListAdapter.class)
    public List<String> genre;

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
    @XmlJavaTypeAdapter(AddedTimestampAdapter.class)
    public Date added;

    @XmlElement(name="addedby")
    public String addedBy;

    @XmlElement(name="banner")
    private String banner;

    @XmlElement(name="fanart")
    private String fanart;

    @XmlElement(name="lastupdated")
    private long lastUpdated;

    @XmlElement(name="poster")
    private String poster;

    @XmlElement(name="zap2it_id")
    public String zap2itId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public Date getAirTime() {
        return airTime;
    }

    public void setAirTime(Date airTime) {
        this.airTime = airTime;
    }

    public Date getFirstAired() {
        return firstAired;
    }

    public void setFirstAired(Date firstAired) {
        this.firstAired = firstAired;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public Date getAdded() {
        return added;
    }

    public void setAdded(Date added) {
        this.added = added;
    }

    public String getAirsDayOfWeek() {
        return airsDayOfWeek;
    }

    public void setAirsDayOfWeek(String airsDayOfWeek) {
        this.airsDayOfWeek = airsDayOfWeek;
    }


    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
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

    public long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    @Override
    public String toString() {
        return "TVDBSeries{" +
                "id=" + id +
                ", actors=" + actors +
                ", airsDayOfWeek='" + airsDayOfWeek + '\'' +
                ", airTime=" + airTime +
                ", contentRating='" + contentRating + '\'' +
                ", firstAired=" + firstAired +
                ", genre=" + genre +
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
                ", added=" + added +
                ", addedBy='" + addedBy + '\'' +
                ", banner='" + banner + '\'' +
                ", fanart='" + fanart + '\'' +
                ", lastUpdated=" + lastUpdated +
                ", poster='" + poster + '\'' +
                ", zap2itId='" + zap2itId + '\'' +
                '}';
    }
}

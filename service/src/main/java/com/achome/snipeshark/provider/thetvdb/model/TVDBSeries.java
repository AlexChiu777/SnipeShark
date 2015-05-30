package com.achome.snipeshark.provider.thetvdb.model;


import com.achome.snipeshark.provider.thetvdb.model.adapter.FirstAiredAdapter;
import com.achome.snipeshark.provider.thetvdb.model.adapter.StringListAdapter;
import com.achome.snipeshark.provider.thetvdb.model.adapter.AddedTimestampAdapter;
import com.achome.snipeshark.provider.thetvdb.model.adapter.AirTimeAdapter;
import com.achome.snipeshark.provider.thetvdb.model.adapter.FirstAiredAdapter;
import com.achome.snipeshark.provider.thetvdb.model.adapter.StringListAdapter;

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
    private long id;

    @XmlElement(name="actors")
    @XmlJavaTypeAdapter(StringListAdapter.class)
    private List<String> actors;

    @XmlElement(name="airs_dayofweek")
    private String airsDayOfWeek;

    @XmlElement(name="airs_time")
    @XmlJavaTypeAdapter(AirTimeAdapter.class)
    private Date airTime;

    @XmlElement(name="contentrating")
    private String contentRating;

    @XmlElement(name="firstaired")
    @XmlJavaTypeAdapter(FirstAiredAdapter.class)
    private Date firstAired;

    @XmlElement(name="genre")
    @XmlJavaTypeAdapter(StringListAdapter.class)
    private List<String> genre;

    @XmlElement(name="imdb_id")
    private String imdb_id;

    @XmlElement(name="language")
    private String language;

    @XmlElement(name="network")
    private String network;

    @XmlElement(name="networkId")
    private String networkId;

    @XmlElement(name="overview")
    private String overview;

    @XmlElement(name="rating")
    private float rating;

    @XmlElement(name="ratingcount")
    private int ratingCount;

    @XmlElement(name="runtime")
    private int runTime;

    //deprecated, don't use~~
    @XmlElement(name="seriesid")
    private long seriesId;

    @XmlElement(name="seriesname")
    private String seriesName;

    @XmlElement(name="status")
    private String status;

    @XmlElement(name="added")
    @XmlJavaTypeAdapter(AddedTimestampAdapter.class)
    private Date added;

    @XmlElement(name="addedby")
    private String addedBy;

    @XmlElement(name="banner")
    private String banner;

    @XmlElement(name="fanart")
    private String fanart;

    @XmlElement(name="lastupdated")
    private long lastUpdated;

    @XmlElement(name="poster")
    private String poster;

    @XmlElement(name="zap2it_id")
    private String zap2itId;

    @XmlElement(name="time")
    private long time;

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

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
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
                ", time=" + time +
                '}';
    }
}

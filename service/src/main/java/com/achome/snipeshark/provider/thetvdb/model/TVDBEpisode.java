package com.achome.snipeshark.provider.thetvdb.model;

import com.achome.snipeshark.provider.thetvdb.model.adapter.FirstAiredAdapter;
import com.achome.snipeshark.provider.thetvdb.model.adapter.StringListAdapter;
import com.achome.snipeshark.provider.thetvdb.model.adapter.AddedTimestampAdapter;
import com.achome.snipeshark.provider.thetvdb.model.adapter.FirstAiredAdapter;
import com.achome.snipeshark.provider.thetvdb.model.adapter.StringListAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.sql.Date;
import java.util.List;

/**
 * Created by Alex on 5/25/2015.
 */
@XmlRootElement(name="episode")
@XmlAccessorType(XmlAccessType.FIELD)
public class TVDBEpisode {
    @XmlElement(name="id")
    private long id;

    @XmlElement(name="combined_episodenumber")
    private int combinedEpisodeNumber;

    @XmlElement(name="dvd_chapter")
    private int DVD_chapter;

    @XmlElement(name="dvd_discid")
    private int DVD_discid;

    @XmlElement(name="dvd_episodenumber")
    private float DVD_episodeNumber;

    @XmlElement(name="dvd_season")
    private int DVD_season;

    @XmlElement(name="director")
    private String director;

    @XmlElement(name="epimgflag")
    private int epImgFlag;

    @XmlElement(name="episodename")
    private String episodeName;

    @XmlElement(name="episodenumber")
    private int episodeNumber;

    @XmlElement(name="firstaired")
    @XmlJavaTypeAdapter(FirstAiredAdapter.class)
    private Date firstAired;

    @XmlElement(name="gueststars")
    @XmlJavaTypeAdapter(StringListAdapter.class)
    private List<String> guestStars;

    @XmlElement(name="imdb_id")
    private String imdbId;

    @XmlElement(name="language")
    private String language;

    @XmlElement(name="overview")
    private String overview;

    @XmlElement(name="productioncode")
    private String productionCode;

    @XmlElement(name="rating")
    private float rating;

    @XmlElement(name="ratingcount")
    private int ratingCount;

    @XmlElement(name="seasonnumber")
    private int seasonNumber;

    @XmlElement(name="writer")
    @XmlJavaTypeAdapter(StringListAdapter.class)
    private List<String> writer;

    @XmlElement(name="absolute_number")
    private int absoluteNumber;

    @XmlElement(name="airsafter_season")
    private int airsAfterSeason;

    @XmlElement(name="airsbefore_episode")
    private float airsBeforeEpisode;

    @XmlElement(name="airsbefore_season")
    private int airBeforeSeason;

    @XmlElement(name="filename")
    private String filename;

    @XmlElement(name="lastupdated")
    private long lastUpdated;

    @XmlElement(name="seasonid")
    private long seasonId;

    @XmlElement(name="seriesid")
    private long seriesId;

    @XmlElement(name="thumb_added")
    @XmlJavaTypeAdapter(AddedTimestampAdapter.class)
    private Date thumbAdded;

    @XmlElement(name="thumb_height")
    private int thumbHeight;

    @XmlElement(name="thumb_width")
    private int thumbWidth;

    @XmlElement(name="series")
    private long series;

    @XmlElement(name="time")
    private long time;

    public long getSeries() {
        return series;
    }

    public void setSeries(long series) {
        this.series = series;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCombinedEpisodeNumber() {
        return combinedEpisodeNumber;
    }

    public void setCombinedEpisodeNumber(int combinedEpisodeNumber) {
        this.combinedEpisodeNumber = combinedEpisodeNumber;
    }

    public int getDVD_chapter() {
        return DVD_chapter;
    }

    public void setDVD_chapter(int DVD_chapter) {
        this.DVD_chapter = DVD_chapter;
    }

    public int getDVD_discid() {
        return DVD_discid;
    }

    public void setDVD_discid(int DVD_discid) {
        this.DVD_discid = DVD_discid;
    }

    public float getDVD_episodeNumber() {
        return DVD_episodeNumber;
    }

    public void setDVD_episodeNumber(float DVD_episodeNumber) {
        this.DVD_episodeNumber = DVD_episodeNumber;
    }

    public int getDVD_season() {
        return DVD_season;
    }

    public void setDVD_season(int DVD_season) {
        this.DVD_season = DVD_season;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEpImgFlag() {
        return epImgFlag;
    }

    public void setEpImgFlag(int epImgFlag) {
        this.epImgFlag = epImgFlag;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public List<String> getGuestStars() {
        return guestStars;
    }

    public void setGuestStars(List<String> guestStars) {
        this.guestStars = guestStars;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getProductionCode() {
        return productionCode;
    }

    public void setProductionCode(String productionCode) {
        this.productionCode = productionCode;
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

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public List<String> getWriter() {
        return writer;
    }

    public void setWriter(List<String> writer) {
        this.writer = writer;
    }

    public int getAbsoluteNumber() {
        return absoluteNumber;
    }

    public void setAbsoluteNumber(int absoluteNumber) {
        this.absoluteNumber = absoluteNumber;
    }

    public int getAirsAfterSeason() {
        return airsAfterSeason;
    }

    public void setAirsAfterSeason(int airsAfterSeason) {
        this.airsAfterSeason = airsAfterSeason;
    }

    public float getAirsBeforeEpisode() {
        return airsBeforeEpisode;
    }

    public void setAirsBeforeEpisode(float airsBeforeEpisode) {
        this.airsBeforeEpisode = airsBeforeEpisode;
    }

    public int getAirBeforeSeason() {
        return airBeforeSeason;
    }

    public void setAirBeforeSeason(int airBeforeSeason) {
        this.airBeforeSeason = airBeforeSeason;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public long getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(long seasonId) {
        this.seasonId = seasonId;
    }

    public long getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(long seriesId) {
        this.seriesId = seriesId;
    }

    public Date getFirstAired() {
        return firstAired;
    }

    public void setFirstAired(Date firstAired) {
        this.firstAired = firstAired;
    }

    public Date getThumbAdded() {
        return thumbAdded;
    }

    public void setThumbAdded(Date thumbAdded) {
        this.thumbAdded = thumbAdded;
    }

    public int getThumbHeight() {
        return thumbHeight;
    }

    public void setThumbHeight(int thumbHeight) {
        this.thumbHeight = thumbHeight;
    }

    public int getThumbWidth() {
        return thumbWidth;
    }

    public void setThumbWidth(int thumbWidth) {
        this.thumbWidth = thumbWidth;
    }


}

package com.achome.snipeshark.data.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Access(AccessType.FIELD)
@Table(name = "EPISODE", uniqueConstraints = @UniqueConstraint(columnNames = {"PROVIDER_ID", "PROVIDER"}))
public class Episode extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EPISODE_ID")
    private long episodeID;

    @Column(name = "EPISODE_NAME")
    private String episodeName;

    @Column(name = "EPISODE_NUMBER")
    private int episodeNumber;

    @Column(name = "FIRST_AIRED")
    private Date firstAired;

    @Column(name = "IMDB_ID")
    private String imdbId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="LANGUAGE_ID")
    private Language language;

    @Column(name = "RATING")
    private float rating;

    @Column(name = "RATING_COUNT")
    private long ratingCount;

    @Column(name = "SEASON_NUMBER")
    private int seasonNumber;

    @Column(name = "ABSOLUTE_NUMBER")
    private int absoluteNumber;

    @Column(name = "AIR_BEFORE_SEASON")
    private int airBeforeSeason;

    @Column(name = "LAST_UPDATED_DATE")
    private Date lastUpdated;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="EPISODE_ACTOR", joinColumns = @JoinColumn(name="EPISODE_ID"),
            inverseJoinColumns = @JoinColumn(name="ACTOR_ID"))
    private List<Actor> actorList;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumns({@JoinColumn(name="SEASON_ID"), @JoinColumn(name="SERIES_ID")})
    private Season season;

    public List<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(List<Actor> actorList) {
        this.actorList = actorList;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public long getEpisodeID() {
        return episodeID;
    }

    public void setEpisodeID(long episodeID) {
        this.episodeID = episodeID;
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

    public Date getFirstAired() {
        return firstAired;
    }

    public void setFirstAired(Date firstAired) {
        this.firstAired = firstAired;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public long getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(long ratingCount) {
        this.ratingCount = ratingCount;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public int getAbsoluteNumber() {
        return absoluteNumber;
    }

    public void setAbsoluteNumber(int absoluteNumber) {
        this.absoluteNumber = absoluteNumber;
    }

    public int getAirBeforeSeason() {
        return airBeforeSeason;
    }

    public void setAirBeforeSeason(int airBeforeSeason) {
        this.airBeforeSeason = airBeforeSeason;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


}

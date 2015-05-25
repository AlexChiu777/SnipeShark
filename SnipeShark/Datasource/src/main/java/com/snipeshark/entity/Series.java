package com.snipeshark.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Access(AccessType.FIELD)
@Table(name="SERIES")
public class Series {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="SERIES_ID")
	private long seriesID;

	@Column(name="SERIES_NAME")
	private String seriesName;

	@Column(name="AIR_DAY_OF_WEEK")
	private int airDayOfWeek;

	@Column(name="AIR_TIME")
	private long airTime;

	@Column(name="CONTENT_RATING")
	private String contentRating;

	@Column(name="FIRST_AIRED")
	private Date firstAired;

	@Column(name="GENRE")
	private int genre;

	@Column(name="IMDB_ID")
	private String imdbID;

	@Column(name="LANGUAGE_ID")
	private int languageId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="NETWORK_ID")
	private TVNetwork tvNetwork;

	@Column(name="OVERVIEW")
	private String overview;

	@Column(name="RATING")
	private float rating;

	@Column(name="RATING_COUNT")
	private int ratingCount;

	@Column(name="RUN_TIME")
	private int runtime;

	@Column (name="STATUS")
	private int status;

	@OneToMany(mappedBy = "series")
	private List<Season> seasonList;

	public long getSeriesID() {
		return seriesID;
	}

	public void setSeriesID(long seriesID) {
		this.seriesID = seriesID;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public int getAirDayOfWeek() {
		return airDayOfWeek;
	}

	public void setAirDayOfWeek(int airDayOfWeek) {
		this.airDayOfWeek = airDayOfWeek;
	}

	public long getAirTime() {
		return airTime;
	}

	public void setAirTime(long airTime) {
		this.airTime = airTime;
	}

	public String getContentRating() {
		return contentRating;
	}

	public void setContentRating(String contentRating) {
		this.contentRating = contentRating;
	}

	public Date getFirstAired() {
		return firstAired;
	}

	public void setFirstAired(Date firstAired) {
		this.firstAired = firstAired;
	}

	public int getGenre() {
		return genre;
	}

	public void setGenre(int genre) {
		this.genre = genre;
	}

	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public TVNetwork getTvNetwork() {
		return tvNetwork;
	}

	public void setTvNetwork(TVNetwork tvNetwork) {
		this.tvNetwork = tvNetwork;
	}

	public List<Season> getSeasonList() {
		return seasonList;
	}

	public void setSeasonList(List<Season> seasonList) {
		this.seasonList = seasonList;
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

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}

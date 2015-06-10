package com.achome.snipeshark.data.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Access(AccessType.FIELD)
@Table(name="SERIES", uniqueConstraints = @UniqueConstraint(columnNames = {"PROVIDER_ID", "PROVIDER"}))
public class Series extends BaseModel{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="SERIES_ID", unique = true)
	private long seriesID;

	@Column(name="SERIES_NAME", nullable = false)
	private String seriesName;

	@Column(name="AIR_DAY_OF_WEEK", nullable = true)
	private int airDayOfWeek;

	@Column(name="AIR_TIME", nullable = true)
	private long airTime;

	@Column(name="CONTENT_RATING", nullable = true)
	private String contentRating;

	@Column(name="FIRST_AIRED", nullable = true)
	private Date firstAired;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "SERIES_GENRE", joinColumns = @JoinColumn(name="SERIES_ID"), inverseJoinColumns = @JoinColumn(name="GENRE_ID"))
	private List<Genre> genreList;


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
	private List<Season> seasons;

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

	public List<Genre> getGenreList() {
		return genreList;
	}

	public void setGenreList(List<Genre> genreList) {
		this.genreList = genreList;
	}

	public List<Season> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Series)) return false;

		Series series = (Series) o;

		if (airDayOfWeek != series.airDayOfWeek) return false;
		if (airTime != series.airTime) return false;
		if (languageId != series.languageId) return false;
		if (Float.compare(series.rating, rating) != 0) return false;
		if (ratingCount != series.ratingCount) return false;
		if (runtime != series.runtime) return false;
		if (seriesID != series.seriesID) return false;
		if (status != series.status) return false;
		if (contentRating != null ? !contentRating.equals(series.contentRating) : series.contentRating != null)
			return false;
		if (firstAired != null ? !firstAired.equals(series.firstAired) : series.firstAired != null) return false;
		if (genreList != null ? !genreList.equals(series.genreList) : series.genreList != null) return false;
		if (imdbID != null ? !imdbID.equals(series.imdbID) : series.imdbID != null) return false;
		if (overview != null ? !overview.equals(series.overview) : series.overview != null) return false;
		if (seasons != null ? !seasons.equals(series.seasons) : series.seasons != null) return false;
		if (!seriesName.equals(series.seriesName)) return false;
		if (tvNetwork != null ? !tvNetwork.equals(series.tvNetwork) : series.tvNetwork != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (seriesID ^ (seriesID >>> 32));
		result = 31 * result + seriesName.hashCode();
		result = 31 * result + airDayOfWeek;
		result = 31 * result + (int) (airTime ^ (airTime >>> 32));
		result = 31 * result + (contentRating != null ? contentRating.hashCode() : 0);
		result = 31 * result + (firstAired != null ? firstAired.hashCode() : 0);
		result = 31 * result + (genreList != null ? genreList.hashCode() : 0);
		result = 31 * result + (imdbID != null ? imdbID.hashCode() : 0);
		result = 31 * result + languageId;
		result = 31 * result + (tvNetwork != null ? tvNetwork.hashCode() : 0);
		result = 31 * result + (overview != null ? overview.hashCode() : 0);
		result = 31 * result + (rating != +0.0f ? Float.floatToIntBits(rating) : 0);
		result = 31 * result + ratingCount;
		result = 31 * result + runtime;
		result = 31 * result + status;
		result = 31 * result + (seasons != null ? seasons.hashCode() : 0);
		return result;
	}
}

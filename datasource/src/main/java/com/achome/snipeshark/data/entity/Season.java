package com.achome.snipeshark.data.entity;

import com.achome.snipeshark.data.entity.primaryId.SeasonPK;

import javax.persistence.*;
import java.util.List;

@Entity
@Access(AccessType.FIELD)
@Table(name="SEASON", uniqueConstraints = @UniqueConstraint(columnNames = {"PROVIDER_ID", "PROVIDER"}))
@IdClass(SeasonPK.class)
public class Season extends BaseModel {
	@Id
	@Column(name = "SEASON_ID")
	private long seasonId;

	@Id
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SERIES_ID")
	private Series series;

	@OneToMany(mappedBy = "season")
	private List<Episode> episodes;

	public long getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(long seasonId) {
		this.seasonId = seasonId;
	}

	public List<Episode> getEpisodes() {
		return episodes;
	}

	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}

	public Series getSeries() {
		return series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}
}

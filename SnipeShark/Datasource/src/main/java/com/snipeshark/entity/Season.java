package com.snipeshark.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Access(AccessType.FIELD)
@Table(name="SEASON")
public class Season {
	@Id
	private long seasonId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="SERIES_ID")
	private Series series;


	@OneToMany(mappedBy = "season")
	private List<Episode> episodelist;


	
	

}

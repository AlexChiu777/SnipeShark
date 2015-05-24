package com.snipershark.entity;

import java.sql.Date;

import javax.persistence.Id;

public class Series {
	@Id
	
	private String seriesID;
	private String seriesName;
	private int airDayOfWeek; 
	private long airTime;
	private String contentRating;
	private Date firstAired;
	private int genre;
	private String imdbID;
	private String language;
	private String network;
	private String overview;
	private float rating;
	private int ratingCount;
	private int runtime;
	private int status;
	
	
}

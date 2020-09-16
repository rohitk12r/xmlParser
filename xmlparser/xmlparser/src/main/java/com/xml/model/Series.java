package com.xml.model;

import javax.xml.bind.annotation.XmlElement;

public class Series {
	private String id;
	@XmlElement(name = "Actors")
	private String Actors;
	@XmlElement(name = "Airs_DayOfWeek")
	private String Airs_DayOfWeek;
	@XmlElement(name = "Airs_Time")
	private String Airs_Time;
	@XmlElement(name = "ContentRating")
	private String ContentRating;
	@XmlElement(name = "FirstAired")
	private String FirstAired;
	@XmlElement(name = "Genre")
	private String Genre;
	private String IMDB_ID;
	@XmlElement(name = "Language")
	private String Language;
	@XmlElement(name = "Network")
	private String Network;
	@XmlElement(name = "NetworkID")
	private String NetworkID;
	@XmlElement(name = "Overview")
	private String Overview;
	@XmlElement(name = "Rating")
	private String Rating;
	@XmlElement(name = "RatingCount")
	private String RatingCount;
	@XmlElement(name = "Runtime")
	private String Runtime;
	@XmlElement(name = "SeriesID")
	private String SeriesID;
	@XmlElement(name = "SeriesName")
	private String SeriesName;
	@XmlElement(name = "Status")
	private String Status;
	private String added;
	private String addedBy;
	private String banner;
	private String fanart;
	private String finale_aired;
	private String lastupdated;
	private String poster;
	private String tms_wanted_old;
	private String zap2it_id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getActors() {
		return Actors;
	}

	public void setActors(String actors) {
		Actors = actors;
	}

	public String getAirs_DayOfWeek() {
		return Airs_DayOfWeek;
	}

	public void setAirs_DayOfWeek(String airs_DayOfWeek) {
		Airs_DayOfWeek = airs_DayOfWeek;
	}

	public String getAirs_Time() {
		return Airs_Time;
	}

	public void setAirs_Time(String airs_Time) {
		Airs_Time = airs_Time;
	}

	public String getContentRating() {
		return ContentRating;
	}

	public void setContentRating(String contentRating) {
		ContentRating = contentRating;
	}

	public String getFirstAired() {
		return FirstAired;
	}

	public void setFirstAired(String firstAired) {
		FirstAired = firstAired;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public String getIMDB_ID() {
		return IMDB_ID;
	}

	public void setIMDB_ID(String iMDB_ID) {
		IMDB_ID = iMDB_ID;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public String getNetwork() {
		return Network;
	}

	public void setNetwork(String network) {
		Network = network;
	}

	public String getNetworkID() {
		return NetworkID;
	}

	public void setNetworkID(String networkID) {
		NetworkID = networkID;
	}

	public String getOverview() {
		return Overview;
	}

	public void setOverview(String overview) {
		Overview = overview;
	}

	public String getRating() {
		return Rating;
	}

	public void setRating(String rating) {
		Rating = rating;
	}

	public String getRatingCount() {
		return RatingCount;
	}

	public void setRatingCount(String ratingCount) {
		RatingCount = ratingCount;
	}

	public String getRuntime() {
		return Runtime;
	}

	public void setRuntime(String runtime) {
		Runtime = runtime;
	}

	public String getSeriesID() {
		return SeriesID;
	}

	public void setSeriesID(String seriesID) {
		SeriesID = seriesID;
	}

	public String getSeriesName() {
		return SeriesName;
	}

	public void setSeriesName(String seriesName) {
		SeriesName = seriesName;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
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

	public String getFinale_aired() {
		return finale_aired;
	}

	public void setFinale_aired(String finale_aired) {
		this.finale_aired = finale_aired;
	}

	public String getLastupdated() {
		return lastupdated;
	}

	public void setLastupdated(String lastupdated) {
		this.lastupdated = lastupdated;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getTms_wanted_old() {
		return tms_wanted_old;
	}

	public void setTms_wanted_old(String tms_wanted_old) {
		this.tms_wanted_old = tms_wanted_old;
	}

	public String getZap2it_id() {
		return zap2it_id;
	}

	public void setZap2it_id(String zap2it_id) {
		this.zap2it_id = zap2it_id;
	}

}

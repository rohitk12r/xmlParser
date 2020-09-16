package com.xml.model;

import javax.xml.bind.annotation.XmlElement;

public class Episode {
	private String id;
	@XmlElement(name = "Combined_episodenumber")
	private String Combined_episodenumber;
	@XmlElement(name = "Combined_season")
	private String Combined_season;
	private String DVD_chapter;
	private String DVD_discid;
	private String DVD_episodenumber;
	private String DVD_season;
	@XmlElement(name = "Director")
	private String Director;
	@XmlElement(name = "EpImgFlag")
	private String EpImgFlag;
	@XmlElement(name = "EpisodeName")
	private String EpisodeName;
	@XmlElement(name = "EpisodeNumber")
	private String EpisodeNumber;
	@XmlElement(name = "FirstAired")
	private String FirstAired;
	@XmlElement(name = "GuestStars")
	private String GuestStars;
	private String IMDB_ID;
	@XmlElement(name = "Language")
	private String Language;
	@XmlElement(name = "Overview")
	private String Overview;
	@XmlElement(name = "ProductionCode")
	private String ProductionCode;
	@XmlElement(name = "Rating")
	private String Rating;
	@XmlElement(name = "RatingCount")
	private String RatingCount;
	@XmlElement(name = "SeasonNumber")
	private String SeasonNumber;
	@XmlElement(name = "Writer")
	private String Writer;
	private String absolute_number;
	private String filename;
	private String is_movie;
	private String lastupdated;
	private String seasonid;
	private String seriesid;
	private String thumb_added;
	private String thumb_height;
	private String thumb_width;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCombined_episodenumber() {
		return Combined_episodenumber;
	}

	public void setCombined_episodenumber(String combined_episodenumber) {
		Combined_episodenumber = combined_episodenumber;
	}

	public String getCombined_season() {
		return Combined_season;
	}

	public void setCombined_season(String combined_season) {
		Combined_season = combined_season;
	}

	public String getDVD_chapter() {
		return DVD_chapter;
	}

	public void setDVD_chapter(String dVD_chapter) {
		DVD_chapter = dVD_chapter;
	}

	public String getDVD_discid() {
		return DVD_discid;
	}

	public void setDVD_discid(String dVD_discid) {
		DVD_discid = dVD_discid;
	}

	public String getDVD_episodenumber() {
		return DVD_episodenumber;
	}

	public void setDVD_episodenumber(String dVD_episodenumber) {
		DVD_episodenumber = dVD_episodenumber;
	}

	public String getDVD_season() {
		return DVD_season;
	}

	public void setDVD_season(String dVD_season) {
		DVD_season = dVD_season;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public String getEpImgFlag() {
		return EpImgFlag;
	}

	public void setEpImgFlag(String epImgFlag) {
		EpImgFlag = epImgFlag;
	}

	public String getEpisodeName() {
		return EpisodeName;
	}

	public void setEpisodeName(String episodeName) {
		EpisodeName = episodeName;
	}

	public String getEpisodeNumber() {
		return EpisodeNumber;
	}

	public void setEpisodeNumber(String episodeNumber) {
		EpisodeNumber = episodeNumber;
	}

	public String getFirstAired() {
		return FirstAired;
	}

	public void setFirstAired(String firstAired) {
		FirstAired = firstAired;
	}

	public String getGuestStars() {
		return GuestStars;
	}

	public void setGuestStars(String guestStars) {
		GuestStars = guestStars;
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

	public String getOverview() {
		return Overview;
	}

	public void setOverview(String overview) {
		Overview = overview;
	}

	public String getProductionCode() {
		return ProductionCode;
	}

	public void setProductionCode(String productionCode) {
		ProductionCode = productionCode;
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

	public String getSeasonNumber() {
		return SeasonNumber;
	}

	public void setSeasonNumber(String seasonNumber) {
		SeasonNumber = seasonNumber;
	}

	public String getWriter() {
		return Writer;
	}

	public void setWriter(String writer) {
		Writer = writer;
	}

	public String getAbsolute_number() {
		return absolute_number;
	}

	public void setAbsolute_number(String absolute_number) {
		this.absolute_number = absolute_number;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getIs_movie() {
		return is_movie;
	}

	public void setIs_movie(String is_movie) {
		this.is_movie = is_movie;
	}

	public String getLastupdated() {
		return lastupdated;
	}

	public void setLastupdated(String lastupdated) {
		this.lastupdated = lastupdated;
	}

	public String getSeasonid() {
		return seasonid;
	}

	public void setSeasonid(String seasonid) {
		this.seasonid = seasonid;
	}

	public String getSeriesid() {
		return seriesid;
	}

	public void setSeriesid(String seriesid) {
		this.seriesid = seriesid;
	}

	public String getThumb_added() {
		return thumb_added;
	}

	public void setThumb_added(String thumb_added) {
		this.thumb_added = thumb_added;
	}

	public String getThumb_height() {
		return thumb_height;
	}

	public void setThumb_height(String thumb_height) {
		this.thumb_height = thumb_height;
	}

	public String getThumb_width() {
		return thumb_width;
	}

	public void setThumb_width(String thumb_width) {
		this.thumb_width = thumb_width;
	}

}

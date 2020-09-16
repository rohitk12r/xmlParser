package com.xml.service;

import java.util.List;

import com.xml.model.Episode;
import com.xml.model.Series;

public interface DataService {

	List<Series> getSeries();

	List<Episode> getEpisode(String seriesID);

}

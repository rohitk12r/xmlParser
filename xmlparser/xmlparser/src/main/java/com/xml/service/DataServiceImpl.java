package com.xml.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.model.Data;
import com.xml.model.Episode;
import com.xml.model.Series;
import com.xml.util.XmlParserUtil;

@Service
public class DataServiceImpl implements DataService {

	@Autowired
	private XmlParserUtil xmlParserUtil;

	@Override
	public List<Series> getSeries() {
		List<Series> seriesCollection = null;
		try {
			List<Data> dataCollection = xmlParserUtil.getXMLSeriesData();
			seriesCollection = dataCollection.stream().map(data -> data.getSeries()).collect(Collectors.toList());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return seriesCollection;
	}

	@Override
	public List<Episode> getEpisode(String seriesID) {
		Optional<List<Episode>> episodeCollection = null;
		try {
			List<Data> dataCollection = xmlParserUtil.getXMLSeriesData();
			episodeCollection = dataCollection.stream().filter(data -> data.getSeries().getId().equals(seriesID))
					.map(data -> data.getEpisodes()).findAny();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return episodeCollection.get();
	}
}

package com.xml.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.xml.model.Episode;
import com.xml.model.Series;
import com.xml.service.DataService;

@RestController
@RequestMapping("api/")
public class SeriesApi {

	@Autowired
	private DataService dataService;

	@GetMapping("series")
	public ResponseEntity<?> getSeries() {
		List<Series> seriesCollection = dataService.getSeries();
		return ResponseEntity.ok(seriesCollection);

	}

	@GetMapping("episodes/{seriesID}")
	public ResponseEntity<?> getEpisodes(@PathVariable("seriesID") String seriesID) {
		List<Episode> episodeCollection = dataService.getEpisode(seriesID);
		return ResponseEntity.ok(episodeCollection);
	}

	@GetMapping(path = "/")
	public ModelAndView landinPage(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("index");
	}
}

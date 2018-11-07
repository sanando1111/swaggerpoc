package com.series.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.series.model.TvSeries;

@RequestMapping("/series/api")
public class SeriesAPI {

	@GetMapping("/all")
	public TvSeries getallTvSeries()
	{
		return null;
		
		
	}
}

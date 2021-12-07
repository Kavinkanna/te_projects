package com.te.movies.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.te.movies.CatlogItem;
import com.te.movies.Movies;
import com.te.movies.Rating;

@RestController
@RequestMapping(path = "/catalog")
public class MovieCatlogResources {

	@GetMapping(path = "/{userId}")
	public List<CatlogItem> getCatlog(@PathVariable String userId) {

		RestTemplate restTemplate = new RestTemplate();

		 
		List<Rating> ratings = Arrays.asList(new Rating("PK", 5), 
				new Rating("300", 5));

		return ratings.stream().map( rating -> {
//		Movies movies =	restTemplate.getForObject("http://localhost:8091/movies/" + rating.getMovieId(), Movies.class);
			Movies movies =	WebClient.builder().build()
			.get()
			.uri("http://localhost:8091/movies/" + rating.getMovieId())
			.retrieve()
			.bodyToMono(Movies.class)
			.block();
			
			return new CatlogItem(movies.getName(), "Good", rating.getRating());
		}).collect(Collectors.toList());

//		List<CatlogItem> catlogItems = new ArrayList<>();
//		catlogItems.add(new CatlogItem("PK", "Good", 0));
//		return catlogItems;
	}
}

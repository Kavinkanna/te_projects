package com.te.movies;

public class Movies {
	
	private String movieId;
	
	private String name;

	public Movies(String movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}

	public Movies() {
		super();
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}

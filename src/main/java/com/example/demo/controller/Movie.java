package com.example.demo.controller;

public class Movie {
	
	private final int id;
	private String title;
	private String director;
	private String year;
	
	public Movie(int id, String title, String director, String year) {
		this.id = id;
		this.director = director;
		this.title = title;
		this.year = year;
	}
	
}

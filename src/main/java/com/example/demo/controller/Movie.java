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
	
	@Override
	public String toString() {
		return String.format("%d , %s , %s , %s", this.id, this.title, this.director, this.year);
	}
	
}

package com.example.demo.model;

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
	
	public int getID() {
		return this.id;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getDirector() {
		return this.director;
	}
	
	public String getYear() {
		return this.year;
	}
	
	@Override
	public String toString() {
		return String.format("%d , %s , %s , %s", this.id, this.title, this.director, this.year);
	}
	
}

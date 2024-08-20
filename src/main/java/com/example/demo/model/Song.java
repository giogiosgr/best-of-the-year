package com.example.demo.model;

public class Song {
	
	private final int id;
	private String title;
	private String artists;
	private String year;
	
	public Song(int id, String title, String artists, String year) {
		this.id = id;
		this.artists = artists;
		this.title = title;
		this.year = year;
	}
	
	public int getID() {
		return this.id;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	@Override
	public String toString() {
		return String.format("%d , %s , %s , %s", this.id, this.title, this.artists, this.year);
	}
		
}
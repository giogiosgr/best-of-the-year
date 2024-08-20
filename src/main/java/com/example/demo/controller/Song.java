package com.example.demo.controller;

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
	
}
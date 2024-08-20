package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;


@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/bestOf")  
    public String bestOf(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "bestOf";
    }
    
    private List<Movie> getBestMovies() {
    	List<Movie> movieList = new ArrayList<Movie>();
    	movieList.add(new Movie(33, "Titanic", "James Cameron", "1997"));
    	movieList.add(new Movie(121, "Alien", "Ridley Scott", "1979"));
    	movieList.add(new Movie(150, "Ben Hur", "William Wyler", "1959"));
    	return movieList;
    }
    
    private List<Song> getBestSongs() {
    	List<Song> songList = new ArrayList<Song>();
    	songList.add(new Song(15, "Thriller", "Michael Jackson", "1982"));
    	songList.add(new Song(71, "Yellow Submarine", "Beatles", "1968"));
    	songList.add(new Song(120, "Hotel California", "Eagles", "1976"));
    	return songList;
    }
    
    @GetMapping("/bestMovies")  
    public String bestMovies(Model model) {
        model.addAttribute("movieList", getBestMovies().get(0).toString() + 
        		". " + getBestMovies().get(1).toString() + ". " + getBestMovies().get(2).toString());
        return "bestMovies";
    }
    
    @GetMapping("/bestSongs")  
    public String bestSongs(Model model) {
        model.addAttribute("songList", getBestSongs().get(0).toString() + 
        		". " + getBestSongs().get(1).toString() + ". " + getBestSongs().get(2).toString());
        return "bestSongs";
    }

}
package com.example.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.model.Movie;
import com.example.backend.repository.MovieRepo;

@Service
public class MovieService {
    @Autowired 
    private MovieRepo movieRepo;

    public List<Movie> allMovies(){
        return movieRepo.findAll();
    }

    public Movie findByTitle(String title){
        return movieRepo.findByTitle(title)
            .orElseThrow(()->new IllegalArgumentException("No results for " + title));
    }

    public Movie findByImdbId(String imdbId){
        return movieRepo.findByImdbId(imdbId)
            .orElseThrow(()->new RuntimeException(imdbId + "seems to not be related to any movie :("));
    }

}

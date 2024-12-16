package com.example.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.repository.ReviewRepo;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepo reviewRepo;

    public void addReview(String body, String imdbId){
        
    }
}

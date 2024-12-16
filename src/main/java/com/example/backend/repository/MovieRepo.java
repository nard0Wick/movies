package com.example.backend.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.backend.model.Movie;

@Repository
public interface MovieRepo extends MongoRepository<Movie, ObjectId>{
    Optional<Movie> findByImdbId(String imdbId);

    Optional<Movie> findByTitle(String title);

}

package com.example.backend.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.model.Review;

@Repository
public interface ReviewRepo extends MongoRepository<Review, ObjectId>{

}

package com.example.demo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepositry extends MongoRepository<Movie, String> {
    Optional<Movie> findMovieByImdbId(String imdbId);
}

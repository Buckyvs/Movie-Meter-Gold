package com.Shukla.MovieMeter;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Movie, ObjectId> {

    Review insert(Review review);
}

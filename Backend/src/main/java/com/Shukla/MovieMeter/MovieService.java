package com.Shukla.MovieMeter;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movierepository;


    public List<Movie> findAllMovies() {
        return movierepository.findAll();
    }

    public Optional<Movie> findMovieByImdbId(String imdbId){
        return movierepository.findMovieByImdbId(imdbId);
    }

}

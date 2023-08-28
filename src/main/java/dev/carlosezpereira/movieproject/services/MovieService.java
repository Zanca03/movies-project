package dev.carlosezpereira.movieproject.services;

import dev.carlosezpereira.movieproject.entities.Movie;
import dev.carlosezpereira.movieproject.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }


}

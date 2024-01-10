package com.mycompany.cinema.service;

import com.mycompany.cinema.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieServiceImpl implements MovieService {
    private List<Movie> movies;

    public MovieServiceImpl() {
        this.movies = new ArrayList<>();
    }

    @Override
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return new ArrayList<>(movies);
    }
}

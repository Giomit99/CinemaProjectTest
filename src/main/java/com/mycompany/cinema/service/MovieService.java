package com.mycompany.cinema.service;

import com.mycompany.cinema.model.Movie;
import com.mycompany.cinema.app.CinemaApp;

public class MovieService {
    private Movie movie; // Dipendenza circolare
    private CinemaApp cinemaApp;

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void someMethod() {
        // Fai qualcosa con il film
        if (movie != null) {
            System.out.println("Doing something with movie: " + movie.getTitle());
        }
    }

    public MovieService(){
        cinemaApp= new CinemaApp(3);
    }
}

/*
//ACICLICO
package com.mycompany.cinema.service;

import com.mycompany.cinema.model.Movie;

import java.util.List;

public interface MovieService {
    void addMovie(Movie movie);

    List<Movie> getAllMovies();
}
*/
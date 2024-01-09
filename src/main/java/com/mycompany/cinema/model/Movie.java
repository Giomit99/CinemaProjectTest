package com.mycompany.cinema.model;

import com.mycompany.cinema.service.MovieService;
//import com.mycompany.cinema.app.CinemaApp;


public class Movie {
    private String title;
    private int year;
    private MovieService movieService; // Dipendenza circolare
    //private CinemaApp cinemaApp;

    public Movie(String title, int year) {
        //cinemaApp= new CinemaApp(2);
        this.title = title;
        this.year = year;
    }

    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }

    public void doSomething() {
        // Fai qualcosa con il servizio
        if (movieService != null) {
            movieService.someMethod();
        }
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                '}';
    }

    public String getTitle() {
        return title;
    }
}
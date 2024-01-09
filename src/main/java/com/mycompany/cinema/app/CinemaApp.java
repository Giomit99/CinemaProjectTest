package com.mycompany.cinema.app;

import com.mycompany.cinema.model.Movie;
import com.mycompany.cinema.service.MovieService;

public class CinemaApp {
   // public int A;
    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        Movie movie1 = new Movie("Inception", 2010);
        Movie movie2 = new Movie("The Shawshank Redemption", 1994);

        movieService.setMovie(movie1);
        movie1.setMovieService(movieService);

        // Chiamiamo un metodo che crea la dipendenza circolare
        movie1.doSomething();

        System.out.println("All Movies:");
        System.out.println(movie1);
        System.out.println(movie2);
    }
/*
    public CinemaApp(int a){
        A=a;
    }*/
}
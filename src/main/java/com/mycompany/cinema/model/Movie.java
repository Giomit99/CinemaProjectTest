package com.mycompany.cinema.model;

import com.mycompany.cinema.service.MovieService;

public class Movie {
    private String title;
    private int year;
    //private MovieService movieService; // Dipendenza circolare

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    /*public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }

    public void doSomething() {
        // Fai qualcosa con il servizio
        if (movieService != null) {
            movieService.someMethod();
        }
    }*/

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

/*
//ACICLICO
package com.mycompany.cinema.model;

public class Movie {
    private String title;
    private int year;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
*/

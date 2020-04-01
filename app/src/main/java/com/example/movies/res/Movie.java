package com.example.movies.res;

public class Movie {
    private String mov_name;
    private String mov_genre;
    private String mov_date;

    public Movie(String mov_name, String mov_genre, String mov_date) {
        this.mov_name = mov_name;
        this.mov_genre = mov_genre;
        this.mov_date = mov_date;
    }

    public String getMov_name() {
        return mov_name;
    }

    public String getMov_genre() {
        return mov_genre;
    }

    public String getMov_date() {
        return mov_date;
    }
}

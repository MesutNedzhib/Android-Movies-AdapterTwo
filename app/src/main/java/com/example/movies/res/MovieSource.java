package com.example.movies.res;

import java.util.ArrayList;

public class MovieSource {
    public static ArrayList<Movie> generateMovieItems(){
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Movie: \n"+"Jumanji - Next Level","Genre: \n"+"Action, Adventure, Comedy ","Release date: \n"+"13 December 2019" ));
        movies.add(new Movie("Movie: \n"+"Star Wars: Episode IX - The Rise of Skywalker","Genre: \n"+"Action, Adventure, Fantasy ","Release date: \n"+"20 December 2019" ));
        movies.add(new Movie("Movie: \n"+"The Hunger Games","Genre: \n"+"Action, Adventure, Sci-Fi","Release date: \n"+"23 March 2012" ));
        movies.add(new Movie("Movie: \n"+"The Maze Runner ","Genre: \n"+"Action, Mystery, Sci-Fi ","Release date: \n"+"19 September 2014"));
        movies.add(new Movie("Movie: \n"+"Alien: Covenant ","Genre: \n"+"Horror, Sci-Fi, Thriller ","Release date: \n"+"19 May 2017"));

        return movies;
    }
}

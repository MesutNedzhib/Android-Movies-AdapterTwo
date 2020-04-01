package com.example.movies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.movies.res.CustomAdapter;
import com.example.movies.res.Movie;
import com.example.movies.res.MovieSource;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Jumanji - Next Level"," Action, Adventure, Comedy ","13 December 2019" ));
        movies.add(new Movie("Star Wars: Episode IX - The Rise of Skywalker"," Action, Adventure, Fantasy ","20 December 2019" ));
        movies.add(new Movie("The Hunger Games"," Action, Adventure, Sci-Fi","23 March 2012" ));
        movies.add(new Movie("The Maze Runner "," Action, Mystery, Sci-Fi ","19 September 2014"));
        movies.add(new Movie("Alien: Covenant "," Horror, Sci-Fi, Thriller ","19 May 2017"));

        RecyclerView view = findViewById(R.id.rv);

        CustomAdapter adapter = new CustomAdapter(MovieSource.generateMovieItems());

        view.setAdapter(adapter);

        view.setLayoutManager(new LinearLayoutManager(this));
    }
}

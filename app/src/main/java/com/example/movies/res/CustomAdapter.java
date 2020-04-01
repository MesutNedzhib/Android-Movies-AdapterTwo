package com.example.movies.res;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movies.R;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<ViewHolder> {

    private List<Movie> movies;
    private Context context;

    public CustomAdapter(List<Movie> movies) {
        this.movies = movies;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View movieView = inflater.inflate(R.layout.rowlayout,parent,false);

        ViewHolder viewHolder = new ViewHolder((movieView));

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Movie movie = movies.get(position);

        holder.setMov_name(movie.getMov_name());
        holder.setMov_genre(movie.getMov_genre());
        holder.setMov_date(movie.getMov_date());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,movie.getMov_name()+" \n"+movie.getMov_genre()+" \n"+movie.getMov_date(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}

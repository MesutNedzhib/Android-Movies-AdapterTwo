package com.example.movies.res;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movies.R;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView mov_name;
    private TextView mov_genre;
    private TextView mov_date;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        mov_name = itemView.findViewById(R.id.name);
        mov_genre = itemView.findViewById(R.id.genre);
        mov_date = itemView.findViewById(R.id.date);
    }

    public TextView getMov_name() {
        return mov_name;
    }

    public void setMov_name(String mov_name) {
        this.mov_name.setText(mov_name);
    }

    public TextView getMov_genre() {
        return mov_genre;
    }

    public void setMov_genre(String mov_genre) {
        this.mov_genre.setText(mov_genre);
    }

    public TextView getMov_date() {
        return mov_date;
    }

    public void setMov_date(String mov_date) {
        this.mov_date.setText(mov_date);
    }
}

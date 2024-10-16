package com.m3.hw3rv1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.m3.hw3rv1.databinding.ActivityMainBinding;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Movies> games = new ArrayList<Movies>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
        initRV();
    }
    private void loadData() {
        games.add(new Movies("https://m.media-amazon.com/images/M/MV5BYTJkNGQyZDgtZDQ0NC00MDM0LWEzZWQtYzUzZDEwMDljZWNjXkEyXkFqcGc@._V1_.jpg",
                "The Godfather",
                "9.2/10"));
        games.add(new Movies("https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_.jpg",
                "The Dark Knight",
                "9.0/10"));
        games.add(new Movies("https://m.media-amazon.com/images/M/MV5BNDYwNzVjMTItZmU5YS00YjQ5LTljYjgtMjY2NDVmYWMyNWFmXkEyXkFqcGc@._V1_.jpg",
                "Forrest Gump",
                "8.9/10"));
        games.add(new Movies("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRfSjSWOCaw5dnDL2GT1zFd9RMCgUGw5Q2Cfg&s",
                "The Matrix",
                "8.7/10"));
    }

    private void initRV(){
        RecyclerView recyclerView = findViewById(R.id.rv_games);
        MoviesAdapter adapter = new MoviesAdapter(this.getLayoutInflater(), games);
        recyclerView.setAdapter(adapter);
    }


}
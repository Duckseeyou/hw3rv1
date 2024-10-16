package com.m3.hw3rv1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.m3.hw3rv1.databinding.ActivityMainBinding;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Cats> games = new ArrayList<Cats>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
        initRV();
    }
    private void loadData() {
        games.add(new Cats("https://static.wikia.nocookie.net/battle-cats/images/a/a8/148_1.png",
                "Rocker Cat",
                "Chapter 1: 210¢\n" +
                        "Chapter 2: 315¢\n" +
                        "Chapter 3: 420¢"));
        games.add(new Cats("https://static.wikia.nocookie.net/battle-cats/images/5/59/046_1.png",
                "Jurassic Cat",
                "Chapter 1: 350¢\n" +
                        "Chapter 2: 525¢\n" +
                        "Chapter 3: 700¢"));
        games.add(new Cats("https://static.wikia.nocookie.net/battle-cats/images/f/f4/197_1.png",
                "Psychocat",
                "Chapter 1: 350¢\n" +
                        "Chapter 2: 525¢\n" +
                        "Chapter 3: 700¢"));
        games.add(new Cats("https://static.wikia.nocookie.net/battle-cats/images/6/6c/198_1.png",
                "Onmyoji Cat",
                "Chapter 1: 340¢\n" +
                        "Chapter 2: 510¢\n" +
                        "Chapter 3: 680¢"));
    }

    private void initRV(){
        RecyclerView recyclerView = findViewById(R.id.rv_games);
        CatsAdapter adapter = new CatsAdapter(this.getLayoutInflater(), games);
        recyclerView.setAdapter(adapter);
    }


}
package com.m3.hw3rv1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.m3.hw3rv1.databinding.ActivityMainBinding;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Games> games = new ArrayList<Games>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
        initRV();
    }
    private void loadData() {
        games.add(new Games("https://upload.wikimedia.org/wikipedia/en/2/22/Death_Stranding.jpg",
                "Death Stranding",
                "39,99 $"));
        games.add(new Games("https://upload.wikimedia.org/wikipedia/ru/thumb/d/d7/Until_Dawn_cover_art.jpg/640px-Until_Dawn_cover_art.jpg",
                "Until Dawn",
                "59,99 $"));
        games.add(new Games("https://upload.wikimedia.org/wikipedia/ru/8/8c/%D0%9E%D0%B1%D0%BB%D0%BE%D0%B6%D0%BA%D0%B0_Doom_Eternal.jpg",
                "Doom: Eternal",
                "39,99 $"));
        games.add(new Games("https://upload.wikimedia.org/wikipedia/en/b/b9/Elden_Ring_Box_art.jpg",
                "Elden Ring",
                "59,99 $"));
    }

    private void initRV(){
        RecyclerView recyclerView = findViewById(R.id.rv_games);
        GamesAdapter adapter = new GamesAdapter(this.getLayoutInflater(), games);
        recyclerView.setAdapter(adapter);
    }


}
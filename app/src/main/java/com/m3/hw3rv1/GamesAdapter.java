package com.m3.hw3rv1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GamesAdapter extends RecyclerView.Adapter<GamesViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<Games> games;


    public GamesAdapter(LayoutInflater inflater, ArrayList<Games> games) {
        this.inflater = inflater;
        this.games = games;
    }

    @NonNull
    @Override
    public GamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_games, parent, false);
        return new GamesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GamesViewHolder holder, int position) {
        Games game = games.get(position);
        holder.onBind(game);
    }

    @Override
    public int getItemCount() {
        return games.size();
    }
}

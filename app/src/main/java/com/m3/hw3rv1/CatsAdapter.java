package com.m3.hw3rv1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CatsAdapter extends RecyclerView.Adapter<CatsViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<Cats> games;


    public CatsAdapter(LayoutInflater inflater, ArrayList<Cats> games) {
        this.inflater = inflater;
        this.games = games;
    }

    @NonNull
    @Override
    public CatsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_games, parent, false);
        return new CatsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CatsViewHolder holder, int position) {
        Cats game = games.get(position);
        holder.onBind(game);
    }

    @Override
    public int getItemCount() {
        return games.size();
    }
}

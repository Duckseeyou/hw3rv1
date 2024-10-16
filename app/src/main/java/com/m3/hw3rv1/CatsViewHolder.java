package com.m3.hw3rv1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;


public class CatsViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivCover;
    private TextView tvName,tvPrice;
    public CatsViewHolder(@NonNull View itemView) {
        super(itemView);
        ivCover = itemView.findViewById(R.id.iv_cover);
        tvPrice = itemView.findViewById(R.id.tv_price);
        tvName = itemView.findViewById(R.id.tv_name);
    }
    void onBind(Cats cats){
        Glide.with(ivCover.getContext()).load(cats.getImage()).into(ivCover);
        tvName.setText(cats.getName());
        tvPrice.setText(cats.getPrice());

    }
}

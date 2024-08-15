package com.example.w4m3;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.w4m3.databinding.ItemMenuBinding;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuViewHolder> {

    ArrayList<Model> item;
    OnItemClick onItemClick;

    public MenuAdapter(ArrayList<Model> item, OnItemClick onItemClick) {
        this.item = item;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MenuViewHolder(ItemMenuBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.onBind(item.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return item.size();
    }
}
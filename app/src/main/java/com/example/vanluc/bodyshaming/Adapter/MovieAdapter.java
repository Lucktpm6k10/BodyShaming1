package com.example.vanluc.bodyshaming.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vanluc.bodyshaming.Model.MovieModel;
import com.example.vanluc.bodyshaming.R;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    ArrayList<MovieModel> listMovie;
    Context context;

    public MovieAdapter(ArrayList<MovieModel> listMovie, Context context) {
        this.listMovie = listMovie;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item_movie_tab, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.ivImageMovie.setImageResource(listMovie.get(i).getImageMovie());
        viewHolder.tvConttentMovie.setText(listMovie.get(i).getConttentMovie());
        viewHolder.tvNameMovie.setText(listMovie.get(i).getNameMovie());
        viewHolder.btnWatchMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myInttent = new Intent(Intent.ACTION_VIEW,Uri.parse(listMovie.get(i).getLinkMovie()));
                context.startActivity(myInttent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvNameMovie;
        TextView tvConttentMovie;
        Button btnWatchMovie;
        ImageView ivImageMovie;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNameMovie = itemView.findViewById(R.id.tv_NameMovie);
            tvConttentMovie = itemView.findViewById(R.id.tv_ConttentMovie);
            btnWatchMovie = itemView.findViewById(R.id.btn_WatchMovie);
            ivImageMovie = itemView.findViewById(R.id.iv_ImageMovie);

        }
    }
}

package com.example.vanluc.bodyshaming.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vanluc.bodyshaming.Model.MusicModel;
import com.example.vanluc.bodyshaming.R;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.ViewHolder> {
    private ArrayList<MusicModel> listMusic;
    private Context context;

    public MusicAdapter(ArrayList<MusicModel> listMusic, Context context) {
        this.listMusic = listMusic;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item_music_tab, viewGroup, false);
        return new MusicAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tvNameSong.setText(listMusic.get(i).getNameSong());
        viewHolder.tvNameSinger.setText(listMusic.get(i).getNameSinger());
        viewHolder.btnPlayMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Đã Click", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return listMusic.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvNameSong;
        TextView tvNameSinger;
        Button btnPlayMusic;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

           tvNameSong = itemView.findViewById(R.id.tvNameSong);
           tvNameSinger = itemView.findViewById(R.id.tvNameSinger);
           btnPlayMusic = itemView.findViewById(R.id.btn_PlayMusic);

        }
    }
}

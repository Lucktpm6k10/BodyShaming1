package com.example.vanluc.bodyshaming.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vanluc.bodyshaming.Activity.TotalItemActivity;
import com.example.vanluc.bodyshaming.Model.ConceptBDS;
import com.example.vanluc.bodyshaming.R;
import com.example.vanluc.bodyshaming.Ultil.InterfaceConcept;

import java.util.ArrayList;

public class ConceptAdapter extends RecyclerView.Adapter<ConceptAdapter.ViewHolder> {
    private ArrayList<ConceptBDS> listConcept;
    private Context context;


    public ConceptAdapter(ArrayList<ConceptBDS> listConcept, Context context) {
        this.listConcept = listConcept;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_concept, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int i) {
            holder.tvTittle.setText(listConcept.get(i).getTittle());
            holder.tvConttent.setText(listConcept.get(i).getConttent());

            holder.tvMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context,TotalItemActivity.class);
                    intent.putExtra("tittle",listConcept.get(i).getTittle());
                    intent.putExtra("content",listConcept.get(i).getConttent());
                    context.startActivity(intent);
                }
            });
    }

    @Override
    public int getItemCount() {
        return listConcept.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvTittle;
        TextView tvConttent;
        TextView tvMore;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTittle = itemView.findViewById(R.id.tv_Tittle);
            tvConttent = itemView.findViewById(R.id.tv_Conttent);
            tvMore = itemView.findViewById(R.id.tv_More);


        }
    }
}

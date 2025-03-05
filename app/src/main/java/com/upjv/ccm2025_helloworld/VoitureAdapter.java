package com.upjv.ccm2025_helloworld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.upjv.ccm2025_helloworld.model.voiture;

import java.util.List;

public class VoitureAdapter extends RecyclerView.Adapter<VoitureViewHolder> {

    private List<voiture> voitures;
    private Ecouteur ecouteur;

    public VoitureAdapter(List<voiture> voitures, Ecouteur monEcouteur) {
        this.voitures = voitures;
        this.ecouteur = monEcouteur;
    }


    @NonNull
    @Override
    public VoitureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater monInflater = LayoutInflater.from(parent.getContext());

        View view = monInflater.inflate(R.layout.layout_line_recylcer_view,parent,false);
        return new VoitureViewHolder(view, ecouteur);
    }

    @Override
    public void onBindViewHolder(@NonNull VoitureViewHolder holder, int position) {
        holder.mettreAJour(voitures.get(position));
    }

    @Override
    public int getItemCount() {
        return voitures.size();
    }
}

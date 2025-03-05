package com.upjv.ccm2025_helloworld;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.upjv.ccm2025_helloworld.model.voiture;

public class VoitureViewHolder extends RecyclerView.ViewHolder
{

    private TextView marqueTV;
    private TextView modeleTV;
    private TextView puissanceTV;
    public VoitureViewHolder(@NonNull View itemView, Ecouteur ecouteur) {

        super(itemView);

        this.marqueTV=itemView.findViewById(R.id.id_marque);
        this.modeleTV=itemView.findViewById(R.id.id_modele);
        this.puissanceTV=itemView.findViewById(R.id.id_puissance);
        puissanceTV.setOnClickListener(l->{
            ecouteur.ecoute(getAdapterPosition());
        });

    }

    public void mettreAJour(voiture voiture)
    {
        this.marqueTV.setText(""+voiture.getMarque());
        this.modeleTV.setText(""+voiture.getModele());
        this.puissanceTV.setText(String.valueOf(voiture.getPuissance()));
    }

}

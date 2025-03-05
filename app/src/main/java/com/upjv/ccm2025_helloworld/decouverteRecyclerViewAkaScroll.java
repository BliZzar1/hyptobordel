package com.upjv.ccm2025_helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.upjv.ccm2025_helloworld.model.voiture;

import java.util.ArrayList;
import java.util.List;

public class decouverteRecyclerViewAkaScroll extends AppCompatActivity {
    private List<voiture> garage;
    private RecyclerView monRecyclerView;
    private Ecouteur monEcouteur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_decouverte_recycler_view_aka_scroll);

        initGarage();

        monRecyclerView = findViewById(R.id.id_mon_scroll);
        monEcouteur = pos -> {
            Toast.makeText(decouverteRecyclerViewAkaScroll.this, garage.get(pos).toString(), Toast.LENGTH_LONG).show();
        };
        VoitureAdapter monAdapter = new VoitureAdapter(garage, monEcouteur);
        monRecyclerView.setAdapter(monAdapter);
        monRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initGarage() {
        this.garage = new ArrayList<>();
        this.garage.add(new voiture("Ferrari", "SG90", 1015, true));
        this.garage.add(new voiture("Ferrari", "812", 800, true));
        this.garage.add(new voiture("Ferrari", "F8", 720, true));
        this.garage.add(new voiture("Ferrari", "Roma", 620, true));
        this.garage.add(new voiture("Ferrari", "Portofino", 620, true));
        this.garage.add(new voiture("Ferrari", "GTC4 Lusso", 690, true));
        this.garage.add(new voiture("Ferrari", "F40", 400, true));
        this.garage.add(new voiture("Ferrari", "F50", 520, true));
        this.garage.add(new voiture("Ferrari", "Enzo", 660, true));
        this.garage.add(new voiture("Ferrari", "LaFerrari", 963, true));
        this.garage.add(new voiture("Ferrari", "SG90", 1015, true));
        this.garage.add(new voiture("Ferrari", "812", 800, true));
        this.garage.add(new voiture("Ferrari", "F8", 720, true));
        this.garage.add(new voiture("Ferrari", "Roma", 620, true));
        this.garage.add(new voiture("Ferrari", "Portofino", 620, true));
        this.garage.add(new voiture("Ferrari", "GTC4 Lusso", 690, true));
        this.garage.add(new voiture("Ferrari", "F40", 400, true));
        this.garage.add(new voiture("Ferrari", "F50", 520, true));
        this.garage.add(new voiture("Ferrari", "Enzo", 660, true));
        this.garage.add(new voiture("Ferrari", "LaFerrari", 963, true));
        this.garage.add(new voiture("Ferrari", "SG90", 1015, true));
        this.garage.add(new voiture("Ferrari", "812", 800, true));
        this.garage.add(new voiture("Ferrari", "F8", 720, true));
        this.garage.add(new voiture("Ferrari", "Roma", 620, true));
        this.garage.add(new voiture("Ferrari", "Portofino", 620, true));
        this.garage.add(new voiture("Ferrari", "GTC4 Lusso", 690, true));
        this.garage.add(new voiture("Ferrari", "F40", 400, true));
        this.garage.add(new voiture("Ferrari", "F50", 520, true));
        this.garage.add(new voiture("Ferrari", "Enzo", 660, true));
        this.garage.add(new voiture("Ferrari", "LaFerrari", 963, true));
    }

    public void quitter_scroll(View view) {
        finish();
    }
}
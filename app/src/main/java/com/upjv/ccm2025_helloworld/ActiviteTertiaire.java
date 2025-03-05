package com.upjv.ccm2025_helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActiviteTertiaire extends AppCompatActivity {

    private String chaineRecue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_activiteteritiaire);

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        chaineRecue=bundle.getString("goat");

    }



    public void onClick_quitter_activiter3(View view) {

        Intent resultaIntent = new Intent();

        resultaIntent.putExtra("goatRetour", chaineRecue.toUpperCase());

        setResult(RESULT_CANCELED, resultaIntent);

        finish();
    }


}
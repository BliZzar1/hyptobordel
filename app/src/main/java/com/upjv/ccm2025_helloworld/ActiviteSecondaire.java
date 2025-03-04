package com.upjv.ccm2025_helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActiviteSecondaire extends AppCompatActivity {

    private Button exitButton;
    private TextView bundlePreview;
    private final static String TAG = ActivitePrincipale.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activite_secondaire);

        exitButton = findViewById(R.id.id_exit_button_sc2);
        exitButton.setOnClickListener(this::clickSecondButton);

        // Initialize bundlePreview
        bundlePreview = findViewById(R.id.id_bundle_extras_textview);

        // Retrieve the value from the bundle passed in the intent
        Intent monIntent = getIntent();
        Bundle monBundle = monIntent.getExtras();
        if (monBundle != null) {
            String laChaine = monBundle.getString("Texte");
            bundlePreview.setText(laChaine);
        }
    }

    private void clickSecondButton(View view) {
        //Logs dans logcat
        Log.d(TAG, "Activité secondaire quittée");
        finish();
    }
}
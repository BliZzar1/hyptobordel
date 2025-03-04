package com.upjv.ccm2025_helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivitePrincipale extends AppCompatActivity {

    private Button buttonSecondWay;
    private final static String TAG = ActivitePrincipale.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);

        // Methode qui créé tous les éléments de la view
        setContentView(R.layout.layout_activite_principale);

        buttonSecondWay = findViewById(R.id.id_second_exit_way);
        buttonSecondWay.setOnClickListener(this::clickSecondButton);

    }
    private void clickSecondButton(View view) {
        //Logs dans logcat
        Log.d(TAG, "Le bouton à été cliqué");
        Toast.makeText(this,"C bo",Toast.LENGTH_LONG).show();
    }

    //First way to exit app with Onclick
    public void onClickExitButton(View view) {
        //Logs dans logcat
        Log.e(TAG, "Mauvais bouton conno");
        finish();
    }

    public void onClickLancerSecondeActivite(View view) {

        // Intent explicite --> lancer une activité à partir d'une autre
        Intent monIntent = new Intent(this, ActiviteSecondaire.class);
        EditText monSuperEditText = findViewById(R.id.id_editText);

        // Façon générique
        // Bundle --> conteneur à données qui fonctionne sur le principe clé/valeur
        Bundle monBundle = new Bundle();
        //Log.d(TAG, monSuperEditText.getText().toString());

        monIntent.putExtra("Texte", monSuperEditText.getText().toString());
        startActivity(monIntent);
    }
}
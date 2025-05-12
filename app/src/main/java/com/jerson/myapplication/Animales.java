package com.jerson.myapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Animales extends AppCompatActivity {

    Button btnPerro;

    MediaPlayer sonidoperro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_animales);
        btnPerro = findViewById(R.id.btnSonidoPerro);
        btnPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoperro = MediaPlayer.create(Animales.this,R.raw.dogg);
                sonidoperro.start();
                btnPerro.setText("Dog");
            }
        });

    }
}
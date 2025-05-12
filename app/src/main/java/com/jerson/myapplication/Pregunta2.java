package com.jerson.myapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pregunta2 extends AppCompatActivity {
    MediaPlayer sonidoMal ;
    MediaPlayer sonidoBien;

    ImageView imgBlue;
    ImageView imgGreen;
    ImageView imgAma;
    ImageView imgGato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pregunta2);

        imgBlue = findViewById(R.id.imgAzul);
        imgBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoBien = MediaPlayer.create(Pregunta2.this, R.raw.bien);
                sonidoBien.start();

            }
        });
        imgGreen = findViewById(R.id.imgVerde);

        imgGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoMal = MediaPlayer.create(Pregunta2.this, R.raw.mal);
                sonidoMal.start();

            }
        });
        imgGato = findViewById(R.id.imgCat);

        imgGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoMal = MediaPlayer.create(Pregunta2.this,R.raw.mal);
                sonidoMal.start();

            }
        });

        imgAma = findViewById(R.id.imgAmarillo);
        imgAma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoMal = MediaPlayer.create(Pregunta2.this,R.raw.mal);
                sonidoMal.start();

            }
        });
    }
}
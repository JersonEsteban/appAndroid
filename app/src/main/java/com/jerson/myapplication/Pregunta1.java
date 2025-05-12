package com.jerson.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pregunta1 extends AppCompatActivity {

    MediaPlayer sonidoMal ;
    MediaPlayer sonidoBien;
    ImageView imgPerro;
    ImageView imgCat;
    ImageView imgManzana;
    ImageView imgLoro;

    Button btnSig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pregunta1);
        imgPerro = findViewById(R.id.imgPerro);



        imgPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoBien = MediaPlayer.create(Pregunta1.this,R.raw.bien);
                sonidoBien.start();

            }
        });

        imgCat = findViewById(R.id.imgCat);



        imgCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoMal = MediaPlayer.create(Pregunta1.this,R.raw.mal);
                sonidoMal.start();

            }
        });
        imgManzana = findViewById(R.id.imgManza);



        imgManzana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoMal = MediaPlayer.create(Pregunta1.this,R.raw.mal);
                sonidoMal.start();

            }
        });
        imgLoro = findViewById(R.id.imgLor);



        imgLoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoMal = MediaPlayer.create(Pregunta1.this,R.raw.mal);
                sonidoMal.start();

            }
        });
        btnSig = findViewById(R.id.btnP1);
        btnSig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pregunta1.this,Pregunta2.class);
                startActivity(intent);
            }
        });

    }


}
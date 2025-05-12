package com.jerson.myapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pregunta1 extends AppCompatActivity {

    MediaPlayer sonidoMal ;
    ImageView imgPerro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pregunta1);
        imgPerro = findViewById(R.id.imgPerro);



        imgPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoMal = MediaPlayer.create(Pregunta1.this,R.raw.mal);
                sonidoMal.start();

            }
        });
    }


}
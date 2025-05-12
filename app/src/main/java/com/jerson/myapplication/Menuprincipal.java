package com.jerson.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menuprincipal extends AppCompatActivity {

    Button btnJugar;
    Button btnAprender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menuprincipal);
        btnJugar = findViewById(R.id.btnJuego);
        btnJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menuprincipal.this,Pregunta1.class);
                startActivity(intent);
            }
        });
        btnAprender = findViewById(R.id.btnAprendo);
        btnAprender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menuprincipal.this,MenuApp.class);
                startActivity(intent);
            }
        });

    }
}
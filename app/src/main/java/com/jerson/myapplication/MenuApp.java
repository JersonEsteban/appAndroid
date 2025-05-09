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

public class MenuApp extends AppCompatActivity {


    Button btnNextA;
    Button btnNextF;
    Button btnNextC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu_app);
        btnNextA = findViewById(R.id.btnAnimales);
        btnNextA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent animal = new Intent(MenuApp.this,Animales.class);
                startActivity(animal);


            }
        });
        btnNextF = findViewById(R.id.btnFrutas);
        btnNextF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fut = new Intent(MenuApp.this,Frutas.class);
                startActivity(fut);


            }
        });
        btnNextC = findViewById(R.id.btnColores);
        btnNextC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent col = new Intent(MenuApp.this,Colore.class);
                startActivity(col);


            }
        });



    }
}
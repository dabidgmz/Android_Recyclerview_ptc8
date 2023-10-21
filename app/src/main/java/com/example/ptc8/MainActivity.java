package com.example.ptc8;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<item> items = new ArrayList<item>();
        items.add(new item("Marco Antonio Chavez Baltierrez", "marco.antonio@email.com", R.drawable.a));
        items.add(new item("Kevin Alberto Delgado Burciaga", "kevin.alberto@email.com", R.drawable.b));
        items.add(new item("Anthony Fuentes Carrera", "Anthony.Fuentes@email.com", R.drawable.c));
        items.add(new item("Alejandro Gamboa Rojas", "alejandro.gamboa@email.com", R.drawable.e));
        items.add(new item("David Gomez Herrera", "david.gomez@email.com", R.drawable.f));
        items.add(new item("Edson Emith Gonzalez Algarate", "edson.gonzalez@email.com", R.drawable.g));
        items.add(new item("Dylan Gonzalez Flores", "dylan.gonzalez@email.com", R.drawable.h));
        items.add(new item("Jesus Arturo Hernandez Cristan", "jesus.hernandez@email.com", R.drawable.e));
        items.add(new item("Blanca Victoria Jaime Reyes", "blanca.jaime@email.com", R.drawable.d));
        items.add(new item("Jorge Adrian Lira Lopez", "jorge.lira@email.com", R.drawable.g));
        items.add(new item("Jorge Luis Luna Reyna", "jorge.luna@email.com", R.drawable.h));
        items.add(new item("Jose Jeronimo Martinez Centeno", "jose.martinez@email.com", R.drawable.a));
        items.add(new item("Luis Emilio Martinez Herrera", "luis.martinez@email.com", R.drawable.b));
        items.add(new item("jatziri Georgina Martinez Parra", "atziri.martinez@email.com", R.drawable.c));
        items.add(new item("Jose Diego Mercado Franco", "jose.mercado@email.com", R.drawable.e));
        items.add(new item("Fernando Gabriel Olmos Cazares", "fernando.olmos@email.com", R.drawable.f));
        items.add(new item("Jesus Alberto Ramirez Gonzalez", "jesus.ramirez@email.com", R.drawable.g));
        items.add(new item("Abraham Alonso Reynoso Gonzalez", "abraham.reynoso@email.com", R.drawable.h));
        items.add(new item("Maria de los Angeles Rivera Villegas", "maria.rivera@email.com", R.drawable.d));





        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Myadapater(getApplicationContext(),items));

    }
}
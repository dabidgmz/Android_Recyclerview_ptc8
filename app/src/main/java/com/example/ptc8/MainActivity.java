package com.example.ptc8;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ptc8.adapter.CarroAdapter;
import com.example.ptc8.model.Carro;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Carro> Lista_carros = new ArrayList<>();
        Lista_carros.add(new Carro("Toyota", "3", "Rojo"));
        Lista_carros.add(new Carro("BMW", "5", "Blanco"));
        Lista_carros.add(new Carro("Ferarri", "9", "Azul"));

        CarroAdapter ca = new CarroAdapter(Lista_carros);
        RecyclerView rc = findViewById(R.id.rcCarro);
        rc.setAdapter(ca);
        rc.setLayoutManager(new LinearLayoutManager(this));
        rc.setHasFixedSize(true);

    }
}
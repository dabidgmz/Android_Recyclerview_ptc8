package com.example.ptc8;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.ArrayList;
import android.os.Bundle;
import java.util.ArrayList;
import models.carro;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<carro> Lista_carro = new ArrayList<carro>();
        Lista_carro.add(new carro("mazda","3","rojo"));
        Lista_carro.add(new carro("mustan","4","verde"));
        Lista_carro.add(new carro("porshe","5","morado"));

        carroadapter ca=new carroadapter(lista_carro);
        RecyclerView rc=findViewById(R.id.rcCarro);
        rc.setAdapter(ca);
        rc.setLayoutManager(new LinearLayoutManager(this));
        rc.setHasFixedSize(true);
    }
}
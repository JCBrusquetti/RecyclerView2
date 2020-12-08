package com.saludo.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
    }

    public void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas() {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.hueso, R.drawable.mascota1,"Lider","5"));
        mascotas.add(new Mascota(R.drawable.hueso, R.drawable.mascota2,"Firulais","4"));
        mascotas.add(new Mascota(R.drawable.hueso, R.drawable.mascota3,"Puppy","3"));
        mascotas.add(new Mascota(R.drawable.hueso, R.drawable.mascota4,"Scooby","2"));
        mascotas.add(new Mascota(R.drawable.hueso, R.drawable.mascota5,"Alf","1"));
    }
    public void ir_favoritos(View v) {
        Intent i = new Intent(MainActivity.this,MascotasFavoritas.class);
        startActivity(i);
    }
}
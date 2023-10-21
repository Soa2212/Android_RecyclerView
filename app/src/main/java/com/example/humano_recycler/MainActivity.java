package com.example.humano_recycler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.humano_recycler.adapter.HumanosAdapter;
import com.example.humano_recycler.models.Humanos;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Humanos> humanos = new ArrayList<>();
        humanos.add(new Humanos("Juan","Peruano","Placoson"));
        humanos.add(new Humanos("Leo","Mexicano","Cholo"));
        humanos.add(new Humanos("Mateo","Espaniol","Revolucionario"));
        humanos.add(new Humanos("Elias","Tailandes","Underground"));
        humanos.add(new Humanos("Sergo","Finlandes","Clasio"));

        HumanosAdapter HA= new HumanosAdapter(humanos);
        RecyclerView recyclerView=findViewById(R.id.recycleView);
        recyclerView.setAdapter(HA);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
    }
}
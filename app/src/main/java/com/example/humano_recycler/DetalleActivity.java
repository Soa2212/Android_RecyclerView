package com.example.humano_recycler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        String nacionalidad = intent.getStringExtra("nacionalidad");
        String estilo = intent.getStringExtra("estilo");

        TextView tvNombre = findViewById(R.id.textViewNombre);
        TextView tvNacionalidad = findViewById(R.id.textViewNacionalidad);
        TextView tvEstilo = findViewById(R.id.textViewEstilo);

        tvNombre.setText(nombre);
        tvNacionalidad.setText(nacionalidad);
        tvEstilo.setText(estilo);
    }

}
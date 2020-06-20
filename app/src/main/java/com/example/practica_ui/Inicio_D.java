package com.example.practica_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Inicio_D extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio__d);
        TextView txtSaludo = (TextView)findViewById(R.id.txtBienv);
        Bundle bundle = this.getIntent().getExtras();
        txtSaludo.setText(bundle.getString("Name") +
                "\n"+ "Con Fecha de Nacimiento: \n" + bundle.getString("Fecha") + "\n" +
                "Número de telef:\n" + bundle.getString("Phone"));
        TextView txtfecha_h = (TextView)findViewById(R.id.txtDatos);
        txtfecha_h.setText(new SimpleDateFormat("HH:mm:ss yyyy-MM-dd").format(Calendar.getInstance().getTime()));

    }
}
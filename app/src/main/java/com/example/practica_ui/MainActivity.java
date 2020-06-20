package com.example.practica_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnEnviar(View view) {
        Intent intent = new Intent(MainActivity.this, Inicio_D.class);
        EditText[] dat= new EditText[3];
        dat[0]= (EditText)findViewById(R.id.txtNameUser);
        dat[1]= (EditText)findViewById(R.id.txtFecha);
        dat[2]= (EditText)findViewById(R.id.editTextPhone);
        Bundle b = new Bundle();
        b.putString("Name", dat[0].getText().toString());
        b.putString("Fecha", dat[1].getText().toString());
        b.putString("Phone", dat[2].getText().toString());
        intent.putExtras(b);
        startActivity(intent);
    }
    public void limpiar()
    {

    }
}
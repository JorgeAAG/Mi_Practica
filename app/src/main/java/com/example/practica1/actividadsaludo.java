package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class actividadsaludo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividadsaludo);


        //Localizar los controles
        TextView txtSaludo = (TextView)findViewById(R.id.txtsaludo);
        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
       //Construimos el mensaje a mostrar
        txtSaludo.setText("Hola!, Bienvenido \n " +
                bundle.getString("NOMBRE"));
    }
}
package com.example.redsocial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void ingresar(View view){
        Intent ingresar = new Intent(this,pantallared.class);
        startActivity(ingresar);
    }
    public void atras(View view){
        Intent atras = new Intent(this,segundapantalla.class);
        startActivity(atras);
    }

}
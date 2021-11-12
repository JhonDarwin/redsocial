package com.example.redsocial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
    }
    public void siguiente3(View view){
        Intent siguiente3 = new Intent(this,estados.class);
        startActivity(siguiente3);
    }
    public void atras(View view){
        Intent atras = new Intent(this,pantallared.class);
        startActivity(atras);
    }
}
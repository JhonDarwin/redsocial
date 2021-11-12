package com.example.redsocial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class segundapantalla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundapantalla);
    }
    public void registrate(View view){
        Intent registrate = new Intent(this,registrate.class);
        startActivity(registrate);
    }
    public void login(View view){
        Intent login = new Intent(this,login.class);
        startActivity(login);
    }
}
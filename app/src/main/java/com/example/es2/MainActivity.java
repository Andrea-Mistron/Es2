package com.example.es2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)/*creare l'app(activity)*/ {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); /*il file xml. R è una super classe costruita internamente all' AndroidStudio che contiene una serie di metodi.*/
    }
}
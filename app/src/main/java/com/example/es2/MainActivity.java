package com.example.es2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button somma;
    private Button differenza;
    private Button moltiplicazione;
    private Button divisione;
    private EditText num1;
    private EditText num2;
    private TextView risultato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        somma = findViewById(R.id.somma);
        differenza = findViewById(R.id.differenza);
        moltiplicazione = findViewById(R.id.moltiplicazione);
        divisione = findViewById(R.id.divisione);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        risultato = findViewById(R.id.risultato);

        somma.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                double res = n1 + n2;
                risultato.setText(Double.toString(res));
            }
        });

        differenza.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                double res = n1 - n2;
                risultato.setText(Double.toString(res));
            }
        });

        moltiplicazione.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                double res = n1 * n2;
                risultato.setText(Double.toString(res));
            }
        });

        divisione.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                if (n2 != 0) {
                    double res = n1 / n2;
                    risultato.setText(Double.toString(res));
                } else {
                    risultato.setText("Errore: divisione per zero");
                }
            }
        });
    }
}

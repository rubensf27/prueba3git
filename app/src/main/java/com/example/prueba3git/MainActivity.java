package com.example.prueba3git;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    Button btnSumar;
    EditText edit1, edit2;
    TextView lbResultado;

// prueba subida 2 - develop
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSumar = (Button) findViewById(R.id.btnSumar);
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
        lbResultado = (TextView) findViewById(R.id.lbResultado);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valor1= 0d;
                double valor2 = 0d;
                try{
                    valor1 = Double.valueOf(edit1.getText().toString());
                    valor2 = Double.valueOf(edit2.getText().toString());
                }catch(NumberFormatException e){

                }
                double resultado = valor1 + valor2;
                lbResultado.setText(String.valueOf(resultado));

            }
        });

    }





}

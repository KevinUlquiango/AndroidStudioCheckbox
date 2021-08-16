package com.example.kevinulquiangocheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextValor1;
    private EditText editTextValor2;
    private CheckBox checkBoxSuma;
    private CheckBox checkBoxResta;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextValor1      = (EditText) findViewById(R.id.txt_valor1);
        editTextValor2      = (EditText) findViewById(R.id.txt_valor2);
        checkBoxResta       = (CheckBox) findViewById(R.id.cbx_resta);
        checkBoxSuma        = (CheckBox) findViewById(R.id.cbx_suma);
        textViewResultado   = (TextView) findViewById(R.id.txv_resulltado);
    }

    //Metodo calcular

    public void calcular(View view) {
        double valor1 = Double.parseDouble(editTextValor1.getText().toString());
        double valor2 = Double.parseDouble(editTextValor2.getText().toString());
        String resultadoOperacion = "";
        if(checkBoxSuma.isChecked()){
           String resultadoSuma = String.valueOf(suma(valor1,valor2));
            resultadoOperacion += "La suma es: " + resultadoSuma + "\n";
        }
        if(checkBoxResta.isChecked()){
           String resultadoResta = String.valueOf(resta(valor1,valor2));
            resultadoOperacion += "La resta es: " + resultadoResta + "\n";
        }

        textViewResultado.setText(resultadoOperacion);
    }

    public double suma(double valor1, double valor2) {
        return valor1 + valor2;
    }
    public double resta(double valor1, double valor2) {
        return valor1 - valor2;
    }

}
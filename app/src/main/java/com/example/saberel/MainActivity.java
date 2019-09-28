package com.example.saberel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private TextView tv2, tv3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
    }

    public void btn_5 (View view){
        double resultado_5 = ( Double.valueOf(et1.getText().toString()) )* 0.05;
        double resultado_total = ( Double.valueOf(et1.getText().toString()) )* 0.95;
//        if (et1 != ""){
        tv2.setText("El descuento es: $" + String.format("%.2f", resultado_5));
        tv3.setText("Lo que pagarás es: $" + String.format("%.2f",resultado_total));
//    }else {
//            Toast.makeText(this, "Por favor ingrese un numero...", Toast.LENGTH_SHORT).show();
//        }
    }
    public void btn_10 (View view){
        double resultado_10 = ( Double.valueOf(et1.getText().toString()) )* 0.1;
        double resultado_total = ( Double.valueOf(et1.getText().toString()) )* 0.90;
        tv2.setText("El descuento es: $" + String.format("%.2f", resultado_10));
        tv3.setText("Lo que pagarás es: $" + String.format("%.2f",resultado_total));
    }
    public void btn_15 (View view){
        double resultado_15 = ( Double.valueOf(et1.getText().toString()) )* 0.15;
        double resultado_total = ( Double.valueOf(et1.getText().toString()) )* 0.85;
        tv2.setText("El descuento es: $" + String.format("%.2f", resultado_15));
        tv3.setText("Lo que pagarás es: $" + String.format("%.2f",resultado_total));
    }
    public void btn_20 (View view){
        double resultado_20 = ( Double.valueOf(et1.getText().toString()) )* 0.20;
        double resultado_total = ( Double.valueOf(et1.getText().toString()) )* 0.80;
        tv2.setText("El descuento es: $" + String.format("%.2f", resultado_20));
        tv3.setText("Lo que pagarás es: $" + String.format("%.2f",resultado_total));
    }
    public void btn_25 (View view){
        double resultado_25 = ( Double.valueOf(et1.getText().toString()) )* 0.25;
        double resultado_total = ( Double.valueOf(et1.getText().toString()) )* 0.75;
        tv2.setText("El descuento es: $" + String.format("%.2f", resultado_25));
        tv3.setText("Lo que pagarás es: $" + String.format("%.2f",resultado_total));
    }
    public void btn_30 (View view){
        double resultado_30 = ( Double.valueOf(et1.getText().toString()) )* 0.30;
        double resultado_total = ( Double.valueOf(et1.getText().toString()) )* 0.70;
        tv2.setText("El descuento es: $" + String.format("%.2f", resultado_30));
        tv3.setText("Lo que pagarás es: $" + String.format("%.2f",resultado_total));
    }
    public void btn_40 (View view){
        double resultado_40 = ( Double.valueOf(et1.getText().toString()) )* 0.40;
        double resultado_total = ( Double.valueOf(et1.getText().toString()) )* 0.60;
        tv2.setText("El descuento es: $" + String.format("%.2f", resultado_40));
        tv3.setText("Lo que pagarás es: $" + String.format("%.2f",resultado_total));
    }
    public void btn_50 (View view){
        double resultado_total = ( Double.valueOf(et1.getText().toString()) )* 0.50;
        tv2.setText("El descuento es la mitad, por lo tanto...");
        tv3.setText("Lo que pagarás es: $" + String.format("%.2f",resultado_total));
    }

}

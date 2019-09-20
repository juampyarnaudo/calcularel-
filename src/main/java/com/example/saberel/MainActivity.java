package com.example.saberel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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
        String resultado_5_String = String.valueOf(resultado_5);
        String resultado_total_String = String.valueOf(resultado_total);
        DecimalFormat resultado = new DecimalFormat("#,##");
        tv2.setText("El valor del descuento es: " + resultado.format(resultado_5_String));
        tv3.setText("El valor total con el descuento es: " + resultado_total_String);
    }
    public void btn_10 (View view){
        double resultado_10 = ( Double.valueOf(et1.getText().toString()) )* 0.1;
        double resultado_total = ( Double.valueOf(et1.getText().toString()) )* 0.90;
        String resultado_10_String = String.valueOf(resultado_10);
        String resultado_total_String = String.valueOf(resultado_total);
        tv2.setText("El valor del descuento es: " + resultado_10_String);
        tv3.setText("El valor total con el descuento es: " + resultado_total_String);
    }
    public void btn_15 (View view){
        double resultado_15 = ( Double.valueOf(et1.getText().toString()) )* 0.15;
        double resultado_total = ( Double.valueOf(et1.getText().toString()) )* 0.85;
        String resultado_15_String = String.valueOf(resultado_15);
        String resultado_total_String = String.valueOf(resultado_total);
        tv2.setText("El valor del descuento es: " + resultado_15_String);
        tv3.setText("El valor total con el descuento es: " + resultado_total_String);
    }
    public void btn_20 (View view){
        double resultado_20 = ( Double.valueOf(et1.getText().toString()) )* 0.20;
        double resultado_total = ( Double.valueOf(et1.getText().toString()) )* 0.80;
        String resultado_20_String = String.valueOf(resultado_20);
        String resultado_total_String = String.valueOf(resultado_total);
        tv2.setText("El valor del descuento es: " + resultado_20_String);
        tv3.setText("El valor total con el descuento es: " + resultado_total_String);
    }
    public void btn_25 (View view){
        double resultado_25 = ( Double.valueOf(et1.getText().toString()) )* 0.25;
        double resultado_total = ( Double.valueOf(et1.getText().toString()) )* 0.75;
        String resultado_25_String = String.valueOf(resultado_25);
        String resultado_total_String = String.valueOf(resultado_total);
        tv2.setText("El valor del descuento es: " + resultado_25_String);
        tv3.setText("El valor total con el descuento es: " + resultado_total_String);
    }
    public void btn_30 (View view){
        double resultado_30 = ( Double.valueOf(et1.getText().toString()) )* 0.30;
        double resultado_total = ( Double.valueOf(et1.getText().toString()) )* 0.70;
        String resultado_30_String = String.valueOf(resultado_30).toString();
        String resultado_total_String = String.valueOf(resultado_total).toString();
        tv2.setText("El valor del descuento es: " + resultado_30_String);
        tv3.setText("El valor total con el descuento es: " + resultado_total_String);
    }
    public void btn_40 (View view){
        double resultado_40 = ( Double.valueOf(et1.getText().toString()) )* 0.40;
        double resultado_total = ( Double.valueOf(et1.getText().toString()) )* 0.60;
        String resultado_40_String = String.valueOf(resultado_40);
        String resultado_total_String = String.valueOf(resultado_total);
        tv2.setText("El valor del descuento es: " + resultado_40_String);
        tv3.setText("El valor total con el descuento es: " + resultado_total_String);
    }
    public void btn_50 (View view){
        double resultado_50 = ( Double.valueOf(et1.getText().toString()) )* 0.50;
        double resultado_total = ( Double.valueOf(et1.getText().toString()) )* 0.50;
        String resultado_50_String = String.valueOf(resultado_50);
        String resultado_total_String = String.valueOf(resultado_total);
        tv2.setText("El valor del descuento es: " + resultado_50_String);
        tv3.setText("El valor total con el descuento es: " + resultado_total_String);
    }

}

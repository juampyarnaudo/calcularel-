package com.example.saberel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

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

        et1.requestFocus();
//        AdView adView = new AdView(this);
//        adView.setAdSize(AdSize.BANNER);adView.setAdUnitId("ca-app-pub-3517612946554837/3997429499");
// TODO: Add adView to your view hierarchy.

//        AdView adView;
//
//        MobileAds.initialize(this, "ca-app-pub-3517612946554837~1973901384");
////        MobileAds.initialize(this, new OnInitializationCompleteListener() {
//            @Override
//            public void onInitializationComplete(InitializationStatus initializationStatus) {
//            }
////        });
//        adView = findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        adView.loadAd(adRequest);
    }

    public void CalcularPorcentaje(double porcentaje){
        //Toast.makeText(this, et1.getText().toString().length(), Toast.LENGTH_SHORT).show();
        if(TextUtils.isEmpty(et1.getText().toString())) {
            et1.requestFocus();
            et1.setError("Por favor ingresar un valor");

        }
        else{
            double resultado_5 = (Double.valueOf(et1.getText().toString())) * porcentaje;
            double resultado_total = (Double.valueOf(et1.getText().toString())) * (1-porcentaje);
            tv2.setText("El descuento es: $" + String.format("%.2f", resultado_5));
            tv3.setText("Lo que pagarás es: $" + String.format("%.2f", resultado_total));
            et1.clearFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(et1.getWindowToken(),0);
        }
    }


    public void btn_5 (View view){
        CalcularPorcentaje(0.05);


    }
    public void btn_10 (View view){
        CalcularPorcentaje(0.10);

    }
    public void btn_15 (View view){
        CalcularPorcentaje(0.15);

    }
    public void btn_20 (View view){
        CalcularPorcentaje(0.20);

    }
    public void btn_25 (View view){
        CalcularPorcentaje(0.25);
    }
    public void btn_30 (View view){
        CalcularPorcentaje(0.30);
    }
    public void btn_40 (View view){
        CalcularPorcentaje(0.40);
    }
    public void btn_50 (View view){
        CalcularPorcentaje(0.50);
    }

}

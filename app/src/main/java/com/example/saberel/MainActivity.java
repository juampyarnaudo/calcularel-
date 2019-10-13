package com.example.saberel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class MainActivity extends AppCompatActivity {


    private EditText et1;
    private TextView tv2, tv3, tv4;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
=======

        et1 = (EditText) findViewById(R.id.et1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);

        et1.requestFocus();

>>>>>>> color
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);adView.setAdUnitId("ca-app-pub-3517612946554837/3997429499");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
<<<<<<< HEAD


        et1 = findViewById(R.id.et1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);

        et1.requestFocus();
=======
>>>>>>> color
    }


    public void CalcularPorcentaje(double porcentaje){
        //Toast.makeText(this, et1.getText().toString().length(), Toast.LENGTH_SHORT).show();
        if(TextUtils.isEmpty(et1.getText().toString())) {
            et1.requestFocus();
            et1.setError("Por favor ingresar un valor");

        }
        else{
            double valorinicial = (Double.valueOf(et1.getText().toString()));
            double resultado_5 = (Double.valueOf(et1.getText().toString())) * porcentaje;
            double totalMenosResultado = (Double.valueOf(et1.getText().toString())) * (1-porcentaje);
            double totalMasResultado = (Double.valueOf(et1.getText().toString())) * (1+porcentaje);
<<<<<<< HEAD
            String text = "<font color=#000000>El Valor (%) es: $</font> <font color=#000000>" + String.format("%.2f", resultado_5) +" </font>";
            tv2.setText(Html.fromHtml(text));
            String text2 = "<font color=#000000>El Descuento es: $</font>"+ valorinicial+" - <font color=#2ca919> $" + String.format("%.2f", resultado_5) +" </font>"  + " = $"+ String.format("%.2f", totalMenosResultado);
            tv3.setText(Html.fromHtml(text2));
            String text3 = "<font color=#000000>El Interés es: $</font>"+ valorinicial +" + <font color=#e70909> $" + String.format("%.2f", resultado_5) +" </font>"  + " = $"+ String.format("%.2f", totalMasResultado);
            tv4.setText(Html.fromHtml(text3));


=======
//            tv2.setTextColor(Color.blue(3));
            tv2.setText("El Valor (%) es: $" + String.format("%.2f", resultado_5));
            tv3.setText("El Descuento es: $" + valorinicial +" - $"+  String.format("%.2f", resultado_5) + " = $"+ String.format("%.2f", totalMenosResultado));
            tv4.setText("El Aumento es: $" + valorinicial +" + $"+ String.format("%.2f", resultado_5) + " = $"+ String.format("%.2f", totalMasResultado));
>>>>>>> color

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
    public void btnBack (View view){finish();}

}

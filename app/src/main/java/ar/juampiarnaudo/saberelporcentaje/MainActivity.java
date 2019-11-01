package ar.juampiarnaudo.saberelporcentaje;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private TextView tv2, tv3, tv4;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    int contador;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);

        et1.requestFocus();

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3517612946554837/4721035952");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }

    public void CalcularPorcentaje(double porcentaje){
        if(TextUtils.isEmpty(et1.getText().toString())) {
            et1.requestFocus();
            et1.setError("Por favor ingresar un valor");

        }
        else{
            double valorinicial = (Double.valueOf(et1.getText().toString()));
            double resultado_5 = (Double.valueOf(et1.getText().toString())) * porcentaje;
            double totalMenosResultado = (Double.valueOf(et1.getText().toString())) * (1-porcentaje);
            double totalMasResultado = (Double.valueOf(et1.getText().toString())) * (1+porcentaje);
           String text = "<font color=#000000>El Valor (%) es: $</font> <font color=#000000>" + String.format("%.2f", resultado_5) +" </font>";
            tv2.setText(Html.fromHtml(text));
            String text2 = "<font color=#000000>El Descuento es: $</font>"+ valorinicial+" - <font color=#2ca919> $" + String.format("%.2f", resultado_5) +" </font>"  + " = $"+ String.format("%.2f", totalMenosResultado);
            tv3.setText(Html.fromHtml(text2));
            String text3 = "<font color=#000000>El Interés es: $</font>"+ valorinicial +" + <font color=#e70909> $" + String.format("%.2f", resultado_5) +" </font>"  + " = $"+ String.format("%.2f", totalMasResultado);
            tv4.setText(Html.fromHtml(text3));
            et1.clearFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(et1.getWindowToken(),0);
        }
    }

    public void btn_5 (View view){
        CalcularPorcentaje(0.05);
        btn1.setTextColor(Color.parseColor("#91b029"));
        btn2.setTextColor(Color.parseColor("#000000"));
        btn3.setTextColor(Color.parseColor("#000000"));
        btn4.setTextColor(Color.parseColor("#000000"));
        btn5.setTextColor(Color.parseColor("#000000"));
        btn6.setTextColor(Color.parseColor("#000000"));
        btn7.setTextColor(Color.parseColor("#000000"));
        btn8.setTextColor(Color.parseColor("#000000"));

    }
    public void btn_10 (View view){
        CalcularPorcentaje(0.10);
        btn1.setTextColor(Color.parseColor("#000000"));
        btn2.setTextColor(Color.parseColor("#91b029"));
        btn3.setTextColor(Color.parseColor("#000000"));
        btn4.setTextColor(Color.parseColor("#000000"));
        btn5.setTextColor(Color.parseColor("#000000"));
        btn6.setTextColor(Color.parseColor("#000000"));
        btn7.setTextColor(Color.parseColor("#000000"));
        btn8.setTextColor(Color.parseColor("#000000"));
    }
    public void btn_15 (View view){
        CalcularPorcentaje(0.15);
        btn1.setTextColor(Color.parseColor("#000000"));
        btn2.setTextColor(Color.parseColor("#000000"));
        btn3.setTextColor(Color.parseColor("#91b029"));
        btn4.setTextColor(Color.parseColor("#000000"));
        btn5.setTextColor(Color.parseColor("#000000"));
        btn6.setTextColor(Color.parseColor("#000000"));
        btn7.setTextColor(Color.parseColor("#000000"));
        btn8.setTextColor(Color.parseColor("#000000"));
    }
    public void btn_20 (View view){
        CalcularPorcentaje(0.20);
        btn1.setTextColor(Color.parseColor("#000000"));
        btn2.setTextColor(Color.parseColor("#000000"));
        btn3.setTextColor(Color.parseColor("#000000"));
        btn4.setTextColor(Color.parseColor("#91b029"));
        btn5.setTextColor(Color.parseColor("#000000"));
        btn6.setTextColor(Color.parseColor("#000000"));
        btn7.setTextColor(Color.parseColor("#000000"));
        btn8.setTextColor(Color.parseColor("#000000"));
    }
    public void btn_25 (View view){
        CalcularPorcentaje(0.25);
        btn1.setTextColor(Color.parseColor("#000000"));
        btn2.setTextColor(Color.parseColor("#000000"));
        btn3.setTextColor(Color.parseColor("#000000"));
        btn4.setTextColor(Color.parseColor("#000000"));
        btn5.setTextColor(Color.parseColor("#91b029"));
        btn6.setTextColor(Color.parseColor("#000000"));
        btn7.setTextColor(Color.parseColor("#000000"));
        btn8.setTextColor(Color.parseColor("#000000"));
    }
    public void btn_30 (View view){
        CalcularPorcentaje(0.30);
        btn1.setTextColor(Color.parseColor("#000000"));
        btn2.setTextColor(Color.parseColor("#000000"));
        btn3.setTextColor(Color.parseColor("#000000"));
        btn4.setTextColor(Color.parseColor("#000000"));
        btn5.setTextColor(Color.parseColor("#000000"));
        btn6.setTextColor(Color.parseColor("#91b029"));
        btn7.setTextColor(Color.parseColor("#000000"));
        btn8.setTextColor(Color.parseColor("#000000"));
    }
    public void btn_40 (View view){
        CalcularPorcentaje(0.40);
        btn1.setTextColor(Color.parseColor("#000000"));
        btn2.setTextColor(Color.parseColor("#000000"));
        btn3.setTextColor(Color.parseColor("#000000"));
        btn4.setTextColor(Color.parseColor("#000000"));
        btn5.setTextColor(Color.parseColor("#000000"));
        btn6.setTextColor(Color.parseColor("#000000"));
        btn7.setTextColor(Color.parseColor("#91b029"));
        btn8.setTextColor(Color.parseColor("#000000"));
    }
    public void btn_50 (View view){
        CalcularPorcentaje(0.50);
        btn1.setTextColor(Color.parseColor("#000000"));
        btn2.setTextColor(Color.parseColor("#000000"));
        btn3.setTextColor(Color.parseColor("#000000"));
        btn4.setTextColor(Color.parseColor("#000000"));
        btn5.setTextColor(Color.parseColor("#000000"));
        btn6.setTextColor(Color.parseColor("#000000"));
        btn7.setTextColor(Color.parseColor("#000000"));
        btn8.setTextColor(Color.parseColor("#91b029"));
    }
    public void btnBack (View view){
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                    finish();
                } else {
                    finish();
                }

    }
    @Override
    public void onBackPressed() {
        if (contador==0){
            Toast.makeText(this, "Presionar nuevamente para salir...", Toast.LENGTH_SHORT).show();
            contador++;
        }else   {
            if (mInterstitialAd.isLoaded()) {
                mInterstitialAd.show();
                finish();
            } else {
                finish();
//        super.onBackPressed();
            }
            new CountDownTimer(3000,1000){

                @Override
                public void onTick(long l) {

                }

                @Override
                public void onFinish() {
                    contador = 0;
                }
            }.start();
        }
    }
}

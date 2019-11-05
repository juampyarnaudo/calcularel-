package ar.juampiarnaudo.saberelporcentaje;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final double PERCENTAGE_5 = 0.05;
    private static final double PERCENTAGE_10 = 0.10;
    private static final double PERCENTAGE_15 = 0.15;
    private static final double PERCENTAGE_20 = 0.20;
    private static final double PERCENTAGE_25 = 0.25;
    private static final double PERCENTAGE_30 = 0.30;
    private static final double PERCENTAGE_40 = 0.40;
    private static final double PERCENTAGE_50 = 0.50;

    private EditText et1;
    private TextView tv2, tv3, tv4;
    private InterstitialAd mInterstitialAd;
    private boolean mIsSecondTimePressed;
    private Button mBtnPercentage_5, mBtnPercentage_10, mBtnPercentage_15
            , mBtnPercentage_20, mBtnPercentage_25, mBtnPercentage_30
            , mBtnPercentage_40, mBtnPercentage_50, mBtnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initMobileAds();
    }

    private void initViews(){

        et1 = findViewById(R.id.et1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);

        mBtnBack = findViewById(R.id.btnBack);
        mBtnBack.setOnClickListener(this);

        mBtnPercentage_5 = findViewById(R.id.btn1);
        mBtnPercentage_5.setOnClickListener(this);

        mBtnPercentage_10 = findViewById(R.id.btn2);
        mBtnPercentage_10.setOnClickListener(this);

        mBtnPercentage_15 = findViewById(R.id.btn3);
        mBtnPercentage_15.setOnClickListener(this);

        mBtnPercentage_20 = findViewById(R.id.btn4);
        mBtnPercentage_20.setOnClickListener(this);

        mBtnPercentage_25 = findViewById(R.id.btn5);
        mBtnPercentage_25.setOnClickListener(this);

        mBtnPercentage_30 = findViewById(R.id.btn6);
        mBtnPercentage_30.setOnClickListener(this);

        mBtnPercentage_40 = findViewById(R.id.btn7);
        mBtnPercentage_40.setOnClickListener(this);

        mBtnPercentage_50 = findViewById(R.id.btn8);
        mBtnPercentage_50.setOnClickListener(this);

        et1.requestFocus();
    }

    private void initMobileAds(){
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3517612946554837/4721035952");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }

    @Override
    public void onClick(View v) {

        if (v == mBtnPercentage_5){
            configureAllPercentageBtn(PERCENTAGE_5);
        }else if (v == mBtnPercentage_10){
            configureAllPercentageBtn(PERCENTAGE_10);
        }else if (v == mBtnPercentage_15){
            configureAllPercentageBtn(PERCENTAGE_15);
        }else if (v == mBtnPercentage_20){
            configureAllPercentageBtn(PERCENTAGE_20);
        }else if (v == mBtnPercentage_25){
            configureAllPercentageBtn(PERCENTAGE_25);
        }else if (v == mBtnPercentage_30){
            configureAllPercentageBtn(PERCENTAGE_30);
        }else if (v == mBtnPercentage_40){
            configureAllPercentageBtn(PERCENTAGE_40);
        }else if (v == mBtnPercentage_50){
            configureAllPercentageBtn(PERCENTAGE_50);
        }else if (v == mBtnBack){
            if (mInterstitialAd.isLoaded()){
                mInterstitialAd.show();
                finish();
            } else
                finish();
        }
    }

    private void configureAllPercentageBtn(double percentage){

        configureBlackAllTextBtn();

        if (percentage == PERCENTAGE_5){
            mBtnPercentage_5.setTextColor(getResources().getColor(R.color.color_btn_percentage_selected));
        }else if (percentage == PERCENTAGE_10){
            mBtnPercentage_10.setTextColor(getResources().getColor(R.color.color_btn_percentage_selected));

        }else if (percentage == PERCENTAGE_15){
            mBtnPercentage_15.setTextColor(getResources().getColor(R.color.color_btn_percentage_selected));

        }else if (percentage == PERCENTAGE_20){
            mBtnPercentage_20.setTextColor(getResources().getColor(R.color.color_btn_percentage_selected));

        }else if (percentage == PERCENTAGE_25){
            mBtnPercentage_25.setTextColor(getResources().getColor(R.color.color_btn_percentage_selected));

        }else if (percentage == PERCENTAGE_30){
            mBtnPercentage_30.setTextColor(getResources().getColor(R.color.color_btn_percentage_selected));

        }else if (percentage == PERCENTAGE_40){
            mBtnPercentage_40.setTextColor(getResources().getColor(R.color.color_btn_percentage_selected));

        }else {//PERCENTAGE_50
            mBtnPercentage_50.setTextColor(getResources().getColor(R.color.color_btn_percentage_selected));
        }

        CalcularPorcentaje(percentage);
    }

    private void configureBlackAllTextBtn(){
        mBtnPercentage_5.setTextColor(getResources().getColor(R.color.md_black_1000));
        mBtnPercentage_10.setTextColor(getResources().getColor(R.color.md_black_1000));
        mBtnPercentage_15.setTextColor(getResources().getColor(R.color.md_black_1000));
        mBtnPercentage_20.setTextColor(getResources().getColor(R.color.md_black_1000));
        mBtnPercentage_25.setTextColor(getResources().getColor(R.color.md_black_1000));
        mBtnPercentage_30.setTextColor(getResources().getColor(R.color.md_black_1000));
        mBtnPercentage_40.setTextColor(getResources().getColor(R.color.md_black_1000));
        mBtnPercentage_50.setTextColor(getResources().getColor(R.color.md_black_1000));
    }

    private void CalcularPorcentaje(double percentage){
        if(TextUtils.isEmpty(et1.getText().toString())) {
            et1.requestFocus();
            et1.setError(getResources().getString(R.string.text_empty_field));

        } else{
            double valorinicial = (Double.valueOf(et1.getText().toString()));
            double resultado_5 = (Double.valueOf(et1.getText().toString())) * percentage;
            double totalMenosResultado = (Double.valueOf(et1.getText().toString())) * (1-percentage);
            double totalMasResultado = (Double.valueOf(et1.getText().toString())) * (1+percentage);
            String text = "<font color=#000000>El Valor (%) es: $</font> <font color=#000000>"
                    + String.format("%.2f", resultado_5) +" </font>";
            tv2.setText(Html.fromHtml(text));

            String text2 = "<font color=#000000>El Descuento es: $</font>"
                    + valorinicial+" - <font color=#2ca919> $" + String.format("%.2f", resultado_5)
                    +" </font>"  + " = $"+ String.format("%.2f", totalMenosResultado);
            tv3.setText(Html.fromHtml(text2));

            String text3 = "<font color=#000000>El Interés es: $</font>"+ valorinicial
                    +" + <font color=#e70909> $" + String.format("%.2f", resultado_5)
                    +" </font>"  + " = $"+ String.format("%.2f", totalMasResultado);
            tv4.setText(Html.fromHtml(text3));

            et1.clearFocus();
            InputMethodManager inputMethodManager = (InputMethodManager)
                    getSystemService(Activity.INPUT_METHOD_SERVICE);

            if (inputMethodManager!=null)
                inputMethodManager.hideSoftInputFromWindow(et1.getWindowToken(),0);
        }
    }



    @Override
    public void onBackPressed() {
        if (mIsSecondTimePressed){
            if (mInterstitialAd.isLoaded())
                mInterstitialAd.show();

            finish();
            initCounter();
        }else {
            Toast.makeText(this, getResources().getString(R.string.text_close_app), Toast.LENGTH_SHORT).show();
            mIsSecondTimePressed = true;
        }
    }

    private void initCounter(){

        new CountDownTimer(3000,1000){
            @Override
            public void onTick(long l) { }
            @Override
            public void onFinish() { mIsSecondTimePressed = false; }

        }.start();
    }


}

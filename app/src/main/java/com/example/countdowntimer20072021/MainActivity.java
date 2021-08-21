package com.example.countdowntimer20072021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//
//        CountDownTimer countDownTimer = new CountDownTimer(5000,1000) {
//            @Override
//            public void onTick(long l) {
//                // TH1 : Nếu l bé hơn < 1000 : không nhảy vào (dưới api 27 )
//                // Th2 : Nếu l bé hơn < 1000 : vẫn nhảy vào (trên api 27 )
//                if (l >= 1000){
//                    Log.d("BBB",l + "");
//                }
//            }
//
//            @Override
//            public void onFinish() {
//
//            }
//        };
//        countDownTimer.start();
    }
}
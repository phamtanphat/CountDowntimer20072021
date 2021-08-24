package com.example.countdowntimer20072021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mBtnStartBanner;
    ImageView mImg;
    int[] mArrImages = {
            R.drawable.banner1,
            R.drawable.banner2,
            R.drawable.banner3,
            R.drawable.banner4,
            R.drawable.banner5
    };
    int mIndex = 1;
    boolean isRunning = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnStartBanner = findViewById(R.id.buttonStartBanner);
        mImg = findViewById(R.id.imageViewBanner);

        // Task : chạy các hình banner từ tầm đầu tới tấm cuối
        //      + Nếu tấm cuối thì sẽ quay tấm đầu và chạy tiếp


        mBtnStartBanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isRunning){
                    CountDownTimer countDownTimer = new CountDownTimer(1200 , 1000) {
                        @Override
                        public void onTick(long l) {
                            isRunning = true;
                            if (l >= 1000){
                                if (mIndex >= mArrImages.length){
                                    mIndex = 0;
                                }
                                mImg.setImageResource(mArrImages[mIndex]);
                                mIndex++;
                            }
                        }

                        @Override
                        public void onFinish() {
                            this.start();
                        }
                    };
                    countDownTimer.start();
                }

            }
        });






    }
}
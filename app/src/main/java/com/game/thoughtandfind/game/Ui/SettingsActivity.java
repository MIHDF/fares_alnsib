package com.game.thoughtandfind.game.Ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.game.thoughtandfind.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Random;

public class SettingsActivity extends AppCompatActivity {
    ImageView spine, spine_tise;
    Button btn_spine;

    private static final String[] sectors = {"عجلة حظ", "5 نقطة", "8 نقاط", "12 نقاط", "15 نقاط"};
    private static final int[] sectorsDegrees = new int[sectors.length];
    private static final Random random = new Random();
    private int degree = 0;
    private boolean isSpining = false;


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        fullScreen();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
            }
        });
        AdView mAdView = new AdView(this);
        mAdView.setAdSize(AdSize.BANNER);
        mAdView.setAdUnitId("ca-app-pub-2910699213554124/9765608870");

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        spine = findViewById(R.id.spine);
        spine_tise = findViewById(R.id.spine_this);
        btn_spine = findViewById(R.id.btn_spine);

        all();
    }

    private void all() {
        routeion();
        getDegreesForSectors();
        fullScreen();
    }

    private void spin() {

        degree = random.nextInt(sectors.length);
        RotateAnimation rotateAnimation = new RotateAnimation(0, (360 * sectors.length) + sectorsDegrees[degree],
                RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(3000);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setInterpolator(new DecelerateInterpolator());

        rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }


            @Override
            public void onAnimationEnd(Animation animation) {

                if (degree == 0) {
                    Toast.makeText(SettingsActivity.this, "15", Toast.LENGTH_SHORT).show();

                } else if (degree == 1) {
                    Toast.makeText(SettingsActivity.this, "12", Toast.LENGTH_SHORT).show();

                } else if (degree == 2) {
                    Toast.makeText(SettingsActivity.this, "8", Toast.LENGTH_SHORT).show();

                } else if (degree == 3) {
                    Toast.makeText(SettingsActivity.this, "5", Toast.LENGTH_SHORT).show();

                } else if (degree == 4) {
                    Toast.makeText(SettingsActivity.this, "0", Toast.LENGTH_SHORT).show();
                    spin();
                }
                isSpining = false;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        spine.startAnimation(rotateAnimation);
    }

    private void getDegreesForSectors() {
        int setDegree = 360 / sectors.length;
        for (int i = 0; i < sectors.length; i++) {
            sectorsDegrees[i] = (i + 1) * setDegree;

        }
    }

    private void routeion() {
        btn_spine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isSpining) {
                    spin();
                    isSpining = true;

                }
            }
        });
    }

    private void fullScreen() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

}
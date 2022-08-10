package com.game.thoughtandfind.game.Ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.game.thoughtandfind.R;

public class SplashScreen extends AppCompatActivity {
    TextView text_2_splash, text_1_splash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        fullScreen();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        text_1_splash = findViewById(R.id.text_1_splash);
        text_2_splash = findViewById(R.id.text_2_splash);
        Splach();
    }
    private void Splach() {

        Thread thread = new Thread() {
            @Override
            public void run() {

                try {
                    sleep(1250);

                    Intent intent = new Intent(getApplicationContext(), LevelsActivity.class);
                    startActivity(intent);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        thread.start();

        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.animeion4);

        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.animeion2);
        text_1_splash.startAnimation(animation1);
        text_2_splash.startAnimation(animation2);

    }
    private void fullScreen() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
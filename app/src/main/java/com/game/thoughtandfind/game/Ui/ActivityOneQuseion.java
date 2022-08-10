package com.game.thoughtandfind.game.Ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.game.thoughtandfind.R;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Random;

public class ActivityOneQuseion extends AppCompatActivity {

    TextView number_coin, Timer, btn_color_1, btn_color_2, btn_color_3, btn_color_4, btn_color_5, btn_color_this,
            increase10s, help_1, text_help_1, back_and_level_2back_and_level_1;

    int color, color2, color3, color4, color5, colors_tihs, secrnd30, plus10s;

    long sec;

    ArrayList<Integer> arrayList = new ArrayList<>();
    Random random = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fullScreen();
        setContentView(R.layout.activity_one_quseion);
        allFun();


    }


    private void allFun() {
        findview();

        timer();
        GameColors();
        funonCreate();
        text_help_1.setVisibility(View.INVISIBLE);


    }

    @SuppressLint("ClickableViewAccessibility")
    private void funonCreate() {
        colors_tihs = random.nextInt((4 + 1 + 1 + 1));
        btn_color_this.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), arrayList.get(colors_tihs)));

        increase10s.setVisibility(View.INVISIBLE);


        help_1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                int event = motionEvent.getActionMasked();
                switch (event) {
                    case MotionEvent.ACTION_DOWN:
                        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.anim1alqa);
                        text_help_1.startAnimation(animation1);
                        text_help_1.setVisibility(View.VISIBLE);
                        break;
                    case MotionEvent.ACTION_UP:
                        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.anim1alqa);
                        text_help_1.startAnimation(animation2);
                        text_help_1.setVisibility(View.INVISIBLE);
                }
                return true;
            }
        });

        back_and_level_2back_and_level_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityOneQuseion.this, LevelsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        String a = back_and_level_2back_and_level_1.getText().toString();
        Intent intent = getIntent();
        String name = intent.getStringExtra("level1");
        back_and_level_2back_and_level_1.setText(a + " " + name);


    }

    private void fullScreen() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    private void timer() {


        secrnd30 = 41000 + plus10s;
        increase10s.setEnabled(false);

        new CountDownTimer(secrnd30, 1000) {

            public void onTick(long millisUntilFinished) {
                final NumberFormat f = new DecimalFormat();
                final long hour = (millisUntilFinished / 3600000) % 24;
                final long min = (millisUntilFinished / 60000) % 60;
                sec = (millisUntilFinished / 1000) % 60;


                final String x = f.format(hour) + ":" + f.format(min) + ":" + f.format(sec);
                Timer.setText(x);


            }

            // When the task is over it will print 00:00:00 there
            public void onFinish() {
                Timer.setText("00:00:00");

                increase10s.setEnabled(true);
                increase10s.setVisibility(View.VISIBLE);

            }


        }.start();

        increase10s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                increase10s.setEnabled(false);

                new CountDownTimer(secrnd30, 1000) {

                    public void onTick(long millisUntilFinished) {
                        final NumberFormat f = new DecimalFormat();
                        final long hour = (millisUntilFinished / 3600000) % 24;
                        final long min = (millisUntilFinished / 60000) % 60;
                        sec = (millisUntilFinished / 1000) % 60;


                        final String x = f.format(hour) + ":" + f.format(min) + ":" + f.format(sec);
                        Timer.setText(x);


                    }

                    // When the task is over it will print 00:00:00 there
                    public void onFinish() {
                        Timer.setText("00:00:00");
                        increase10s.setEnabled(true);

                    }


                }.start();
            }
//

        });


//    int day = 604800000;

    }

    private void GameColors() {


        arrayList.add(R.color.white);
        arrayList.add(R.color.yallo);
        arrayList.add(R.color.green);
        arrayList.add(R.color.black);
        arrayList.add(R.color.red);
        arrayList.add(R.color.B);
        arrayList.add(R.color.orange);
        arrayList.add(R.color.blue);

        btn_color_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i = 0; i < 10; i++) {
                    color = random.nextInt((4 + 1 + 1 + 1) + 1);
                }

                btn_color_1.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), arrayList.get(color)));
                vildeion(color, color2, color3, color4, color5, colors_tihs);

            }
        });

        btn_color_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 10; i++) {
                    color2 = random.nextInt((4 + 1 + 1 + 1) + 1);
                }
                btn_color_2.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), arrayList.get(color2)));
                vildeion(color, color2, color3, color4, color5, colors_tihs);
            }
        });

        btn_color_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 10; i++) {
                    color3 = random.nextInt((4 + 1 + 1 + 1) + 1);
                }
                btn_color_3.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), arrayList.get(color3)));
                vildeion(color, color2, color3, color4, color5, colors_tihs);
            }
        });

        btn_color_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 10; i++) {
                    color4 = random.nextInt((4 + 1 + 1 + 1) + 1);
                }
                btn_color_4.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), arrayList.get(color4)));
                vildeion(color, color2, color3, color4, color5, colors_tihs);
            }
        });

        btn_color_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 10; i++) {
                    color5 = random.nextInt((4 + 1 + 1 + 1) + 1);
                }
                btn_color_5.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), arrayList.get(color5)));
                vildeion(color, color2, color3, color4, color5, colors_tihs);
            }
        });

    }

    public void vildeion(int color2, int color, int color3, int color4, int color5, int colors_tihs) {

        if (color == color3 && color == color4 && color2 == color && color5 == color && color == colors_tihs
        ) {
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        }
    }

    private void findview() {

        number_coin = findViewById(R.id.number_coin);
        Timer = findViewById(R.id.Timer);
        btn_color_this = findViewById(R.id.btn_color_this);
        btn_color_1 = findViewById(R.id.btn_color_1);
        btn_color_2 = findViewById(R.id.btn_color_2);
        btn_color_3 = findViewById(R.id.btn_color_3);
        btn_color_4 = findViewById(R.id.btn_color_4);
        btn_color_5 = findViewById(R.id.btn_color_5);
        increase10s = findViewById(R.id.increase10s);
        help_1 = findViewById(R.id.help_1);
        text_help_1 = findViewById(R.id.text_help_1);
        back_and_level_2back_and_level_1 = findViewById(R.id.back_and_level_1);

    }
}
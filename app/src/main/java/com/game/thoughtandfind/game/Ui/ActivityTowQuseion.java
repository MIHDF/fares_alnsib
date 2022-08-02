package com.game.thoughtandfind.game.Ui;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.game.thoughtandfind.R;

public class ActivityTowQuseion extends AppCompatActivity {
    ConstraintLayout Layout_Sacend ;
    TextView Number_8, Number_7, Number_6, Number_5, Number_4, Number_3, Number_2, Number_1, set_text, delete, number_coin;
    String text = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fullScreen();
        setContentView(R.layout.activity_tow_quseion);
        allFun();
    }

    private void allFun() {
        findview();
        Numberfun();
        deleteClic();

    }

    private void fullScreen() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    private void Numberfun() {

        Number_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number_8.setVisibility(View.INVISIBLE);
                text += Number_8.getText().toString();
                set_text.setText(text);
                deletefun();


            }
        });

        Number_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number_7.setVisibility(View.INVISIBLE);
                text += Number_7.getText().toString();

                set_text.setText(text);
                deletefun();


            }
        });

        Number_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number_6.setVisibility(View.INVISIBLE);

                text += Number_6.getText().toString();
                set_text.setText(text);
                deletefun();


            }
        });

        Number_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number_5.setVisibility(View.INVISIBLE);

                text += Number_5.getText().toString();
                set_text.setText(text);
                deletefun();

            }
        });

        Number_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number_4.setVisibility(View.INVISIBLE);

                text += Number_4.getText().toString();
                set_text.setText(text);
                deletefun();

            }
        });

        Number_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number_3.setVisibility(View.INVISIBLE);

                text += Number_3.getText().toString();
                set_text.setText(text);
                deletefun();

            }
        });

        Number_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number_2.setVisibility(View.INVISIBLE);

                text += Number_2.getText().toString();
                set_text.setText(text);
                deletefun();

            }
        });

        Number_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number_1.setVisibility(View.INVISIBLE);

                text += Number_1.getText().toString();
                set_text.setText(text);
                deletefun();

            }
        });
    }

    private void funcionAnimion() {

        if (Number_1.getVisibility() == View.INVISIBLE) {
            Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.animeion2);

            Number_1.startAnimation(animation1);
        }


        if (Number_2.getVisibility() == View.INVISIBLE) {
            Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.animeion2);

            Number_2.startAnimation(animation1);
        }

        if (Number_3.getVisibility() == View.INVISIBLE) {
            Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.animeion2);

            Number_3.startAnimation(animation1);
        }

        if (Number_4.getVisibility() == View.INVISIBLE) {
            Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.animeion2);

            Number_4.startAnimation(animation1);
        }

        if (Number_5.getVisibility() == View.INVISIBLE) {
            Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.animeion2);

            Number_5.startAnimation(animation1);
        }

        if (Number_6.getVisibility() == View.INVISIBLE) {
            Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.animeion2);

            Number_6.startAnimation(animation1);
        }

        if (Number_7.getVisibility() == View.INVISIBLE) {
            Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.animeion2);

            Number_7.startAnimation(animation1);
        }


        if (Number_8.getVisibility() == View.INVISIBLE) {
            Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.animeion2);

            Number_8.startAnimation(animation1);
        }


    }

    private void deleteText() {

        funcionAnimion();
        String x = " ";
        text = x;
        delete.setVisibility(View.INVISIBLE);
        set_text.setText("");
        Number_1.setVisibility(View.VISIBLE);
        Number_2.setVisibility(View.VISIBLE);
        Number_3.setVisibility(View.VISIBLE);
        Number_4.setVisibility(View.VISIBLE);
        Number_5.setVisibility(View.VISIBLE);
        Number_6.setVisibility(View.VISIBLE);
        Number_7.setVisibility(View.VISIBLE);
        Number_8.setVisibility(View.VISIBLE);

    }

    private void deleteClic() {
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deleteText();
            }
        });

    }

    private void deletefun() {
        String x = set_text.getText().toString();
        if (x.equals(text)) {
            delete.setVisibility(View.VISIBLE);

        }
    }
    private void findview() {

        number_coin = findViewById(R.id.number_coin);
        Layout_Sacend = findViewById(R.id.Layout_Sacend);
        Number_8 = findViewById(R.id.Number_8);
        Number_7 = findViewById(R.id.Number_7);
        Number_6 = findViewById(R.id.Number_6);
        Number_5 = findViewById(R.id.Number_5);
        Number_4 = findViewById(R.id.Number_4);
        Number_3 = findViewById(R.id.Number_3);
        Number_2 = findViewById(R.id.Number_2);
        Number_1 = findViewById(R.id.Number_1);
        set_text = findViewById(R.id.set_text);
        delete = findViewById(R.id.delete);


    }


}
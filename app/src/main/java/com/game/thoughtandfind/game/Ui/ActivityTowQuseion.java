package com.game.thoughtandfind.game.Ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.game.thoughtandfind.R;
import com.game.thoughtandfind.game.DbSqllite.DbHelper;
import com.game.thoughtandfind.game.DbSqllite.Question3;
import com.game.thoughtandfind.game.DbSqllite.Questions2;

import java.util.Collections;
import java.util.List;

public class ActivityTowQuseion extends AppCompatActivity {

    LinearLayout Layout_Sacend;
    TextView Number_8, Number_7, Number_6, Number_5, Number_4, Number_3, Number_2, Number_1, set_text, delete, number_coin,
            help_2, text_help_2, back_and_level_2, textViewQuestion2 , OnClick2;
    String text = "";
    private List<Questions2> questions2slist;
//    int ;
    Questions2 currenquestions2;
    MotionEvent motionEvent2 ;
    private int questionCounter , questionCountTotal;


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
        info();
        DBHelper();

        delete.setVisibility(View.INVISIBLE);
        text_help_2.setVisibility(View.INVISIBLE);

        if (delete.getVisibility() == View.VISIBLE) {
            Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.animeion2);
            delete.startAnimation(animation2);

        }
    }


    private void DBHelper() {
        DbHelper dbHelper = new DbHelper(this);

        questions2slist = dbHelper.getAllQuestions2();
        questionCountTotal = questions2slist.size();
        Collections.shuffle(questions2slist);

        if (questionCounter < questionCountTotal) {

            currenquestions2 = questions2slist.get(questionCounter);
            textViewQuestion2.setText(currenquestions2.getQuestion2());
            Number_1.setText(currenquestions2.getAlphabet1());
            Number_2.setText(currenquestions2.getAlphabet2());
            Number_3.setText(currenquestions2.getAlphabet3());
            Number_4.setText(currenquestions2.getAlphabet4());
            Number_5.setText(currenquestions2.getAlphabet5());
            Number_6.setText(currenquestions2.getAlphabet6());
            Number_7.setText(currenquestions2.getAlphabet7());
            Number_8.setText(currenquestions2.getAlphabet8());
            //


            OnClick2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (currenquestions2.getAnswer2().equals(set_text.getText().toString())){
                        Toast.makeText(getApplicationContext(), "صحيح", Toast.LENGTH_SHORT).show();

                    }else {
                        Toast.makeText(getApplicationContext(), "خطأ", Toast.LENGTH_SHORT).show();
//                        motionEvent2.
                        Layout_Sacend.setBackgroundColor(getColor(R.color.red));

                    }
                }
            });
        }
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

        if (delete.getVisibility() == View.INVISIBLE) {
            Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.animeion2);
            delete.startAnimation(animation1);
        }


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

//
//                if (delete.getVisibility() == View.VISIBLE) {
//                    Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),
//                            R.anim.animeion2);
//                    delete.startAnimation(animation2);
//                }
            }
        });

    }

    private void deletefun() {
        String x = set_text.getText().toString();
        if (x.equals(text)) {
            delete.setVisibility(View.VISIBLE);


        }
    }

    @SuppressLint("ClickableViewAccessibility")
    private void info() {
        help_2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                int event = motionEvent.getActionMasked();
                switch (event) {
                    case MotionEvent.ACTION_DOWN:
                        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.anim1alqa);

                        text_help_2.startAnimation(animation1);
                        text_help_2.setVisibility(View.VISIBLE);
                        break;
                    case MotionEvent.ACTION_UP:
                        text_help_2.setVisibility(View.INVISIBLE);
                        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.anim1alqa);

                        text_help_2.startAnimation(animation2);
                }
                return true;
            }
        });


        back_and_level_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTowQuseion.this, LevelsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        String a = back_and_level_2.getText().toString();
        Intent intent = getIntent();
        String name = intent.getStringExtra("level2");
        back_and_level_2.setText(a + " " + name);

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
        help_2 = findViewById(R.id.help_2);
        text_help_2 = findViewById(R.id.text_help_2);
        back_and_level_2 = findViewById(R.id.back_and_level_2);
        textViewQuestion2 = findViewById(R.id.textViewQuestion2);
        OnClick2 = findViewById(R.id.OnClick2);


    }


}
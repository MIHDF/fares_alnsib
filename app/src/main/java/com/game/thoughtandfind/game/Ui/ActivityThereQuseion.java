package com.game.thoughtandfind.game.Ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.game.thoughtandfind.R;
import com.game.thoughtandfind.game.DbSqllite.DbHelper;
import com.game.thoughtandfind.game.DbSqllite.GetAndSet;

import java.util.Collections;
import java.util.List;

public class ActivityThereQuseion extends AppCompatActivity {

    TextView textViewQuestion, op1, op2, op3, op4, yes, score_;
    Button buttonConfirmNext;
    private ColorStateList textColorDefaultRb;
    private List<GetAndSet> frageList;
    private int questionCounter;
    private int questionCountTotal;
    private GetAndSet currentFrage;
    private int score;
    long Time;
    private boolean answered;

    @Override
    public void onBackPressed() {
        if (Time + 1500 > System.currentTimeMillis()) {
            super.onBackPressed();
        } else {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();

        }
        Time = System.currentTimeMillis();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        fullScreen();
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_there_quseion);
        allFun();


    }

    private void fullScreen() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    private void db() {
        textColorDefaultRb = op1.getTextColors();

        DbHelper dbHelper = new DbHelper(this);
        frageList = dbHelper.getAllQuestions();
        questionCountTotal = frageList.size();
        Collections.shuffle(frageList);

        showNextQuestion();

        buttonConfirmNext.setOnClickListener(v -> {
            methodFun();

            if (buttonConfirmNext.getText().equals("التالي")) {
                op1.setEnabled(true);
                op2.setEnabled(true);
                op3.setEnabled(true);
                op4.setEnabled(true);
            } else if (buttonConfirmNext.getText().equals("انهاء")) {
                op1.setEnabled(false);
                op2.setEnabled(false);
                op3.setEnabled(false);
                op4.setEnabled(false);
            } else if (buttonConfirmNext.getText().equals("تأكد")) {
                op1.setEnabled(false);
                op2.setEnabled(false);
                op3.setEnabled(false);
                op4.setEnabled(false);
            }

            if (!answered) {

                checkAnswer();


            } else {
                showNextQuestion();
            }
        });
    }

    @SuppressLint("SetTextI18n")
    private void checkAnswer() {
        answered = true;


        score = score + 10;

        score_.setText("نتيجة: " + score);
//        }

        showSolution();

    }




    private void showSolution() {
        op1.setTextColor(Color.RED);
        op2.setTextColor(Color.RED);
        op3.setTextColor(Color.RED);
        op4.setTextColor(Color.RED);


        switch (currentFrage.getAnswerNr()) {

            case 1:
                op1.setTextColor(Color.GREEN);
                textViewQuestion.setText("الإجابة 1 صحيحة");
                break;

            case 2:
                op2.setTextColor(Color.GREEN);
                textViewQuestion.setText("الإجابة 2 صحيحة");
                break;
            case 3:
                op3.setTextColor(Color.GREEN);
                textViewQuestion.setText("الإجابة 3 صحيحة");
                break;
            case 4:
                op4.setTextColor(Color.GREEN);
                textViewQuestion.setText("الإجابة 4 صحيحة");
                break;
        }


        if (questionCounter < questionCountTotal) {
            buttonConfirmNext.setText("التالي");
        } else {
            buttonConfirmNext.setText("انهاء");
        }
    }

    @SuppressLint("SetTextI18n")
    private void showNextQuestion() {
        op1.setTextColor(textColorDefaultRb);
        op2.setTextColor(textColorDefaultRb);
        op3.setTextColor(textColorDefaultRb);
        op4.setTextColor(textColorDefaultRb);

        op1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                methodFun();
                op1.setBackgroundResource(R.drawable.shep26);

            }
        });
        op2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                methodFun();
                op2.setBackgroundResource(R.drawable.shep26);

            }
        });
        op3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                methodFun();
                op3.setBackgroundResource(R.drawable.shep26);

            }
        });
        op4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                methodFun();
                op4.setBackgroundResource(R.drawable.shep26);

            }
        });


        if (questionCounter < questionCountTotal) {
            currentFrage = frageList.get(questionCounter);

            textViewQuestion.setText(currentFrage.getQuestion());
            op1.setText(currentFrage.getOption1());
            op2.setText(currentFrage.getOption2());
            op3.setText(currentFrage.getOption3());
            op4.setText(currentFrage.getOption4());


            questionCounter++;
            answered = false;

            buttonConfirmNext.setText("تأكد");
        } else {

            Toast.makeText(this, "ak;sgmklasklgal", Toast.LENGTH_SHORT).show();
        }
    }

    private void allFun() {
        findView();
        db();

    }

    private void findView() {
        textViewQuestion = findViewById(R.id.textViewQuestion);
        op1 = findViewById(R.id.op1);
        op2 = findViewById(R.id.op2);
        op3 = findViewById(R.id.op3);
        op4 = findViewById(R.id.op4);
        yes = findViewById(R.id.yes);
        score_ = findViewById(R.id.score_);
        buttonConfirmNext = findViewById(R.id.buttonConfirmNext);
    }

    @SuppressLint("ResourceType")
    private void methodFun() {
        op1.setBackgroundResource(R.drawable.shep24);
        op2.setBackgroundResource(R.drawable.shep24);
        op3.setBackgroundResource(R.drawable.shep24);
        op4.setBackgroundResource(R.drawable.shep24);
    }




}
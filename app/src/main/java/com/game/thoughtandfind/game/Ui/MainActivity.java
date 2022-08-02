package com.game.thoughtandfind.game.Ui;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.game.thoughtandfind.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.list);

//        arrayList.set(0, "fares");
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, ,
//                android.R.layout.simple_spinner_item);
//        listView.setAdapter(adapter);

    }
}
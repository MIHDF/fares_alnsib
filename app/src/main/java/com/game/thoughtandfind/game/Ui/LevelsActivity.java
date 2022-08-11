package com.game.thoughtandfind.game.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;

import com.game.thoughtandfind.game.DbSqllite.Adapter;
import com.game.thoughtandfind.R;

public class LevelsActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        fullScreen();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);





        gridView = findViewById(R.id.gridView);
        String[] StringArray = {

                "1", "2", "3", "4",
                "5", "6", "7", "8",
                "9", "10", "11", "12",
                "13", "14", "15", "16",
                "17", "18", "19", "20",
                "21", "22", "23", "24",
                "25", "26", "27", "28",
                "29", "30", "31", "32",
                "33", "34", "35", "36",
                "37", "38", "39", "40",
                "41", "42", "43", "44",
                "45", "46", "47", "48",
                "49", "50", "51",


                "52", "53", "54",
                "55", "56", "57", "58",
                "59", "60", "61", "62",
                "63", "64", "65", "66",
                "67", "68", "69", "70",
                "71", "72", "73", "74",
                "75", "76", "77", "78",
                "79", "80", "81", "82",
                "83", "84", "85", "86",
                "87", "88", "89", "90",
                "91", "92", "93", "94",
                "95", "96", "97", "98",
                "99", "100", "101", "102",


                "103", "104",
                "105", "106", "107", "108",
                "109", "110", "111", "112",
                "113", "114", "115", "116",
                "117", "118", "119", "120",
                "121", "122", "123", "124",
                "125", "126", "127", "128",
                "129", "130", "131", "132",
                "133", "134", "135", "136",
                "137", "138", "139", "140",
                "141", "142", "143", "144",
                "145", "146", "147", "148",
                "149", "150", "151", "152", "153"

        };



        Adapter adapter = new Adapter(this, StringArray);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String f = adapterView.getItemAtPosition(i).toString();


                float a = Float.parseFloat(adapterView.getItemAtPosition(i).toString());
                float mod = a % 3;
                if (mod == 1) {

//                    Toast.makeText(LevelsActivity.this, f + "mod1", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LevelsActivity.this, ActivityOneQuseion.class);
                    intent.putExtra("level1",f);
                    startActivity(intent);
                    finish();
                } else if (mod == 2) {
//                    Toast.makeText(LevelsActivity.this, f + "mod2", Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(LevelsActivity.this, ActivityTowQuseion.class);
                    intent2.putExtra("level2",f);

                    startActivity(intent2);
                    finish();
                } else {
//                    Toast.makeText(LevelsActivity.this, f + "mod3", Toast.LENGTH_SHORT).show();

                    Intent intent3 = new Intent(LevelsActivity.this, ActivityThereQuseion.class);
                    intent3.putExtra("level3",f);
                    startActivity(intent3);
                    finish();
                }
            }
        });

    }


    private void fullScreen() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
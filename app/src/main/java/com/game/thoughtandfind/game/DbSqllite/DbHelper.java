package com.game.thoughtandfind.game.DbSqllite;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "DbHelper";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                FinalContract.FragenTable.TABLE_NAME + " ( " +
                FinalContract.FragenTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                FinalContract.FragenTable.COLUMN_QUESTION + " TEXT, " +
                FinalContract.FragenTable.COLUMN_OPTION1 + " TEXT, " +
                FinalContract.FragenTable.COLUMN_OPTION2 + " TEXT, " +
                FinalContract.FragenTable.COLUMN_OPTION3 + " TEXT, " +
                FinalContract.FragenTable.COLUMN_OPTION4 + " TEXT, " +
                FinalContract.FragenTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillFragenTable();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + FinalContract.FragenTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillFragenTable() {
        GetAndSet q1 = new GetAndSet("كم عدد الجيوب الأنفية لدى الإنسان", "8", "7", "5", "4", 1);
        addQuestion(q1);
        GetAndSet q2 = new GetAndSet("ما هو مقياس سرعة السفن", "الميل", "الكيلو", "العقدة", "الإنش", 3);
        addQuestion(q2);
        GetAndSet q3 = new GetAndSet("ما هي وظيفة فيتامين A", "بناء العظام", "علاج الجروح", "انتاج اللعاب", "تقوية النظر", 4);
        addQuestion(q3);
        GetAndSet q4 = new GetAndSet("كم هي عدد الدول التي يمر منها نهر النيل", "5", "8", "7", "10", 4);
        addQuestion(q4);
        GetAndSet q5 = new GetAndSet("كم عام استمر حكم الخلافة العثمانية", "373 عاما", "346 عاما", "400 عاما", "423 عاما", 3);
        addQuestion(q5);
        GetAndSet q6 = new GetAndSet("من هو الحيوان الذي يأكل أبنائه إذا جاع", "القطة", "النمر", "الحوت الأزرق", "الذئب", 2);
        addQuestion(q6);
        GetAndSet q7 = new GetAndSet("كم عدد أجنحة النحلة", "4", "8", "7", "5", 1);
        addQuestion(q7);
        GetAndSet q8 = new GetAndSet("من هي أول دولة عربية خليجية ظهر فيها البترول", "السعودية", "قطر", "الإمارات", "البحرين", 4);
        addQuestion(q8);
        GetAndSet q9 = new GetAndSet("ما اسم الدولة التي ينبع منها نهر النيل", "السودان", "أثيوبيا", "أوغندا", "المجر", 3);
        addQuestion(q9);
        GetAndSet q10 = new GetAndSet("كم عدد أسماء الأسد في اللغة العربية", "235", "837", "1500", "938", 3);
        addQuestion(q10);
        GetAndSet q11 = new GetAndSet("في أي عام صنعت البطاقتان الصفراء والحمراء في العالم", "1934", "1964", "1976", "1997", 4);
        addQuestion(q11);
        GetAndSet q12 = new GetAndSet("من هي أول دولة عربية شاركت في الألومبيات", "مصر", "العراق", "المغرب", "الجزائر", 1);
        addQuestion(q12);
        GetAndSet q13 = new GetAndSet("من هي أول دولة عرفت لعبة الشطرنج", "الصين", "الهند", "روسيا", "اليابان", 2);
        addQuestion(q13);
        GetAndSet q14 = new GetAndSet("ما هي اسم أشهر رياضة في اسبانيا", "كرة القدم", "كرة السلة", "البلياردو", "مصارعة الثيران", 4);
        addQuestion(q14);
        GetAndSet q15 = new GetAndSet("في أي عام كانت غزوة خيبر", "4 هجري", "7 هجري", "5 هجري", "8 هجري", 2);
        addQuestion(q15);
        GetAndSet q16 = new GetAndSet("كم عدد السعرات الحرارية في كوب الماء", "0 سعرة حرارية", "10 سعرة حرارية", "5 سعرة حرارية", "20 سعرة حرارية", 1);
        addQuestion(q16);
        GetAndSet q17 = new GetAndSet("ما هو أكثر أنواع الدم إنتشارا", "فصيلة دم A", "فصيلة دم B", "فصيلة دم AB", "فصيلة دم O", 4);
        addQuestion(q17);
        GetAndSet q18 = new GetAndSet("ما هي وظيفة المخيخ", "زيادة التركيز", "ضبط التوازن", "مستقبل للأعصاب", "مركز التفكير", 2);
        addQuestion(q18);
        GetAndSet q19 = new GetAndSet("في أي عام غرقت سفينة التايتنك", "1932", "1921", "1912", "1906", 3);
        addQuestion(q19);
        GetAndSet q20 = new GetAndSet("كم يصل إرتفاع برج خليفة", "843 متر", "828 متر", "850 متر", "889 متر", 2);
        addQuestion(q20);
        GetAndSet q21 = new GetAndSet("ما هو أكبر محيط في العالم", "المحيط الهادي", "المحيط الهندي", "المحيط الأطلسي", "المحيط المتجمد الشمالي", 1);
        addQuestion(q21);

    }

    private void addQuestion(GetAndSet frage) {
        ContentValues ahmad = new ContentValues();
        ahmad.put(FinalContract.FragenTable.COLUMN_QUESTION, frage.getQuestion());
        ahmad.put(FinalContract.FragenTable.COLUMN_OPTION1, frage.getOption1());
        ahmad.put(FinalContract.FragenTable.COLUMN_OPTION2, frage.getOption2());
        ahmad.put(FinalContract.FragenTable.COLUMN_OPTION3, frage.getOption3());
        ahmad.put(FinalContract.FragenTable.COLUMN_OPTION4, frage.getOption4());

        ahmad.put(FinalContract.FragenTable.COLUMN_ANSWER_NR, frage.getAnswerNr());
        db.insert(FinalContract.FragenTable.TABLE_NAME, null, ahmad);
    }

    @SuppressLint("Range")
    public List<GetAndSet> getAllQuestions() {
        List<GetAndSet> frageList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + FinalContract.FragenTable.TABLE_NAME
                , null);

        if (c.moveToFirst()) {
            do {
                GetAndSet frage = new GetAndSet();
                frage.setQuestion(c.getString(c.getColumnIndex(FinalContract.FragenTable.COLUMN_QUESTION)));
                frage.setOption1(c.getString(c.getColumnIndex(FinalContract.FragenTable.COLUMN_OPTION1)));
                frage.setOption2(c.getString(c.getColumnIndex(FinalContract.FragenTable.COLUMN_OPTION2)));
                frage.setOption3(c.getString(c.getColumnIndex(FinalContract.FragenTable.COLUMN_OPTION3)));
                frage.setOption4(c.getString(c.getColumnIndex(FinalContract.FragenTable.COLUMN_OPTION4)));

                frage.setAnswerNr(c.getInt(c.getColumnIndex(FinalContract.FragenTable.COLUMN_ANSWER_NR)));
                frageList.add(frage);
            } while (c.moveToNext());
        }

        c.close();
        return frageList;
    }
}

package com.game.thoughtandfind.game.DbSqllite;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

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


        final String SQL_CREATE_QUESTIONS_TABLE2 = "CREATE TABLE " +
                FinalContract.DbTable.TABLE_NAME2 + " ( " +
                FinalContract.DbTable.ID2 + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                FinalContract.DbTable.COLUMN_QUESTION2 + " TEXT, " +
                FinalContract.DbTable.COLUMN_ALPHA_BET1 + " TEXT, " +
                FinalContract.DbTable.COLUMN_ALPHA_BET2 + " TEXT, " +
                FinalContract.DbTable.COLUMN_ALPHA_BET3 + " TEXT, " +
                FinalContract.DbTable.COLUMN_ALPHA_BET4 + " TEXT, " +
                FinalContract.DbTable.COLUMN_ALPHA_BET5 + " TEXT, " +
                FinalContract.DbTable.COLUMN_ALPHA_BET6 + " TEXT, " +
                FinalContract.DbTable.COLUMN_ALPHA_BET7 + " TEXT, " +
                FinalContract.DbTable.COLUMN_ALPHA_BET8 + " TEXT, " +
                FinalContract.DbTable.COLUMN_ANSWER_NR2 + " TEXT " +

                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE2);
        fillQuestions2Table();


        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                FinalContract.DbTable.TABLE_NAME3 + " ( " +
                FinalContract.DbTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                FinalContract.DbTable.COLUMN_QUESTION3 + " TEXT, " +
                FinalContract.DbTable.COLUMN_OPTION1 + " TEXT, " +
                FinalContract.DbTable.COLUMN_OPTION2 + " TEXT, " +
                FinalContract.DbTable.COLUMN_OPTION3 + " TEXT, " +
                FinalContract.DbTable.COLUMN_OPTION4 + " TEXT, " +
                FinalContract.DbTable.COLUMN_ANSWER_NR3 + " INTEGER" +

                ")";

//        db.execSQL("create Table users(Score TEXT)");

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestions3Table();
//        fillQuestions2Table();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + FinalContract.DbTable.TABLE_NAME3);
        db.execSQL("DROP TABLE IF EXISTS " + FinalContract.DbTable.TABLE_NAME2);
        onCreate(db);
    }


    private void fillQuestions2Table() {

        Questions2 q1 = new Questions2("ما إسم الدولة التي لديها أقل نسبة سكان في العالم", "منغوليا", "ل", "ن", "ي", "غ", "و", "س", "م", "ا");
        addQuestion2(q1);
        Questions2 q2 = new Questions2("ما هو المعدن الأعلى سعرا", "الراديوم", "ا", "ر", "م", "ل", "ا", "د", "ي", "و");
        addQuestion2(q2);
        Questions2 q3 = new Questions2("ما هو الشكل الذي يبدو عليه شكل مجرة درب التبانة", "الحلزوني", "ا", "ز", "ح", "ل", "و", "ي", "ل", "ن");
        addQuestion2(q3);
        Questions2 q4 = new Questions2("ما هي المدينة المسماة بمدينة الضباب", "لندن", "د", "ن", "ل", "س", "ن", "ر", "ك", "ن");
        addQuestion2(q4);
        Questions2 q5 = new Questions2("ما هو الذهب الأسود", "البترول", "ل", "ر", "ب", "ت", "ا", "و", "ل", "ف");
        addQuestion2(q5);
        Questions2 q6 = new Questions2("ما هي السورة التي تقع في نصف الفرآن الكريم", "الكهف", "ض", "س", "ك", "ل", "ف", "ا", "ه", "ن");
        addQuestion2(q6);
        Questions2 q7 = new Questions2("ما هي الدولة التي اسمها بمعنى ( بلد الأرانب )", "أسبانيا", "أ", "ي", "س", "ط", "ا", "ن", "ي", "ب");
        addQuestion2(q7);
        Questions2 q8 = new Questions2("ما هي آخر سورة ف القرآن نزلت في مكة", "الروم", "ر", "ل", "ك", "ه", "ف", "ا", "و", "م");
        addQuestion2(q8);
        Questions2 q9 = new Questions2("من هو العالم المصري الذي حصل على جائزة نوبل", "أحمدزويل", "ح", "د", "ز", "ل", "ي", "م", "أ", "و");
        addQuestion2(q9);
        Questions2 q10 = new Questions2("ما هي أكبر قمة في العالم", "افريست", "ف", "ي", "س", "ن", "ا", "ت", "ر", "م");
        addQuestion2(q10);
        Questions2 q11 = new Questions2("ماذا كان يطلق على الصين قديما", "كاثاي", "ا", "ث", "ي", "ي", "ا", "ن", "ك", "ص");
        addQuestion2(q11);
        Questions2 q12 = new Questions2("ما هو المعدن الوحيد الذي يوجد في حالة سائلة", "الزئبق", "ح", "ا", "ل", "ز", "د", "ئ", "ق", "ب");
        addQuestion2(q12);
        Questions2 q13 = new Questions2("ما هو العضو الوحيد في جسم الإنسان الذي يعود للحياة بعد القطع", "الكبد", "م", "ع", "د", "ة", "ا", "ك", "ب", "ل");
        addQuestion2(q13);
        Questions2 q14 = new Questions2("ما هي الدولة التي يطلق عليها أرض الشمس المشرقة", "اليابان", "ص", "ا", "ب", "ن", "ي", "ا", "ل", "ا");
        addQuestion2(q14);
        Questions2 q15 = new Questions2("ما هي الدولة الأوربية التي تمتلك جزيرة صقلية", "إيطاليا", "إ", "ي", "ط", "س", "ي", "ا", "ا", "ل");
        addQuestion2(q15);
        Questions2 q16 = new Questions2("ما هو الإسم الذي يطلق على الجزر العديدة المتقابلة", "الأرخبيل", "ا", "ل", "ل", "خ", "ي", "أ", "ر", "ب");
        addQuestion2(q16);
        Questions2 q17 = new Questions2("ما هو إسم الجزء الملون من العين المحيط بالحدقية", "القزحية", "ا", "ق", "ز", "ح", "ي", "ة", "ل", "ب");
        addQuestion2(q17);


        Questions2 q18 = new Questions2("لغز : ما هو الشيئ الذي تحمله ويحملك", "الحذاء", "ا", "ق", "ذ", "ا", "ح", "ل", "ة", "ء");
        addQuestion2(q18);
        Questions2 q19 = new Questions2("لغز : شيئ يعمل في حالة واحدة وهي عندما تدخل يدك في عينيه", "المقص", "ض", "م", "ا", "ش", "م", "ل", "ق", "س");
        addQuestion2(q19);
        Questions2 q20 = new Questions2("لغز : كلمة من 8 حروف ولكن ستجد فيها كل الحروف", "الأبجدية", "ا", "د", "ب", "ج", "ي", "ة", "ل", "أ");
        addQuestion2(q20);
        Questions2 q21 = new Questions2("لغز : ما هو الشيئ الذي يتجمد عندما يتعرض ألى الحرارة", "البيض", "ش", "م", "ب", "م", "ي", "ل", "ض", "ا");
        addQuestion2(q21);
        Questions2 q22 = new Questions2("لغز : ما هو الشيئ الذي لا يمكنك معرفة بدايته ولا نهايته", "الدائرة", "ا", "ث", "ر", "ل", "ا", "ة", "د", "ئ");
        addQuestion2(q22);
        Questions2 q23 = new Questions2("لغز : ما هو السؤال الذي تختلف إجابته في كل مرة تسأله", "الوقت", "ا", "ت", "ل", "ش", "و", "م", "ق", "س");
        addQuestion2(q23);
        Questions2 q24 = new Questions2("لغز : ما هو الشيئ الذي يمتلك الكثير من الأسنان ولكن لا يستطيع أن يعض", "المشط", "ا", "ع", "س", "ل", "م", "ش", "ة", "ط");
        addQuestion2(q24);
        Questions2 q25 = new Questions2("لغز : ما هو العدد الذي إذا قمنا بضربه في نفسه ثم أضفنا عليه 5 أصبح الناتج 30", "5", "6", "2", "1", "3", "12", "10", "7", "8");
        addQuestion2(q25);
        Questions2 q26 = new Questions2("لغز : ما هو الشيئ الذي يكون في أول الشهر وآخره", "الهلال", "ش", "ا", "ل", "ل", "ل", "م", "ه", "ا");
        addQuestion2(q26);
        Questions2 q27 = new Questions2("لغز : ما هو الحيوان الذي إذا فتح فمه أكثر من دقيقة يموت", "الضفدع", "ض", "د", "ط", "ا", "ف", "ق", "ل", "ع");
        addQuestion2(q27);
        Questions2 q28 = new Questions2("لغز : ما هي الفاكهة التي تسمى بلونها", "البرتقال", "ب", "ا", "ت", "ل", "ر", "ق", "ا", "ل");
        addQuestion2(q28);
        Questions2 q29 = new Questions2("لغز : ينبض بدون قلب", "الساعة", "س", "ا", "س", "ل", "ة", "ا", "ع", "ا");
        addQuestion2(q29);
        Questions2 q30 = new Questions2("ما هو الشيئ الذي لا يبتل حتى ولو دخل عليه ماء", "الضوء", "ش", "س", "ا", "ض", "ل", "ء", "م", "و");
        addQuestion2(q30);
        Questions2 q31 = new Questions2("لغز : له أوراق وما هو بنبات وله جلد وما هو بحيوان وعنده علم وما هو بإنسان", "الكتاب", "ك", "ت", "ف", "ا", "ا", "ا", "ل", "ب");
        addQuestion2(q31);
        Questions2 q32 = new Questions2("لغز : ما هو الشيئ الذي كلما أخذنا منه زاد", "الحفرة", "ا", "ع", "م", "ل", "ة", "ح", "ف", "ر");
        addQuestion2(q32);
        Questions2 q33 = new Questions2("لغز : ما هو الشيئ الذي كلما زاد نقص", "العمر", "ح", "ع", "ف", "ر", "ء", "ا", "م", "ل");
        addQuestion2(q33);
        Questions2 q34 = new Questions2(" لغز : ما هو الشيئ الذي يوصلك إلى منزلك دون ان يتحرك", "الطريق", "ط", "ر", "ل", "ي", "ك", "ق", "ة", "ا");
        addQuestion2(q34);


        Questions2 q35 = new Questions2("من هو أذكى الكائنات البحرية", "الدولفين", "ل", "ي", "ف", "ن", "د", "ا", "و", "ل");
        addQuestion2(q35);
        Questions2 q36 = new Questions2("من هي أول دولة اوروبية فازت بكأس العالم لكرة القدم", "إيطاليا", "إ", "ي", "ط", "س", "ي", "ا", "ا", "ل");
        addQuestion2(q36);
        Questions2 q37 = new Questions2("من هو الحيوان الذي يتنفس بلسانه", "الثعبان", "ح", "ث", "ل", "ا", "ع", "ا", "ب", "ن");
        addQuestion2(q37);
        Questions2 q38 = new Questions2("من هو أول صوت يمكن للطفل أن يميزه", "الأم", "ب", "م", "ح", "ا", "ل", "خ", "ع", "أ");
        addQuestion2(q38);
        Questions2 q39 = new Questions2("ما  هو الحيوان الذي لا يصدر منه الصوت", "الزرافة", "ز", "ف", "ة", "ا", "ل", "ا", "ن", "ر");
        addQuestion2(q39);
        Questions2 q40 = new Questions2("ما هي الدولة التي لديها أكبر عدد من الجزر في العالم", "السويد", "ص", "و", "ي", "س", "ن", "ل", "ا", "د");
        addQuestion2(q40);
        Questions2 q41 = new Questions2("ما هي وحدة قياس قياس المقاومة", "الأوم", "ا", "ا", "م", "أ", "و", "ل", "ف", "ت");
        addQuestion2(q41);
        Questions2 q42 = new Questions2("ما هي وحدة قياس التيار", "أمبير", "أ", "ي", "ت", "م", "ب", "ر", "و", "ف");
        addQuestion2(q42);
        Questions2 q43 = new Questions2("من هو الحيوان الذي يطلق عليه إسم اطلس", "الذئب", "ذ", "ئ", "ل", "ث", "ب", "ع", "ا", "ب");
        addQuestion2(q43);
        Questions2 q44 = new Questions2("من هو الحيوان الذي لا يستطيع إخراج لسانه من فمه", "التمساح", "ت", "ل", "م", "ا", "س", "ل", "ح", "ا");
        addQuestion2(q44);
        Questions2 q45 = new Questions2("ما هو الحيوان الذي لا ينام", "الضفدع", "ا", "خ", "ض", "ل", "ق", "ف", "ع", "د");
        addQuestion2(q45);
        Questions2 q46 = new Questions2("ما هو الحيوان الذي لا يحترق في النار", "السلمندر", "ا", "ن", "م", "ل", "ل", "س", "د", "ر");
        addQuestion2(q46);
        Questions2 q47 = new Questions2("من هو صاحب أبطأ حيوان في العالم", "الكسلان", "ا", "ق", "ك", "ل", "ل", "ن", "س", "ا");
        addQuestion2(q47);
        Questions2 q48 = new Questions2("ما هو اسم بيت الدجاج", "القن", "ق", "خ", "ت", "ي", "ن", "ب", "ل", "ا");
        addQuestion2(q48);
        Questions2 q49 = new Questions2("من أسرع الأسماك في العالم", "التونة", "ت", "ر", "و", "ق", "ن", "ة", "ا", "ل");
        addQuestion2(q49);
        Questions2 q50 = new Questions2("ما هو اسم إنثى الأرنب", "عكرشة", "ع", "ن", "ل", "ر", "ك", "ة", "ر", "ش");
        addQuestion2(q50);
        Questions2 q51 = new Questions2("ما اسم الحيوان صاحب أقوى ذاكرة", "الجمل", "ق", "ا", "ج", "ط", "ل", "ل", "م", "ك");
        addQuestion2(q51);


    }

    private void fillQuestions3Table() {

        Question3 q1 = new Question3("كم عدد الجيوب الأنفية لدى الإنسان", "8", "7", "5", "4", 1);
        addQuestion3(q1);
        Question3 q2 = new Question3("ما هو مقياس سرعة السفن", "الميل", "الكيلو", "العقدة", "الإنش", 3);
        addQuestion3(q2);
        Question3 q3 = new Question3("ما هي وظيفة فيتامين A", "بناء العظام", "علاج الجروح", "انتاج اللعاب", "تقوية النظر", 4);
        addQuestion3(q3);
        Question3 q4 = new Question3("كم هي عدد الدول التي يمر منها نهر النيل", "5", "8", "7", "10", 4);
        addQuestion3(q4);
        Question3 q5 = new Question3("كم عام استمر حكم الخلافة العثمانية", "373 عاما", "346 عاما", "400 عاما", "423 عاما", 3);
        addQuestion3(q5);
        Question3 q6 = new Question3("ما هي السورة التي أسلم بسببها عمر بن الخطاب", "سورة طه", "سورة الدخان", "سورة الأنفال", "سورة العصر", 1);
        addQuestion3(q6);
        Question3 q7 = new Question3("كم عدد أجنحة النحلة", "4", "8", "7", "5", 1);
        addQuestion3(q7);
        Question3 q8 = new Question3("من هي أول دولة عربية خليجية ظهر فيها البترول", "السعودية", "قطر", "الإمارات", "البحرين", 4);
        addQuestion3(q8);
        Question3 q9 = new Question3("ما اسم الدولة التي ينبع منها نهر النيل", "السودان", "أثيوبيا", "أوغندا", "المجر", 3);
        addQuestion3(q9);
        Question3 q10 = new Question3("كم عدد أسماء الأسد في اللغة العربية", "235", "837", "1500", "938", 3);
        addQuestion3(q10);
        Question3 q11 = new Question3("في أي عام صنعت البطاقتان الصفراء والحمراء في العالم", "1934", "1964", "1976", "1997", 4);
        addQuestion3(q11);
        Question3 q12 = new Question3("من هي أول دولة عربية شاركت في الألومبيات", "مصر", "العراق", "المغرب", "الجزائر", 1);
        addQuestion3(q12);
        Question3 q13 = new Question3("من هي أول دولة عرفت لعبة الشطرنج", "الصين", "الهند", "روسيا", "اليابان", 2);
        addQuestion3(q13);
        Question3 q14 = new Question3("ما هي اسم أشهر رياضة في اسبانيا", "كرة القدم", "كرة السلة", "البلياردو", "مصارعة الثيران", 4);
        addQuestion3(q14);
        Question3 q15 = new Question3("في أي عام كانت غزوة خيبر", "4 هجري", "7 هجري", "5 هجري", "8 هجري", 2);
        addQuestion3(q15);
        Question3 q16 = new Question3("ما هي السورة التي تسمى بالطامة", "القارعة", "الواقعة", "النازعات", "الأنفال", 3);
        addQuestion3(q16);
        Question3 q17 = new Question3("ما هو أكثر أنواع الدم إنتشارا", "فصيلة دم A", "فصيلة دم B", "فصيلة دمAB", "فصيلة دم O", 4);
        addQuestion3(q17);


        Question3 q18 = new Question3("ما هي وظيفة المخيخ", "زيادة التركيز", "ضبط التوازن", "مركز للأعصاب", "مركز التفكير", 2);
        addQuestion3(q18);
        Question3 q19 = new Question3("في أي عام غرقت سفينة التايتنك", "1932", "1921", "1912", "1906", 3);
        addQuestion3(q19);
        Question3 q20 = new Question3("كم يصل إرتفاع برج خليفة", "843 متر", "828 متر", "850 متر", "889 متر", 2);
        addQuestion3(q20);
        Question3 q21 = new Question3("ما هو أكبر محيط في العالم", "المحيط الهادي", "المحيط الهندي", "المحيط الأطلسي", "المحيط الجنوبي", 1);
        addQuestion3(q21);
        Question3 q22 = new Question3("من هي الدولة الأكبر في قارة أفريقا ؟", "الجزائر", "السودان", "مصر", "نيجيريا", 1);
        addQuestion3(q22);
        Question3 q23 = new Question3("من هو مخترع الديناميت", "أينشتاين", "أديسون", "آلفيرد نوبل", "نيكولا تيسلا", 3);
        addQuestion3(q23);
        Question3 q24 = new Question3("كم عدد دول حوض نهر النيل", "7 دول", "8 دول", "9 دول", "10 دول", 4);
        addQuestion3(q24);
        Question3 q25 = new Question3("كم عدد الأضلاع في 9 مربعات", "28 ضلع", "24 ضلع", "36 ضلع", "32 ضلع", 3);
        addQuestion3(q25);
        Question3 q26 = new Question3("أين يقع المقر الرئيسي لشركة تطبيق ( التليجرام )", "روسيا", "أمريكا", "الصين", "ألمانيا", 4);
        addQuestion3(q26);
        Question3 q27 = new Question3("ما هي العملة الرسمية لجمهورية النمسا", "اليورو", "الدولار", "الفرنك", "المارك", 1);
        addQuestion3(q27);
        Question3 q28 = new Question3("كم عدد الدول التي شارك في اول كأس عالم لكرة القدم", "10 دول", "9 دول", "11 دول", "13 دول", 4);
        addQuestion3(q28);
        Question3 q29 = new Question3("ما هي أكثر دول العالم إنتاجا للخشب", "الصين", "البرازيل", "كندا", "روسيا", 3);
        addQuestion3(q29);
        Question3 q30 = new Question3("من هو مؤلف رواية بداية ونهاية", "نجيب محفوظ", "أحمد شوقي", "محمود درويش", "طه حسين", 1);
        addQuestion3(q30);
        Question3 q31 = new Question3("كم عدد الأسنان التي يمتلكها القط", "42 سن", "40 سن", "36 سن", "32 سن", 2);
        addQuestion3(q31);
        Question3 q32 = new Question3("كم عدد العضلات في جسم الإنسان", "620 عضلة", "650 عضلة", "640 عضلة", "610 عضلة", 1);
        addQuestion3(q32);
        Question3 q33 = new Question3("كم مرة تقوم النحلة بالرفرفة بجناحيها بالثانية", "350 مرة", "32 مرة", "250 مرة", "310 مرة", 1);
        addQuestion3(q33);
        Question3 q34 = new Question3("كم عدد الناجين من سفينة التايتنيك", "700", "650", "706", "623", 3);
        addQuestion3(q34);


        Question3 q35 = new Question3("من هو صاحب لقب عميد الأدب العربي", "نجيب محفوظ", "طه حسين", "أحمد شوقي", "محمود درويش", 2);
        addQuestion3(q35);
        Question3 q36 = new Question3("كم قمر يدور حول كوكب المشتري", "10 أقمار", "16 قمر", "6 أقمار", "7 أقمار", 2);
        addQuestion3(q36);
        Question3 q37 = new Question3("كم تحتاج أشعة الشمس للوصول إلى الأرض", "7 دقائق", "5 دقائق", "8 دقائق ونصف", "9 دقائق", 3);
        addQuestion3(q37);
        Question3 q38 = new Question3("من هو صاحب النظرية النسبية", "نيوتن", "أينشتاين", "نوبل", "أديسون", 2);
        addQuestion3(q38);
        Question3 q39 = new Question3("من هي ثاني أكبر دولة في العالم من حيث المساحة", "روسيا", "الصين", "أمريكا", "كندا", 4);
        addQuestion3(q39);
        Question3 q40 = new Question3("كم يبلغ طول فقرة الزرافة", "15 سم", "25 سم", "19.5 سم", "22.5 سم", 4);
        addQuestion3(q40);
        Question3 q41 = new Question3("كم عدد السعرات الحرارية في كوب الماء", "0 سعرة حرارية", "7 سعرة حرارية", "5 سعرة حرارية", "8 سعرة حرارية", 1);
        addQuestion3(q41);
        Question3 q42 = new Question3("من هو الحيوان الذي يأكل أبنائه إذا جاع", "القطة", "النمر", "سمكة القرش", "الذئب", 2);
        addQuestion3(q42);
        Question3 q43 = new Question3("كم عدد السعرات الحرارية في كوب الماء", "0 سعرة حرارية", "10 سعرة حرارية", "5 سعرة حرارية", "20 سعرة حرارية", 1);
        addQuestion3(q43);
        Question3 q44 = new Question3("ما هي أقوى عضلة في جسم الإنسان", "عضلة الفك", "عضلة المعدة", "عضلة الرقبة", "عضلة الصدر", 1);
        addQuestion3(q44);
        Question3 q45 = new Question3("أين تقع الفدة الدرقية في جسم الإنسان", "الرقبة", "المخ", "المعدة", "القلب", 1);
        addQuestion3(q45);
        Question3 q46 = new Question3("ما هو البحر الذي يعد الأكثر دفئا", "بحر العرب", "البحر الأحمر", "البحر الميت", "بحر قزوين", 2);
        addQuestion3(q46);
        Question3 q47 = new Question3("ما هو الحيوان الذي يستخرج منه المسك", "الجمل", "الغزال", "النحل", "الأرنب", 2);
        addQuestion3(q47);
        Question3 q48 = new Question3("كم عدد أنواع كرات الدم البيضاء", "نوعين", "3 أنواع", "4 أنواع", "5 أنواع", 2);
        addQuestion3(q48);
        Question3 q49 = new Question3("كم عضلة يستخدم الإنسان عندما يغضب", "12 عضلة", "14 عضلة", "13 عضلة", "11 عضلة", 3);
        addQuestion3(q49);
        Question3 q50 = new Question3("كم مرة تستطيع إناث القطط أن تنجب سنويا", "مرة واحدة", "مرتان", "ثلاث مرات", "4 مرات", 3);
        addQuestion3(q50);
        Question3 q51 = new Question3("ما هو الحيوان الذي يمتلك 3 قلوب", "الزرافة", "الأرنب", "سمكة القرش", "الأخطبوط", 4);
        addQuestion3(q51);
    }

//
//    public String getScore(String username) {
//        SQLiteDatabase db = this.getReadableDatabase();
//
//        Cursor cursor = db.rawQuery("Select * from info where username = ?", new String[]{username});
//        cursor.moveToFirst();
//        return cursor.getString(0);
//    }
//
//    public long update (String username) {
//        int last = Integer.parseInt(getScore(username));
//        SQLiteDatabase db = this.getReadableDatabase();
//        ContentValues contentValues = new ContentValues();
//        contentValues.put("Score", last + 10);
//
//        return db.update("info", contentValues, "username =?", new String[]{username});
//    }


    private void addQuestion2(Questions2 questions2) {
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(FinalContract.DbTable.COLUMN_QUESTION2, questions2.getQuestion2());
        contentValues2.put(FinalContract.DbTable.COLUMN_ALPHA_BET1, questions2.getAlphabet1());
        contentValues2.put(FinalContract.DbTable.COLUMN_ALPHA_BET2, questions2.getAlphabet2());
        contentValues2.put(FinalContract.DbTable.COLUMN_ALPHA_BET3, questions2.getAlphabet3());
        contentValues2.put(FinalContract.DbTable.COLUMN_ALPHA_BET4, questions2.getAlphabet4());
        contentValues2.put(FinalContract.DbTable.COLUMN_ALPHA_BET5, questions2.getAlphabet5());
        contentValues2.put(FinalContract.DbTable.COLUMN_ALPHA_BET6, questions2.getAlphabet6());
        contentValues2.put(FinalContract.DbTable.COLUMN_ALPHA_BET7, questions2.getAlphabet7());
        contentValues2.put(FinalContract.DbTable.COLUMN_ALPHA_BET8, questions2.getAlphabet8());
        contentValues2.put(FinalContract.DbTable.COLUMN_ANSWER_NR2, questions2.getAnswer2());
        db.insert(FinalContract.DbTable.TABLE_NAME2, null, contentValues2);
    }


    @SuppressLint("Range")
    public List<Questions2> getAllQuestions2() {

        List<Questions2> questions2s = new ArrayList<>();
        db = getReadableDatabase();
        Cursor cu = db.rawQuery("SELECT * FROM " + FinalContract.DbTable.TABLE_NAME2
                , null);

        if (cu.moveToFirst()) {
            do {
                Questions2 questions2 = new Questions2();

                questions2.setQuestion2(cu.getString(cu.getColumnIndex(FinalContract.DbTable.COLUMN_QUESTION2)));
                questions2.setAlphabet1(cu.getString(cu.getColumnIndex(FinalContract.DbTable.COLUMN_ALPHA_BET1)));
                questions2.setAlphabet2(cu.getString(cu.getColumnIndex(FinalContract.DbTable.COLUMN_ALPHA_BET2)));
                questions2.setAlphabet3(cu.getString(cu.getColumnIndex(FinalContract.DbTable.COLUMN_ALPHA_BET3)));
                questions2.setAlphabet4(cu.getString(cu.getColumnIndex(FinalContract.DbTable.COLUMN_ALPHA_BET4)));
                questions2.setAlphabet5(cu.getString(cu.getColumnIndex(FinalContract.DbTable.COLUMN_ALPHA_BET5)));
                questions2.setAlphabet6(cu.getString(cu.getColumnIndex(FinalContract.DbTable.COLUMN_ALPHA_BET6)));
                questions2.setAlphabet7(cu.getString(cu.getColumnIndex(FinalContract.DbTable.COLUMN_ALPHA_BET7)));
                questions2.setAlphabet8(cu.getString(cu.getColumnIndex(FinalContract.DbTable.COLUMN_ALPHA_BET8)));
                questions2.setAnswer2(cu.getString(cu.getColumnIndex(FinalContract.DbTable.COLUMN_ANSWER_NR2)));
                questions2s.add(questions2);
            } while (cu.moveToNext());
        }
        cu.close();
        return questions2s;
    }


    private void addQuestion3(Question3 question3) {
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put(FinalContract.DbTable.COLUMN_QUESTION3, question3.getQuestion3());
        contentValues3.put(FinalContract.DbTable.COLUMN_OPTION1, question3.getOption1());
        contentValues3.put(FinalContract.DbTable.COLUMN_OPTION2, question3.getOption2());
        contentValues3.put(FinalContract.DbTable.COLUMN_OPTION3, question3.getOption3());
        contentValues3.put(FinalContract.DbTable.COLUMN_OPTION4, question3.getOption4());
        contentValues3.put(FinalContract.DbTable.COLUMN_ANSWER_NR3, question3.getAnswerNr3());
        db.insert(FinalContract.DbTable.TABLE_NAME3, null, contentValues3);
    }

    @SuppressLint("Range")
    public List<Question3> getAllQuestions3() {

        List<Question3> question3List = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + FinalContract.DbTable.TABLE_NAME3
                , null);
        if (c.moveToFirst()) {
            do {
                Question3 question3 = new Question3();
                question3.setQuestion3(c.getString(c.getColumnIndex(FinalContract.DbTable.COLUMN_QUESTION3)));
                question3.setOption1(c.getString(c.getColumnIndex(FinalContract.DbTable.COLUMN_OPTION1)));
                question3.setOption2(c.getString(c.getColumnIndex(FinalContract.DbTable.COLUMN_OPTION2)));
                question3.setOption3(c.getString(c.getColumnIndex(FinalContract.DbTable.COLUMN_OPTION3)));
                question3.setOption4(c.getString(c.getColumnIndex(FinalContract.DbTable.COLUMN_OPTION4)));
                question3.setAnswerNr3(c.getInt(c.getColumnIndex(FinalContract.DbTable.COLUMN_ANSWER_NR3)));
                question3List.add(question3);
            } while (c.moveToNext());
        }
        c.close();
        return question3List;
    }
}
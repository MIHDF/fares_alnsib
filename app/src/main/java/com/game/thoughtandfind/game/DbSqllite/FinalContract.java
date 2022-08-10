package com.game.thoughtandfind.game.DbSqllite;

import android.provider.BaseColumns;

public class FinalContract {

    public FinalContract() {
    }

    public static class DbTable implements BaseColumns {
        
        public static final String TABLE_NAME3 = "quiz_questions";
        public static final String COLUMN_QUESTION3 = "question3";
        public static final String COLUMN_OPTION1 = "option1";
        public static final String COLUMN_OPTION2 = "option2";
        public static final String COLUMN_OPTION3 = "option3";
        public static final String COLUMN_OPTION4 = "option4";
        public static final String COLUMN_ANSWER_NR3 = "answer_nr3";

        public static final String TABLE_NAME2 = "quiz_questions2";
        public static final String ID2 = "id2";

        public static final String COLUMN_QUESTION2 = "question2";
        public static final String COLUMN_ANSWER_NR2 = "answer_nr2";


        public static final String COLUMN_ALPHA_BET1 = "Alphabet1";
        public static final String COLUMN_ALPHA_BET2 = "Alphabet2";
        public static final String COLUMN_ALPHA_BET3 = "Alphabet3";
        public static final String COLUMN_ALPHA_BET4 = "Alphabet4";
        public static final String COLUMN_ALPHA_BET5 = "Alphabet5";
        public static final String COLUMN_ALPHA_BET6 = "Alphabet6";
        public static final String COLUMN_ALPHA_BET7 = "Alphabet7";
        public static final String COLUMN_ALPHA_BET8 = "Alphabet8";
    }
}

package dsu.software.fragment_test;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class myDBHelper extends SQLiteOpenHelper {
    myDBHelper(Context context) {
        super(context, "employee.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table PRH1 (id int primary key," +
                "subj text,prof text,lect text," +
                "subject_id int, lecture_id int," +
                "essential int," +
                "grade_point int," +
                "mon1 int,mon2 int,mon3 int,mon4 int,mon5 int,mon6 int,mon7 int,mon8 int,mon9 int,mon10 int,mon11 int,mon12 int,mon13 int,tue1 int,tue2 int,tue3 int,tue4 int,tue5 int,tue6 int,tue7 int,tue8 int,tue9 int,tue10 int,tue11 int,tue12 int,tue13 int,wed1 int,wed2 int,wed3 int,wed4 int,wed5 int,wed6 int,wed7 int,wed8 int,wed9 int,wed10 int,wed11 int,wed12 int,wed13 int,thu1 int,thu2 int,thu3 int,thu4 int,thu5 int,thu6 int,thu7 int,thu8 int,thu9 int,thu10 int,thu11 int,thu12 int,thu13 int,fri1 int,fri2 int,fri3 int,fri4 int,fri5 int,fri6 int,fri7 int,fri8 int,fri9 int,fri10 int,fri11 int,fri12 int,fri13 int," +
                "modify_id int);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS PRH1");
        onCreate(db);
    }
}

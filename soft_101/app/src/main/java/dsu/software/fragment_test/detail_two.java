package dsu.software.fragment_test;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.Random;

public class detail_two extends Fragment {

    myDBHelper myHelper;
    SQLiteDatabase sqlDB;

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.detail_layout_two, container, false);


        final Station_string string = new Station_string();


        // 현재 선택된 지하철 역 이름
        final TextView station = view.findViewById(R.id.station);
        station.setText(Station_Tab.name);

        // 행 정보 출력 함수 호출
//        show_pre_next(string, pre, next,view);


        TextView station_start = view.findViewById(R.id.station_start);
        TextView station_end = view.findViewById(R.id.station_end);
        TextView time_start = view.findViewById(R.id.time_start);
        TextView time_end = view.findViewById(R.id.time_end);

        station_start.setText(Detail_Tab.selected_tab[1][0]);
        station_end.setText(Detail_Tab.selected_tab[1][1]);
        {
            if (Detail_Tab.whichstation == 0) {
                station_start.setTextColor(Color.parseColor(getString(R.string.first_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.first_color)));
            } else if (Detail_Tab.whichstation == 1) {
                station_start.setTextColor(Color.parseColor(getString(R.string.second_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.second_color)));
            } else if (Detail_Tab.whichstation == 2) {
                station_start.setTextColor(Color.parseColor(getString(R.string.third_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.third_color)));
            } else if (Detail_Tab.whichstation == 3) {
                station_start.setTextColor(Color.parseColor(getString(R.string.fourth_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.fourth_color)));
            } else if (Detail_Tab.whichstation == 4) {
                station_start.setTextColor(Color.parseColor(getString(R.string.dong_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.dong_color)));
            } else if (Detail_Tab.whichstation == 5) {
                station_start.setTextColor(Color.parseColor(getString(R.string.kim_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.kim_color)));
            }
        }
        {
            if ((Detail_Tab.whichstation == 2 && Detail_Tab.num == 16) ||
                    (Detail_Tab.whichstation == 5 && Detail_Tab.num == 6)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.kim_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.kim_color)));
            } else if ((Detail_Tab.whichstation == 1 && Detail_Tab.num == 32) ||
                    (Detail_Tab.whichstation == 2 && Detail_Tab.num == 12)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.third_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.third_color)));
            } else if ((Detail_Tab.whichstation == 2 && Detail_Tab.num == 8) ||
                    (Detail_Tab.whichstation == 3 && Detail_Tab.num == 0)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.fourth_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.fourth_color)));
            } else if ((Detail_Tab.whichstation == 0 && Detail_Tab.num == 30) ||
                    (Detail_Tab.whichstation == 3 && Detail_Tab.num == 1)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.fourth_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.fourth_color)));
            } else if ((Detail_Tab.whichstation == 0 && Detail_Tab.num == 29) ||
                    (Detail_Tab.whichstation == 4 && Detail_Tab.num == 3)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.dong_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.dong_color)));
            } else if ((Detail_Tab.whichstation == 2 && Detail_Tab.num == 5) ||
                    (Detail_Tab.whichstation == 4 && Detail_Tab.num == 2)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.dong_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.dong_color)));
            } else if ((Detail_Tab.whichstation == 0 && Detail_Tab.num == 28) ||
                    (Detail_Tab.whichstation == 2 && Detail_Tab.num == 4)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.third_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.third_color)));
            } else if ((Detail_Tab.whichstation == 1 && Detail_Tab.num == 7) ||
                    (Detail_Tab.whichstation == 2 && Detail_Tab.num == 0)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.third_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.third_color)));
            } else if ((Detail_Tab.whichstation == 1 && Detail_Tab.num == 4) ||
                    (Detail_Tab.whichstation == 4 && Detail_Tab.num == 9)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.dong_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.dong_color)));
            } else if ((Detail_Tab.whichstation == 0 && Detail_Tab.num == 24) ||
                    (Detail_Tab.whichstation == 1 && Detail_Tab.num == 18)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.second_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.second_color)));
            } else if ((Detail_Tab.whichstation == 1 && Detail_Tab.num == 26) ||
                    (Detail_Tab.whichstation == 5 && Detail_Tab.num == 0)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.kim_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.kim_color)));
            }
        }
        {
            // 미남
            if ((Detail_Tab.whichstation == 2 && Detail_Tab.num == 8) ||
                    (Detail_Tab.whichstation == 3 && Detail_Tab.num == 0)) {
                station_start.setVisibility(View.GONE);
                time_start.setVisibility(View.GONE);
            }
            // 수영
            if ((Detail_Tab.whichstation == 1 && Detail_Tab.num == 7) ||
                    (Detail_Tab.whichstation == 2 && Detail_Tab.num == 0)) {
                station_start.setVisibility(View.GONE);
                time_start.setVisibility(View.GONE);
            }
            // 사상
            if ((Detail_Tab.whichstation == 1 && Detail_Tab.num == 26) ||
                    (Detail_Tab.whichstation == 5 && Detail_Tab.num == 0)) {
                station_start.setVisibility(View.GONE);
                time_start.setVisibility(View.GONE);
            }
        }
        Button firsttrain = view.findViewById(R.id.firsttrain);
        Button secondtrain = view.findViewById(R.id.secondtrain);
        Button thirdtrain = view.findViewById(R.id.thirdtrain);

        myHelper = new myDBHelper(getContext());
        sqlDB = myHelper.getReadableDatabase();
        @SuppressLint("Recycle") final Cursor cursor = sqlDB.rawQuery("select * from PRH1;", null);

        cursor.moveToFirst();

//        String a;
//        int b;
//        int c;
//        String starttime;
//        String endtime;
//        int recordCount = cursor.getCount();


        if (Detail_Tab.time2_1 == 0){
            time_start.setText("곧도착");
        }
        else{
            time_start.setText(Detail_Tab.time2_1+"분 후");
        }
        if (Detail_Tab.time2_2 == 0){
            time_end.setText("곧도착");
        }
        else{
            time_end.setText(Detail_Tab.time2_2+"분 후");
        }
        if (Detail_Tab.train2_1 == 0) {
            firsttrain.setText("1호차 - 원활");
            firsttrain.setBackgroundResource(R.drawable.start_train);
        }
        if (Detail_Tab.train2_1 == 1) {
            firsttrain.setText("1호차 - 보통");
            firsttrain.setBackgroundResource(R.drawable.start_train_yellow);
        }
        if (Detail_Tab.train2_1 == 2) {
            firsttrain.setText("1호차 - 혼잡");
            firsttrain.setBackgroundResource(R.drawable.start_train_red);
        }
        if (Detail_Tab.train2_2 == 0) {
            secondtrain.setText("2호차 - 원활");
            secondtrain.setBackgroundResource(R.drawable.middle_end_train);
        }
        if (Detail_Tab.train2_2 == 1) {
            secondtrain.setText("2호차 - 보통");
            secondtrain.setBackgroundResource(R.drawable.middle_end_train_yellow);
        }
        if (Detail_Tab.train2_2 == 2) {
            secondtrain.setText("2호차 - 혼잡");
            secondtrain.setBackgroundResource(R.drawable.middle_end_train_red);
        }
        if (Detail_Tab.train2_3 == 0) {
            thirdtrain.setText("3호차 - 원활");
            thirdtrain.setBackgroundResource(R.drawable.middle_end_train);
        }
        if (Detail_Tab.train2_3 == 1) {
            thirdtrain.setText("3호차 - 보통");
            thirdtrain.setBackgroundResource(R.drawable.middle_end_train_yellow);
        }
        if (Detail_Tab.train2_3 == 2) {
            thirdtrain.setText("3호차 - 혼잡");
            thirdtrain.setBackgroundResource(R.drawable.middle_end_train_red);
        }


//        for (int i = 0; i < recordCount; i++) {
//
//            b = cursor.getInt(0);
//            c = cursor.getInt(1);
//
//            if (Detail_Tab.whichstation == b && Detail_Tab.num == c) {
//                starttime = cursor.getString(3);
//                endtime = cursor.getString(4);
//                time_start.setText(starttime);
//                time_end.setText(endtime);
//
//
//                if (Detail_Tab.train_1 == 0) {
//                    firsttrain.setText("1호차 - 원활");
//                    firsttrain.setBackgroundResource(R.drawable.start_train);
//                }
//                if (Detail_Tab.train_1 == 1) {
//                    firsttrain.setText("1호차 - 보통");
//                    firsttrain.setBackgroundResource(R.drawable.start_train_yellow);
//                }
//                if (Detail_Tab.train_1 == 2) {
//                    firsttrain.setText("1호차 - 혼잡");
//                    firsttrain.setBackgroundResource(R.drawable.start_train_red);
//                }
//                if (cursor.getString(6).equals("원활")) {
//                    secondtrain.setText("2호차 - 원활");
//                    secondtrain.setBackgroundResource(R.drawable.middle_end_train);
//                }
//                if (cursor.getString(6).equals("보통")) {
//                    secondtrain.setText("2호차 - 보통");
//                    secondtrain.setBackgroundResource(R.drawable.middle_end_train_yellow);
//                }
//                if (cursor.getString(6).equals("혼잡")) {
//                    secondtrain.setText("2호차 - 혼잡");
//                    secondtrain.setBackgroundResource(R.drawable.middle_end_train_red);
//                }
//                if (cursor.getString(7).equals("원활")) {
//                    thirdtrain.setText("3호차 - 원활");
//                    thirdtrain.setBackgroundResource(R.drawable.middle_end_train);
//                }
//                if (cursor.getString(7).equals("보통")) {
//                    thirdtrain.setText("3호차 - 보통");
//                    thirdtrain.setBackgroundResource(R.drawable.middle_end_train_yellow);
//                }
//                if (cursor.getString(7).equals("혼잡")) {
//                    thirdtrain.setText("3호차 - 혼잡");
//                    thirdtrain.setBackgroundResource(R.drawable.middle_end_train_red);
//                }
//
//            }
//
//            cursor.moveToNext();
//        }
        return view;
    }

}

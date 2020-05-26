package dsu.software.fragment_test;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class detail_one extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.detail_layout_one, container, false);

        final Station_string string = new Station_string();

        // "지하철"
        // 홈으로
//        TextView home = view.findViewById(R.id.home);
//        home.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Intent home = new Intent(getActivity(), MainActivity.class);
////                startActivity(home);
////                finish();
//            }
//        });

        // 현재 선택된 지하철 역 이름
        final TextView station = view.findViewById(R.id.station);
        station.setText(Station_Tab.name);

        // 행 정보 출력 함수 호출
//        show_pre_next(string, pre, next,view);


        TextView station_start = view.findViewById(R.id.station_start);
        TextView station_end = view.findViewById(R.id.station_end);

        station_start.setText(Detail_Tab.selected_tab[0][0]);
        station_end.setText(Detail_Tab.selected_tab[0][1]);
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
                station_start.setTextColor(Color.parseColor(getString(R.string.third_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.third_color)));
            } else if ((Detail_Tab.whichstation == 1 && Detail_Tab.num == 32) ||
                    (Detail_Tab.whichstation == 2 && Detail_Tab.num == 12)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.second_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.second_color)));
            } else if ((Detail_Tab.whichstation == 2 && Detail_Tab.num == 8) ||
                    (Detail_Tab.whichstation == 3 && Detail_Tab.num == 0)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.third_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.third_color)));
            } else if ((Detail_Tab.whichstation == 0 && Detail_Tab.num == 30) ||
                    (Detail_Tab.whichstation == 3 && Detail_Tab.num == 1)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.first_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.first_color)));
            } else if ((Detail_Tab.whichstation == 0 && Detail_Tab.num == 29) ||
                    (Detail_Tab.whichstation == 4 && Detail_Tab.num == 3)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.first_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.first_color)));
            } else if ((Detail_Tab.whichstation == 2 && Detail_Tab.num == 5) ||
                    (Detail_Tab.whichstation == 4 && Detail_Tab.num == 2)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.third_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.third_color)));
            } else if ((Detail_Tab.whichstation == 0 && Detail_Tab.num == 28) ||
                    (Detail_Tab.whichstation == 2 && Detail_Tab.num == 4)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.first_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.first_color)));
            } else if ((Detail_Tab.whichstation == 1 && Detail_Tab.num == 7) ||
                    (Detail_Tab.whichstation == 2 && Detail_Tab.num == 0)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.second_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.second_color)));
            } else if ((Detail_Tab.whichstation == 1 && Detail_Tab.num == 4) ||
                    (Detail_Tab.whichstation == 4 && Detail_Tab.num == 9)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.second_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.second_color)));
            } else if ((Detail_Tab.whichstation == 0 && Detail_Tab.num == 24) ||
                    (Detail_Tab.whichstation == 1 && Detail_Tab.num == 18)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.first_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.first_color)));
            } else if ((Detail_Tab.whichstation == 1 && Detail_Tab.num == 26) ||
                    (Detail_Tab.whichstation == 5 && Detail_Tab.num == 0)) {
                station_start.setTextColor(Color.parseColor(getString(R.string.second_color)));
                station_end.setTextColor(Color.parseColor(getString(R.string.second_color)));
            }
        }
        {
            if ((Detail_Tab.whichstation == 2 && Detail_Tab.num == 16) ||
                    (Detail_Tab.whichstation == 5 && Detail_Tab.num == 6)) {
                station_end.setVisibility(View.GONE);
            }
        }
        return view;
    }

}

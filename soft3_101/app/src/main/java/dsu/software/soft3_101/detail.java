package dsu.software.soft3_101;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.inspector.StaticInspectionCompanionProvider;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("Registered")
public class detail extends AppCompatActivity {

    static int whichstation;
    static int num;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);
        final Stations string = new Stations();

        // "지하철"
        // 홈으로
        TextView home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(home);
//                finish();
            }
        });

        // 현재 선택된 지하철 역 이름
        final TextView station = findViewById(R.id.station);
        station.setText(MainActivity.name);

        final TextView pre = findViewById(R.id.pre);
        final TextView next = findViewById(R.id.next);
        // 이전 역 버튼
        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num != 0) {
                    num -= 1;
                    station.setText(string.FS[whichstation][num]);
                }
                show_pre_next(string, pre, next);
            }
        });
        // 다음 역 버튼
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num != string.FS[whichstation].length - 1) {
                    num += 1;
                    station.setText(string.FS[whichstation][num]);
                }
                show_pre_next(string, pre, next);
            }
        });

        // 행 정보 출력 함수 호출
        show_pre_next(string, pre, next);
    }

    @SuppressLint("ResourceAsColor")
    public void show_pre_next(Stations string, TextView pre, TextView next) {
        // 현재 역에 도착할 열차 도착 정보
        // 방향(행) 마다 표시
        TableRow basic = findViewById(R.id.basic);
        TableRow another = findViewById(R.id.another);
        TextView lt_basic = findViewById(R.id.lt_basic);
        TextView lt_another = findViewById(R.id.lt_another);
        TextView lt_blank = findViewById(R.id.lt_blank);
        TextView gt_basic = findViewById(R.id.gt_basic);
        TextView gt_another = findViewById(R.id.gt_another);
        TextView gt_blank = findViewById(R.id.gt_blank);
        // 기본적으로 보이지 않다가
        lt_basic.setVisibility(View.GONE);
        gt_basic.setVisibility(View.GONE);
        lt_another.setVisibility(View.GONE);
        gt_another.setVisibility(View.GONE);
        // 해당 역에서 필요한 행만 표시
        // 1호선
        if (whichstation == 0) {
            lt_basic.setVisibility(View.VISIBLE);
            lt_basic.setText("다대포행");
            lt_basic.setTextColor(Color.parseColor(getString(R.string.first_color)));
            gt_basic.setVisibility(View.VISIBLE);
            gt_basic.setText("노포행");
            gt_basic.setTextColor(Color.parseColor(getString(R.string.first_color)));
            lt_blank.setVisibility(View.VISIBLE);
            gt_blank.setVisibility(View.VISIBLE);
            pre.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
            if (num == 0) {
                lt_basic.setVisibility(View.INVISIBLE);
                pre.setVisibility(View.INVISIBLE);
            } else if (num == 24) {
                lt_another.setVisibility(View.VISIBLE);
                lt_another.setText("장산행");
                lt_another.setTextColor(Color.parseColor(getString(R.string.second_color)));
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("양산행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.second_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
            } else if (num == 28) {
                lt_another.setVisibility(View.VISIBLE);
                lt_another.setText("수영행");
                lt_another.setTextColor(Color.parseColor(getString(R.string.third_color)));
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("대저행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.third_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
            } else if (num == 29) {
                lt_another.setVisibility(View.VISIBLE);
                lt_another.setText("부전행");
                lt_another.setTextColor(Color.parseColor(getString(R.string.dong_color)));
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("일광행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.dong_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
            } else if (num == 30) {
                lt_another.setVisibility(View.VISIBLE);
                lt_another.setText("미남행");
                lt_another.setTextColor(Color.parseColor(getString(R.string.fourth_color)));
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("안평행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.fourth_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
            } else if (num == string.FS[whichstation].length - 1) {
                gt_basic.setVisibility(View.INVISIBLE);
                next.setVisibility(View.INVISIBLE);
            }
        }
        // 2호선
        else if (whichstation == 1) {
            lt_basic.setVisibility(View.VISIBLE);
            lt_basic.setText("장산행");
            lt_basic.setTextColor(Color.parseColor(getString(R.string.second_color)));
            gt_basic.setVisibility(View.VISIBLE);
            gt_basic.setText("양산행");
            gt_basic.setTextColor(Color.parseColor(getString(R.string.second_color)));
            lt_blank.setVisibility(View.VISIBLE);
            gt_blank.setVisibility(View.VISIBLE);
            pre.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
            if (num == 0) {
                lt_basic.setVisibility(View.INVISIBLE);
                pre.setVisibility(View.INVISIBLE);
            } else if (num == 4) {
                lt_another.setVisibility(View.VISIBLE);
                lt_another.setText("부전행");
                lt_another.setTextColor(Color.parseColor(getString(R.string.dong_color)));
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("일광행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.dong_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
            } else if (num == 7) {
                lt_another.setVisibility(View.VISIBLE);
                lt_another.setText("수영행");
                lt_another.setTextColor(Color.parseColor(getString(R.string.third_color)));
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("대저행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.third_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
            } else if (num == 18) {
                lt_another.setVisibility(View.VISIBLE);
                lt_another.setText("다대포행");
                lt_another.setTextColor(Color.parseColor(getString(R.string.first_color)));
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("노포행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.first_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
            } else if (num == 26) {
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("가야대행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.kim_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
            } else if (num == 32) {
                lt_another.setVisibility(View.VISIBLE);
                lt_another.setText("수영행");
                lt_another.setTextColor(Color.parseColor(getString(R.string.third_color)));
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("대저행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.third_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
            } else if (num == string.FS[whichstation].length - 1) {
                gt_basic.setVisibility(View.INVISIBLE);
                next.setVisibility(View.INVISIBLE);
            }
        }
        // 3호선
        else if (whichstation == 2) {
            lt_basic.setVisibility(View.VISIBLE);
            lt_basic.setText("수영행");
            lt_basic.setTextColor(Color.parseColor(getString(R.string.third_color)));
            gt_basic.setVisibility(View.VISIBLE);
            gt_basic.setText("대저행");
            gt_basic.setTextColor(Color.parseColor(getString(R.string.third_color)));
            lt_blank.setVisibility(View.VISIBLE);
            gt_blank.setVisibility(View.VISIBLE);
            pre.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
            if (num == 0) {
                lt_basic.setVisibility(View.INVISIBLE);
                lt_another.setVisibility(View.VISIBLE);
                lt_another.setText("가야대행");
                lt_another.setTextColor(Color.parseColor(getString(R.string.kim_color)));
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("사상행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.kim_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
                pre.setVisibility(View.INVISIBLE);
            } else if (num == 4) {
                lt_another.setVisibility(View.VISIBLE);
                lt_another.setText("장산행");
                lt_another.setTextColor(Color.parseColor(getString(R.string.second_color)));
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("양산행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.second_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
            } else if (num == 5) {
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("안평행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.fourth_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
            } else if (num == 8) {
                lt_another.setVisibility(View.VISIBLE);
                lt_another.setText("부전행");
                lt_another.setTextColor(Color.parseColor(getString(R.string.dong_color)));
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("일광행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.dong_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
            } else if (num == 12) {
                lt_another.setVisibility(View.VISIBLE);
                lt_another.setText("다대포행");
                lt_another.setTextColor(Color.parseColor(getString(R.string.first_color)));
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("노포행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.first_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
            } else if (num == string.FS[whichstation].length - 1) {
                lt_another.setVisibility(View.VISIBLE);
                lt_another.setText("장산행");
                lt_another.setTextColor(Color.parseColor(getString(R.string.second_color)));
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("양산행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.second_color)));
                gt_basic.setVisibility(View.INVISIBLE);
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
                next.setVisibility(View.INVISIBLE);
            }
        }
        // 4호선
        else if (whichstation == 3) {
            lt_basic.setVisibility(View.VISIBLE);
            lt_basic.setText("미남행");
            lt_basic.setTextColor(Color.parseColor(getString(R.string.fourth_color)));
            gt_basic.setVisibility(View.VISIBLE);
            gt_basic.setText("안평행");
            gt_basic.setTextColor(Color.parseColor(getString(R.string.fourth_color)));
            lt_blank.setVisibility(View.VISIBLE);
            gt_blank.setVisibility(View.VISIBLE);
            pre.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
            if (num == 0) {
                lt_basic.setVisibility(View.INVISIBLE);
                lt_another.setVisibility(View.VISIBLE);
                lt_another.setText("수영행");
                lt_another.setTextColor(Color.parseColor(getString(R.string.third_color)));
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("대저행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.third_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
                pre.setVisibility(View.INVISIBLE);
            } else if (num == 1) {
                lt_another.setVisibility(View.VISIBLE);
                lt_another.setText("다대포행");
                lt_another.setTextColor(Color.parseColor(getString(R.string.first_color)));
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("노포행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.first_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
            } else if (num == string.FS[whichstation].length - 1) {
                gt_basic.setVisibility(View.INVISIBLE);
                next.setVisibility(View.INVISIBLE);
            }
        }
        // 동해선
        else if (whichstation == 4) {
            lt_basic.setVisibility(View.VISIBLE);
            lt_basic.setText("부전행");
            lt_basic.setTextColor(Color.parseColor(getString(R.string.dong_color)));
            gt_basic.setVisibility(View.VISIBLE);
            gt_basic.setText("일광행");
            gt_basic.setTextColor(Color.parseColor(getString(R.string.dong_color)));
            lt_blank.setVisibility(View.VISIBLE);
            gt_blank.setVisibility(View.VISIBLE);
            pre.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
            if (num == 0) {
                lt_basic.setVisibility(View.INVISIBLE);
                pre.setVisibility(View.INVISIBLE);
            } else if (num == 2) {
                lt_another.setVisibility(View.VISIBLE);
                lt_another.setText("수영행");
                lt_another.setTextColor(Color.parseColor(getString(R.string.third_color)));
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("대저행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.third_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
            } else if (num == 3) {
                lt_another.setVisibility(View.VISIBLE);
                lt_another.setText("다대포행");
                lt_another.setTextColor(Color.parseColor(getString(R.string.first_color)));
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("노포행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.first_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
            } else if (num == 9) {
                lt_another.setVisibility(View.VISIBLE);
                lt_another.setText("장산행");
                lt_another.setTextColor(Color.parseColor(getString(R.string.second_color)));
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("양산행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.second_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
            } else if (num == string.FS[whichstation].length - 1) {
                gt_basic.setVisibility(View.INVISIBLE);
                next.setVisibility(View.INVISIBLE);
            }
        }
        // 부산김해
        else if (whichstation == 5) {
            lt_basic.setVisibility(View.VISIBLE);
            lt_basic.setText("가야대행");
            lt_basic.setTextColor(Color.parseColor(getString(R.string.kim_color)));
            gt_basic.setVisibility(View.VISIBLE);
            gt_basic.setText("사상행");
            gt_basic.setTextColor(Color.parseColor(getString(R.string.kim_color)));
            lt_blank.setVisibility(View.VISIBLE);
            gt_blank.setVisibility(View.VISIBLE);
            pre.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
            if (num == 0) {
                lt_basic.setVisibility(View.INVISIBLE);
                lt_another.setVisibility(View.VISIBLE);
                lt_another.setText("장산행");
                lt_another.setTextColor(Color.parseColor(getString(R.string.second_color)));
                gt_another.setVisibility(View.VISIBLE);
                gt_another.setText("양산행");
                gt_another.setTextColor(Color.parseColor(getString(R.string.second_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
            } else if (num == 6) {
                lt_another.setVisibility(View.VISIBLE);
                lt_another.setText("수영행");
                lt_another.setTextColor(Color.parseColor(getString(R.string.third_color)));
                lt_blank.setVisibility(View.GONE);
                gt_blank.setVisibility(View.GONE);
            } else if (num == string.FS[whichstation].length - 1) {
                gt_basic.setVisibility(View.INVISIBLE);
            }
        }

    }
}
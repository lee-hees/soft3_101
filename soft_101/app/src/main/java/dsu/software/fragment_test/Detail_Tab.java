package dsu.software.fragment_test;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.tabs.TabLayout;

import java.util.Objects;
import java.util.Random;

public class Detail_Tab extends AppCompatActivity {

    detail_one one;
    detail_two two;

    myDBHelper myHelper;
    SQLiteDatabase sqlDB;

    static int whichstation;
    static int num;
    Random random = new Random();
    static int rnd = -1;

    static String[][] selected_tab = new String[][]{{"", ""}, {"", ""}};
    static int transfer;

    final Handler timer = new Handler(); //Handler 생성

    static int train1_1;
    static int train1_2;
    static int train1_3;
    static int train2_1;
    static int train2_2;
    static int train2_3;
    static int time1_1;
    static int time1_2;
    static int time2_1;
    static int time2_2;


    @Override
    public void onBackPressed() {
        timer.removeMessages(0);
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_tab);
        final Station_string string = new Station_string();

        myHelper = new myDBHelper(Detail_Tab.this);
        sqlDB = myHelper.getReadableDatabase();

        @SuppressLint("Recycle") final Cursor cursor = sqlDB.rawQuery("select * from PRH1;", null);

        cursor.moveToFirst();

//        final int recordCount = cursor.getCount();
//
        timer.postDelayed(new Runnable() { //3초후 쓰레드를 생성하는 postDelayed 메소드
            public void run() {
                train1_1 = random.nextInt(3);
                train1_2 = random.nextInt(3);
                train1_3 = random.nextInt(3);
                train2_1 = random.nextInt(3);
                train2_2 = random.nextInt(3);
                train2_3 = random.nextInt(3);
                time1_1 = random.nextInt(10);
                time1_2 = random.nextInt(10);
                time2_1 = random.nextInt(10);
                time2_2 = random.nextInt(10);
            }
        }, 3000); //3초

        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timer.removeMessages(0);
                finish();
            }
        });
        Button refresh = findViewById(R.id.refresh);
        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent refresh = new Intent(getApplicationContext(), Detail_Tab.class);
                startActivity(refresh);
                finish();

//                Toast.makeText(Detail_Tab.this, "새로고침 rnd값 : " + rnd, Toast.LENGTH_SHORT).show();

            }
        });

        one = new detail_one();
        two = new detail_two();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, one).commit();

        final TabLayout tabs = findViewById(R.id.tabs);

        tabs.addTab(tabs.newTab().setText("1호선"));
        tabs.addTab(tabs.newTab().setText("2호선"));
        tabs.addTab(tabs.newTab().setText("3호선"));
        tabs.addTab(tabs.newTab().setText("4호선"));
        tabs.addTab(tabs.newTab().setText("동해선"));
        tabs.addTab(tabs.newTab().setText("김해선"));

        // 환승 x
        {
            {
                if (getString(string.FS[whichstation][num]).equals(getString(R.string.first_1)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_2)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_3)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_4)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_5)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_6)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_7)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_8)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_9)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_10)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_11)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_12)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_13)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_14)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_15)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_16)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_17)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_18)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_19)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_20)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_21)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_22)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_23)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_24)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_26)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_27)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_28)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_32)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_33)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_34)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_35)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_36)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_37)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_38)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_39)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.first_40))
                ) {
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(5)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(4)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(3)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(2)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(1)));
                }
            }
            {
                if (getString(string.FS[whichstation][num]).equals(getString(R.string.second_1)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_2)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_3)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_4)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_6)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_7)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_9)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_10)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_11)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_12)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_13)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_14)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_15)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_16)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_17)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_18)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_20)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_21)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_22)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_23)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_24)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_25)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_26)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_28)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_29)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_30)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_31)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_32)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_34)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_35)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_36)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_37)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_38)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_39)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_40)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_41)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.second_42))
                ) {
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(5)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(4)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(3)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(2)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(0)));

                }
            }
            {
                if (
                        getString(string.FS[whichstation][num]).equals(getString(R.string.third_2)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.third_3)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.third_4)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.third_7)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.third_8)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.third_10)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.third_11)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.third_12)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.third_14)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.third_15)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.third_16))
                ) {
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(5)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(4)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(3)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(1)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(0)));
                }
            }
            {
                if (
                        getString(string.FS[whichstation][num]).equals(getString(R.string.fourth_3)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.fourth_4)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.fourth_5)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.fourth_6)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.fourth_7)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.fourth_8)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.fourth_9)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.fourth_10)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.fourth_11)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.fourth_12)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.fourth_13)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.fourth_14))
                ) {
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(5)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(4)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(2)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(1)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(0)));
                }
            }
            {
                if (getString(string.FS[whichstation][num]).equals(getString(R.string.dong_1)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.dong_2)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.dong_5)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.dong_6)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.dong_7)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.dong_8)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.dong_9)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.dong_11)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.dong_12)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.dong_13)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.dong_14)) ||
                        getString(string.FS[whichstation][num]).equals(getString(R.string.dong_15))
                ) {
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(5)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(3)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(2)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(1)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(0)));
                }
            }
            {
                if (
                        getString(string.FS[whichstation][num]).equals(getString(R.string.kim_2)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.kim_3)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.kim_4)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.kim_5)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.kim_6)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.kim_8)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.kim_9)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.kim_10)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.kim_11)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.kim_12)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.kim_13)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.kim_14)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.kim_15)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.kim_16)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.kim_17)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.kim_18)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.kim_19)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.kim_20)) ||
                                getString(string.FS[whichstation][num]).equals(getString(R.string.kim_21))
                ) {
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(4)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(3)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(2)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(1)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(0)));
                }
            }
        }
//         환승 o
        {
            {
                if (getString(string.FS[whichstation][num]).equals("대저")
                ) {
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(4)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(3)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(1)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(0)));
                }
            }
            {
                if (getString(string.FS[whichstation][num]).equals("덕천")
                ) {
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(5)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(4)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(3)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(0)));
                }
            }
            {
                if (getString(string.FS[whichstation][num]).equals("미남")
                ) {
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(5)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(4)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(1)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(0)));
                }
            }
            {
                if (getString(string.FS[whichstation][num]).equals("동래")
                ) {
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(5)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(4)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(2)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(1)));

                }
            }
            {
                if (getString(string.FS[whichstation][num]).equals("교대")
                ) {
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(5)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(3)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(2)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(1)));

                }
            }
            {
                if (getString(string.FS[whichstation][num]).equals("거제")
                ) {
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(5)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(3)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(1)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(0)));

                }
            }
            {
                if (getString(string.FS[whichstation][num]).equals("연산")
                ) {
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(5)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(4)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(3)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(1)));

                }
            }
            {
                if (getString(string.FS[whichstation][num]).equals("수영")
                ) {
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(5)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(4)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(3)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(0)));

                }
            }
            {
                if (getString(string.FS[whichstation][num]).equals("벡스코")
                ) {
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(5)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(3)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(2)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(0)));

                }
            }
            {
                if (getString(string.FS[whichstation][num]).equals("서면")
                ) {
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(5)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(4)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(3)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(2)));

                }
            }
            {
                if (getString(string.FS[whichstation][num]).equals("사상")) {
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(4)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(3)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(2)));
                    tabs.removeTab(Objects.requireNonNull(tabs.getTabAt(0)));

                }


            }
        }


        transfer = tabs.getTabCount();
        if (Objects.requireNonNull(tabs.getTabAt(0)).getText() == "1호선") {
            selected_tab[0][0] = "다대포행";
            selected_tab[0][1] = "노포행";
        } else if (Objects.requireNonNull(tabs.getTabAt(0)).getText() == "2호선") {
            selected_tab[0][0] = "장산행";
            selected_tab[0][1] = "양산행";
        } else if (Objects.requireNonNull(tabs.getTabAt(0)).getText() == "3호선") {
            selected_tab[0][0] = "수영행";
            selected_tab[0][1] = "대저행";
        } else if (Objects.requireNonNull(tabs.getTabAt(0)).getText() == "4호선") {
            selected_tab[0][0] = "미남행";
            selected_tab[0][1] = "안평행";
        } else if (Objects.requireNonNull(tabs.getTabAt(0)).getText() == "동해선") {
            selected_tab[0][0] = "부전행";
            selected_tab[0][1] = "일광행";
        } else if (Objects.requireNonNull(tabs.getTabAt(0)).getText() == "김해선") {
            selected_tab[0][0] = "사상행";
            selected_tab[0][1] = "가야대행";
        }

        if (tabs.getTabCount() == 2) {
            if (Objects.requireNonNull(tabs.getTabAt(1)).getText() == "2호선") {
                selected_tab[1][0] = "장산행";
                selected_tab[1][1] = "양산행";
            } else if (Objects.requireNonNull(tabs.getTabAt(1)).getText() == "3호선") {
                selected_tab[1][0] = "수영행";
                selected_tab[1][1] = "대저행";
            } else if (Objects.requireNonNull(tabs.getTabAt(1)).getText() == "4호선") {
                selected_tab[1][0] = "미남행";
                selected_tab[1][1] = "안평행";
            } else if (Objects.requireNonNull(tabs.getTabAt(1)).getText() == "동해선") {
                selected_tab[1][0] = "부전행";
                selected_tab[1][1] = "일광행";
            } else if (Objects.requireNonNull(tabs.getTabAt(1)).getText() == "김해선") {
                selected_tab[1][0] = "사상행";
                selected_tab[1][1] = "가야대행";
            }
        }


        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                Log.d("MainActivity", "선택된 탭 : " + position);

                Fragment selected = null;
                if (position == 0) {
                    selected = one;
                } else if (position == 1) {
                    selected = two;
                }
                assert selected != null;
                getSupportFragmentManager().beginTransaction().replace(R.id.container, selected).commit();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }

}

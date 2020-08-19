package dsu.software.fragment_test;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class Station_Tab extends AppCompatActivity {

    ViewPager pager;

    static String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.station_tab);

        pager = findViewById(R.id.pager);
        pager.setOffscreenPageLimit(6);

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());

        first first = new first();
        adapter.addItem(first);

        second second = new second();
        adapter.addItem(second);


        third third = new third();
        adapter.addItem(third);

        fourth fourth = new fourth();
        adapter.addItem(fourth);

        dong dong = new dong();
        adapter.addItem(dong);

        kim kim = new kim();
        adapter.addItem(kim);

        pager.setAdapter(adapter);

        pager.setCurrentItem(0);

    }

    static class MyPagerAdapter extends FragmentStatePagerAdapter {
        ArrayList<Fragment> items = new ArrayList<>();

        MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        void addItem(Fragment item) {
            items.add(item);
        }

        @NonNull
        public Fragment getItem(int position) {
            return items.get(position);
        }

        public int getCount() {
            return items.size();
        }

        public CharSequence getPageTitle(int position) {
            if (position == 4) {
                return "동해선";
            } else if (position == 5) {
                return "김해선";
            } else {
                return (position + 1) + "호선";
            }
        }
    }
}

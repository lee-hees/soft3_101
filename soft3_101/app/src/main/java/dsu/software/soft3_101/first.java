package dsu.software.soft3_101;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressLint("Registered")
public class first extends AppCompatActivity {

    ListView listView;
    ListviewAdapter myListAdapter;
    ArrayList<ListViewItem> list_itemArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        final Stations string = new Stations();

        TextView home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent home = new Intent(getApplicationContext(),MainActivity.class);
//                startActivity(home);
                finish();
            }
        });

        list_itemArrayList = new ArrayList<ListViewItem>();
        listView = (ListView) findViewById(R.id.list_view);

        list_itemArrayList.add(new ListViewItem(getString(R.string.first_1)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_2)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_3)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_4)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_5)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_6)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_7)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_8)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_9)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_10)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_11)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_12)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_13)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_14)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_15)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_16)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_17)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_18)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_19)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_20)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_21)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_22)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_23)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_24)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_25)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_26)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_27)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_28)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_29)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_30)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_31)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_32)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_33)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_34)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_35)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_36)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_37)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_38)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_39)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.first_40)));

        myListAdapter = new ListviewAdapter(getApplicationContext(), list_itemArrayList);
        listView.setAdapter(myListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                detail.whichstation = 0; // 1호선 확인용
                if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_1))) {
                    detail.num = 0;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_2))) {
                    detail.num = 1;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_3))) {
                    detail.num = 2;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_4))) {
                    detail.num = 3;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_5))) {
                    detail.num = 4;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_6))) {
                    detail.num = 5;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_7))) {
                    detail.num = 6;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_8))) {
                    detail.num = 7;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_9))) {
                    detail.num = 8;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_10))) {
                    detail.num = 9;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_11))) {
                    detail.num = 10;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_12))) {
                    detail.num = 11;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_13))) {
                    detail.num = 12;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_14))) {
                    detail.num = 13;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_15))) {
                    detail.num = 14;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_16))) {
                    detail.num = 15;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_17))) {
                    detail.num = 16;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_18))) {
                    detail.num = 17;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_19))) {
                    detail.num = 18;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_20))) {
                    detail.num = 19;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_21))) {
                    detail.num = 20;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_22))) {
                    detail.num = 21;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_23))) {
                    detail.num = 22;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_24))) {
                    detail.num = 23;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_25))) {
                    detail.num = 24;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_26))) {
                    detail.num = 25;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_27))) {
                    detail.num = 26;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_28))) {
                    detail.num = 27;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_29))) {
                    detail.num = 28;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_30))) {
                    detail.num = 29;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_31))) {
                    detail.num = 30;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_32))) {
                    detail.num = 31;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_33))) {
                    detail.num = 32;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_34))) {
                    detail.num = 33;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_35))) {
                    detail.num = 34;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_36))) {
                    detail.num = 35;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_37))) {
                    detail.num = 36;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_38))) {
                    detail.num = 37;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_39))) {
                    detail.num = 38;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first_40))) {
                    detail.num = 39;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                }

                // 항상 같은 액티비티 사용
                Intent todetail = new Intent(getApplicationContext(), detail.class);
                startActivity(todetail);
            }
        });

    }

}

package dsu.software.soft3_101;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class kimhe extends AppCompatActivity {

    ListView listView;
    ListviewAdapter myListAdapter;
    ArrayList<ListViewItem> list_itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kimhe_layout);
        final Stations string = new Stations();

        TextView home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(home);
            }
        });

        list_itemArrayList = new ArrayList<ListViewItem>();
        listView = (ListView) findViewById(R.id.list_view);

        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_1)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_2)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_3)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_4)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_5)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_6)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_7)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_8)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_9)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_10)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_11)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_12)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_13)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_14)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_15)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_16)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_17)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_18)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_19)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_20)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe_21)));

        myListAdapter = new ListviewAdapter(getApplicationContext(), list_itemArrayList);
        listView.setAdapter(myListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                detail.whichstation = 5; // 김해선 확인용
                if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_1))) {
                    detail.num = 0;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_2))) {
                    detail.num = 1;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_3))) {
                    detail.num = 2;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_4))) {
                    detail.num = 3;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_5))) {
                    detail.num = 4;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_6))) {
                    detail.num = 5;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_7))) {
                    detail.num = 6;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_8))) {
                    detail.num = 7;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_9))) {
                    detail.num = 8;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_10))) {
                    detail.num = 9;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_11))) {
                    detail.num = 10;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_12))) {
                    detail.num = 11;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_13))) {
                    detail.num = 12;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_14))) {
                    detail.num = 13;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_15))) {
                    detail.num = 14;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_16))) {
                    detail.num = 15;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_17))) {
                    detail.num = 16;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_18))) {
                    detail.num = 17;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_19))) {
                    detail.num = 18;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_20))) {
                    detail.num = 19;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe_21))) {
                    detail.num = 20;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                }

                // 항상 같은 액티비티 사용
                Intent todetail = new Intent(getApplicationContext(), detail.class);
                startActivity(todetail);
            }
        });

    }

}

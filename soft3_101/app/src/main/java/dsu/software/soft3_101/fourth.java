package dsu.software.soft3_101;

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

public class fourth extends AppCompatActivity {

    ListView listView;
    ListviewAdapter myListAdapter;
    ArrayList<ListViewItem> list_itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_layout);
        final Stations string = new Stations();

        TextView home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(home);
            }
        });

        list_itemArrayList = new ArrayList<ListViewItem>();
        listView = (ListView) findViewById(R.id.list_view);

        list_itemArrayList.add(new ListViewItem(getString(R.string.fourth_1)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.fourth_2)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.fourth_3)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.fourth_4)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.fourth_5)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.fourth_6)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.fourth_7)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.fourth_8)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.fourth_9)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.fourth_10)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.fourth_11)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.fourth_12)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.fourth_13)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.fourth_14)));

        myListAdapter = new ListviewAdapter(getApplicationContext(), list_itemArrayList);
        listView.setAdapter(myListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                detail.whichstation = 3; // 4호선 확인용
                if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_1))) {
                    detail.num = 0;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_2))) {
                    detail.num = 1;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_3))) {
                    detail.num = 2;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_4))) {
                    detail.num = 3;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_5))) {
                    detail.num = 4;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_6))) {
                    detail.num = 5;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_7))) {
                    detail.num = 6;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_8))) {
                    detail.num = 7;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_9))) {
                    detail.num = 8;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_10))) {
                    detail.num = 9;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_11))) {
                    detail.num = 10;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_12))) {
                    detail.num = 11;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_13))) {
                    detail.num = 12;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_14))) {
                    detail.num = 13;
                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);

                }

                // 항상 같은 액티비티 사용
                Intent todetail = new Intent(getApplicationContext(), detail.class);
                startActivity(todetail);
            }
        });

    }

}

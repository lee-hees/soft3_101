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
                Intent todetail = new Intent(getApplicationContext(), MainActivity.class);
                // 임시로 홈화면 이동 --> 세부 정보 페이지로 이동으로 수정할 것
                startActivity(todetail);
            }
        });

    }

}

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
public class second extends AppCompatActivity {

    ListView listView;
    ListviewAdapter myListAdapter;
    ArrayList<ListViewItem> list_itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);


        list_itemArrayList = new ArrayList<ListViewItem>();
        listView = (ListView) findViewById(R.id.list_view);

        list_itemArrayList.add(new ListViewItem(getString(R.string.second_1)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_2)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_3)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_4)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_5)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_6)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_7)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_8)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_9)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_10)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_11)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_12)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_13)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_14)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_15)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_16)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_17)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_18)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_19)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_20)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_21)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_22)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_23)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_24)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_25)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_26)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_27)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_28)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_29)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_30)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_31)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_32)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_33)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_34)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_35)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_36)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_37)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_38)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_39)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_40)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_41)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_42)));

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

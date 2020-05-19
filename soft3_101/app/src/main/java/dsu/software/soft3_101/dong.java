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


public class dong extends AppCompatActivity {

    ListView listView;
    ListviewAdapter myListAdapter;
    ArrayList<ListViewItem> list_itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dong_layout);
        list_itemArrayList = new ArrayList<ListViewItem>();
        listView = (ListView) findViewById(R.id.list_view);

        list_itemArrayList.add(new ListViewItem(getString(R.string.dong_1)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.dong_2)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.dong_3)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.dong_4)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.dong_5)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.dong_6)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.dong_7)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.dong_8)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.dong_9)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.dong_10)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.dong_11)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.dong_12)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.dong_13)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.dong_14)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.dong_15)));

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

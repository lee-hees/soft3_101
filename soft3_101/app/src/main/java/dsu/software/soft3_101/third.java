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

public class third extends AppCompatActivity {

    ListView listView;
    ListviewAdapter myListAdapter;
    ArrayList<ListViewItem> list_itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);

        list_itemArrayList = new ArrayList<ListViewItem>();
        listView = (ListView) findViewById(R.id.list_view);

        list_itemArrayList.add(new ListViewItem(getString(R.string.third_1)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.third_2)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.third_3)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.third_4)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.third_5)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.third_6)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.third_7)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.third_8)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.third_9)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.third_10)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.third_11)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.third_12)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.third_13)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.third_14)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.third_15)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.third_16)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.third_17)));

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

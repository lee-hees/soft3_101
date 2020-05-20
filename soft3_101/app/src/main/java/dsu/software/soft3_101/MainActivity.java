package dsu.software.soft3_101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ListviewAdapter myListAdapter;
    ArrayList<ListViewItem> list_itemArrayList;

    static String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        list_itemArrayList.add(new ListViewItem(getString(R.string.first)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.second)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.third)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.fourth)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.dong)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kimhe)));

        myListAdapter = new ListviewAdapter(MainActivity.this, list_itemArrayList);
        listView.setAdapter(myListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (list_itemArrayList.get(position).getContent().equals(getString(R.string.first))){
                    Intent tofirst = new Intent(getApplicationContext(), first.class);
                    startActivity(tofirst);
                }
                else if(list_itemArrayList.get(position).getContent().equals(getString(R.string.second))){
                    Intent tosecond = new Intent(getApplicationContext(), second.class);
                    startActivity(tosecond);
                }
                else if(list_itemArrayList.get(position).getContent().equals(getString(R.string.third))){
                    Intent tothird = new Intent(getApplicationContext(), third.class);
                    startActivity(tothird);
                }
                else if(list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth))){
                    Intent tofourth = new Intent(getApplicationContext(), fourth.class);
                    startActivity(tofourth);
                }
                else if(list_itemArrayList.get(position).getContent().equals(getString(R.string.dong))){
                    Intent todong = new Intent(getApplicationContext(), dong.class);
                    startActivity(todong);
                }

                else if(list_itemArrayList.get(position).getContent().equals(getString(R.string.kimhe))){
                    Intent tokimhe = new Intent(getApplicationContext(), kimhe.class);
                    startActivity(tokimhe);
                }
            }
        });

    }

}
//package dsu.software.soft3_101;
//
//import android.annotation.SuppressLint;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ListView;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.util.ArrayList;
//
//@SuppressLint("Registered")
//public class kim extends AppCompatActivity {
//
//    ListView listView;
//    ListviewAdapter myListAdapter;
//    ArrayList<ListViewItem> list_itemArrayList;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.kim_layout);
//        final Stations string = new Stations();
//
//        TextView home = findViewById(R.id.home);
//        home.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent home = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(home);
//            }
//        });
//
//        list_itemArrayList = new ArrayList<ListViewItem>();
//        listView = (ListView) findViewById(R.id.list_view);
//
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_01)));
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_02)));
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_03)));
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_04)));
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_05)));
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_06)));
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_07)));
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_08)));
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_09)));
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_10)));
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_11)));
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_12)));
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_13)));
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_14)));
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_15)));
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_16)));
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_17)));
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_18)));
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_19)));
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_20)));
//        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_21)));
//
//        myListAdapter = new ListviewAdapter(getApplicationContext(), list_itemArrayList);
//        listView.setAdapter(myListAdapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                detail.whichstation = 4; // 동해선 확인용
//                if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_1))) {
//                    detail.num = 0;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_2))) {
//                    detail.num = 1;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_3))) {
//                    detail.num = 2;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_4))) {
//                    detail.num = 3;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_5))) {
//                    detail.num = 4;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_6))) {
//                    detail.num = 5;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_7))) {
//                    detail.num = 6;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_8))) {
//                    detail.num = 7;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_9))) {
//                    detail.num = 8;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_10))) {
//                    detail.num = 9;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_11))) {
//                    detail.num = 10;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_12))) {
//                    detail.num = 11;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_13))) {
//                    detail.num = 12;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_14))) {
//                    detail.num = 13;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_15))) {
//                    detail.num = 14;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_16))) {
//                    detail.num = 15;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_17))) {
//                    detail.num = 16;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_18))) {
//                    detail.num = 17;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_19))) {
//                    detail.num = 18;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_20))) {
//                    detail.num = 19;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_21))) {
//                    detail.num = 20;
//                    MainActivity.name = getString(string.FS[detail.whichstation][detail.num]);
//                }
//
//                // 항상 같은 액티비티 사용
//                Intent todetail = new Intent(getApplicationContext(), detail.class);
//                startActivity(todetail);
//            }
//        });
//
//    }
//
//}

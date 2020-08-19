package dsu.software.fragment_test;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class kim extends Fragment {

    ListView listView;
    ListviewAdapter myListAdapter;
    ArrayList<ListViewItem> list_itemArrayList;

    static String name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.station_list, container, false);

        final Station_string string = new Station_string();

        list_itemArrayList = new ArrayList<ListViewItem>();
        listView = (ListView) view.findViewById(R.id.list_view);

        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_1)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_2)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_3)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_4)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_5)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_6)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_7)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_8)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_9)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_10)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_11)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_12)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_13)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_14)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_15)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_16)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_17)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_18)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_19)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_20)));
        list_itemArrayList.add(new ListViewItem(getString(R.string.kim_21)));

        myListAdapter = new ListviewAdapter(getActivity(), list_itemArrayList);
        listView.setAdapter(myListAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Detail_Tab.whichstation = 5; // 김해선 확인용
                if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_1))) {
                    Detail_Tab.num = 0;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_2))) {
                    Detail_Tab.num = 1;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_3))) {
                    Detail_Tab.num = 2;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_4))) {
                    Detail_Tab.num = 3;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_5))) {
                    Detail_Tab.num = 4;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_6))) {
                    Detail_Tab.num = 5;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_7))) {
                    Detail_Tab.num = 6;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_8))) {
                    Detail_Tab.num = 7;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_9))) {
                    Detail_Tab.num = 8;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_10))) {
                    Detail_Tab.num = 9;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_11))) {
                    Detail_Tab.num = 10;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_12))) {
                    Detail_Tab.num = 11;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_13))) {
                    Detail_Tab.num = 12;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_14))) {
                    Detail_Tab.num = 13;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_15))) {
                    Detail_Tab.num = 14;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_16))) {
                    Detail_Tab.num = 15;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_17))) {
                    Detail_Tab.num = 16;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_18))) {
                    Detail_Tab.num = 17;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_19))) {
                    Detail_Tab.num = 18;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_20))) {
                    Detail_Tab.num = 19;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.kim_21))) {
                    Detail_Tab.num = 20;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);
                }

                Intent todetail = new Intent(getActivity(), Detail_Tab.class);
                startActivity(todetail);
            }
        });

        return view;
    }
}

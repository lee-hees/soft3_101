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

public class second extends Fragment {

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
        list_itemArrayList.add(new ListViewItem(getString(R.string.second_43)));

        myListAdapter = new ListviewAdapter(getActivity(), list_itemArrayList);
        listView.setAdapter(myListAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Detail_Tab.whichstation = 1; // 2호선 확인용
                if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_1))) {
                    Detail_Tab.num = 0;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_2))) {
                    Detail_Tab.num = 1;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_3))) {
                    Detail_Tab.num = 2;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_4))) {
                    Detail_Tab.num = 3;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_5))) {
                    Detail_Tab.num = 4;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_6))) {
                    Detail_Tab.num = 5;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_7))) {
                    Detail_Tab.num = 6;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_8))) {
                    Detail_Tab.num = 7;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_9))) {
                    Detail_Tab.num = 8;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_10))) {
                    Detail_Tab.num = 9;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_11))) {
                    Detail_Tab.num = 10;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_12))) {
                    Detail_Tab.num = 11;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_13))) {
                    Detail_Tab.num = 12;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_14))) {
                    Detail_Tab.num = 13;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_15))) {
                    Detail_Tab.num = 14;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_16))) {
                    Detail_Tab.num = 15;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_17))) {
                    Detail_Tab.num = 16;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_18))) {
                    Detail_Tab.num = 17;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_19))) {
                    Detail_Tab.num = 18;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_20))) {
                    Detail_Tab.num = 19;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_21))) {
                    Detail_Tab.num = 20;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_22))) {
                    Detail_Tab.num = 21;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_23))) {
                    Detail_Tab.num = 22;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_24))) {
                    Detail_Tab.num = 23;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_25))) {
                    Detail_Tab.num = 24;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_26))) {
                    Detail_Tab.num = 25;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_27))) {
                    Detail_Tab.num = 26;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_28))) {
                    Detail_Tab.num = 27;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_29))) {
                    Detail_Tab.num = 28;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_30))) {
                    Detail_Tab.num = 29;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_31))) {
                    Detail_Tab.num = 30;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_32))) {
                    Detail_Tab.num = 31;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_33))) {
                    Detail_Tab.num = 32;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_34))) {
                    Detail_Tab.num = 33;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_35))) {
                    Detail_Tab.num = 34;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_36))) {
                    Detail_Tab.num = 35;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_37))) {
                    Detail_Tab.num = 36;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_38))) {
                    Detail_Tab.num = 37;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_39))) {
                    Detail_Tab.num = 38;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_40))) {
                    Detail_Tab.num = 39;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_41))) {
                    Detail_Tab.num = 40;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_42))) {
                    Detail_Tab.num = 41;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.second_42))) {
                    Detail_Tab.num = 42;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                }

                Intent todetail = new Intent(getActivity(), Detail_Tab.class);
                startActivity(todetail);
            }
        });

        return view;
    }
}

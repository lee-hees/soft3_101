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

public class fourth extends Fragment {

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

        myListAdapter = new ListviewAdapter(getActivity(), list_itemArrayList);
        listView.setAdapter(myListAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Detail_Tab.whichstation = 3; // 4호선 확인용
                if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_1))) {
                    Detail_Tab.num = 0;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_2))) {
                    Detail_Tab.num = 1;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_3))) {
                    Detail_Tab.num = 2;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_4))) {
                    Detail_Tab.num = 3;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_5))) {
                    Detail_Tab.num = 4;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_6))) {
                    Detail_Tab.num = 5;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_7))) {
                    Detail_Tab.num = 6;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_8))) {
                    Detail_Tab.num = 7;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_9))) {
                    Detail_Tab.num = 8;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_10))) {
                    Detail_Tab.num = 9;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_11))) {
                    Detail_Tab.num = 10;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_12))) {
                    Detail_Tab.num = 11;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_13))) {
                    Detail_Tab.num = 12;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                } else if (list_itemArrayList.get(position).getContent().equals(getString(R.string.fourth_14))) {
                    Detail_Tab.num = 13;
                    Station_Tab.name = getString(string.FS[Detail_Tab.whichstation][Detail_Tab.num]);

                }

                Intent todetail = new Intent(getActivity(), Detail_Tab.class);
                startActivity(todetail);
            }
        });

        return view;
    }
}

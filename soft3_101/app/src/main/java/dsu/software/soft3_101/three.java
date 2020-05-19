package dsu.software.soft3_101;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three extends AppCompatActivity {
    ListView listView;
    List<String> mList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three);


        listView = (ListView) findViewById(R.id.list_view);

        String[] strs = {

                getString(R.string.third_1),
                getString(R.string.third_2),
                getString(R.string.third_3),
                getString(R.string.third_4),
                getString(R.string.third_5),
                getString(R.string.third_6),
                getString(R.string.third_7),
                getString(R.string.third_8),
                getString(R.string.third_9),
                getString(R.string.third_10),
                getString(R.string.third_11),
                getString(R.string.third_12),
                getString(R.string.third_13),
                getString(R.string.third_14),
                getString(R.string.third_15),
                getString(R.string.third_16),
                getString(R.string.third_17),


        };

        mList = Arrays.asList(strs);

        listView.setAdapter(new three.MyCustomAdapter());

    }


    /*** Custom Adapter ***/
    private class MyCustomAdapter extends ArrayAdapter<String> {

        public MyCustomAdapter() {
            super(three.this, R.layout.item_layout, mList);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null)
                convertView = getLayoutInflater().inflate(R.layout.item_layout, parent, false);

            TextView textViewAtCustomLayout = (TextView) convertView.findViewById(R.id.text_view_at_custom_layout);
            textViewAtCustomLayout.setText(mList.get(position));

            return convertView;
        }
    }
}

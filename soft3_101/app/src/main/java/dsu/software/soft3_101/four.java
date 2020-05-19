package dsu.software.soft3_101;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class four extends AppCompatActivity {
    ListView listView;
    List<String> mList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four);


        listView = (ListView) findViewById(R.id.list_view);

        String[] strs = {

                getString(R.string.fourth_1),
                getString(R.string.fourth_2),
                getString(R.string.fourth_3),
                getString(R.string.fourth_4),
                getString(R.string.fourth_5),
                getString(R.string.fourth_6),
                getString(R.string.fourth_7),
                getString(R.string.fourth_8),
                getString(R.string.fourth_9),
                getString(R.string.fourth_10),
                getString(R.string.fourth_11),
                getString(R.string.fourth_12),
                getString(R.string.fourth_13),
                getString(R.string.fourth_14)
        };

        mList = Arrays.asList(strs);

        listView.setAdapter(new four.MyCustomAdapter());

    }


    /*** Custom Adapter ***/
    private class MyCustomAdapter extends ArrayAdapter<String> {

        public MyCustomAdapter() {
            super(four.this, R.layout.item_layout, mList);
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

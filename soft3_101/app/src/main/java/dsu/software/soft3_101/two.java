package dsu.software.soft3_101;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

@SuppressLint("Registered")
public class two extends AppCompatActivity {
    ListView listView;
    List<String> mList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);


        listView = (ListView) findViewById(R.id.list_view);

        String[] strs = {

                getString(R.string.second_1),
                getString(R.string.second_2),
                getString(R.string.second_3),
                getString(R.string.second_4),
                getString(R.string.second_5),
                getString(R.string.second_6),
                getString(R.string.second_7),
                getString(R.string.second_8),
                getString(R.string.second_9),
                getString(R.string.second_10),
                getString(R.string.second_11),
                getString(R.string.second_12),
                getString(R.string.second_13),
                getString(R.string.second_14),
                getString(R.string.second_15),
                getString(R.string.second_16),
                getString(R.string.second_17),
                getString(R.string.second_18),
                getString(R.string.second_19),
                getString(R.string.second_20),
                getString(R.string.second_21),
                getString(R.string.second_22),
                getString(R.string.second_23),
                getString(R.string.second_24),
                getString(R.string.second_25),
                getString(R.string.second_26),
                getString(R.string.second_27),
                getString(R.string.second_28),
                getString(R.string.second_29),
                getString(R.string.second_30),
                getString(R.string.second_31),
                getString(R.string.second_32),
                getString(R.string.second_33),
                getString(R.string.second_34),
                getString(R.string.second_35),
                getString(R.string.second_36),
                getString(R.string.second_37),
                getString(R.string.second_38),
                getString(R.string.second_39),
                getString(R.string.second_40),
                getString(R.string.second_41),
                getString(R.string.second_42),

        };

        mList = Arrays.asList(strs);

        listView.setAdapter(new two.MyCustomAdapter());

    }


    /*** Custom Adapter ***/
    private class MyCustomAdapter extends ArrayAdapter<String> {

        public MyCustomAdapter() {
            super(two.this, R.layout.item_layout, mList);
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

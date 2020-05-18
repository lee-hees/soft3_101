package dsu.software.subwaybusan;

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

public class one extends AppCompatActivity {
    ListView listView;
    List<String> mList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one);


        listView = (ListView)findViewById(R.id.list_view);
        String strs[] = {

                 getString(R.string.first_1),
                 getString(R.string.first_2),
                 getString(R.string.first_3),
                 getString(R.string.first_4),
                 getString(R.string.first_5),
                 getString(R.string.first_6),
                 getString(R.string.first_7),
                 getString(R.string.first_8),
                 getString(R.string.first_9),
                getString(R.string.first_10),
                getString(R.string.first_11),
                getString(R.string.first_12),
                getString(R.string.first_13),
                getString(R.string.first_14),
                getString(R.string.first_15),
                getString(R.string.first_16),
                getString(R.string.first_17),
                getString(R.string.first_18),
                getString(R.string.first_19),
                getString(R.string.first_20),
                getString(R.string.first_21),
                getString(R.string.first_22),
                getString(R.string.first_23),
                getString(R.string.first_24),
                getString(R.string.first_25),
                getString(R.string.first_26),
                getString(R.string.first_27),
                getString(R.string.first_28),
                getString(R.string.first_29),
                getString(R.string.first_30),
                getString(R.string.first_31),
                getString(R.string.first_32),
                getString(R.string.first_33),
                getString(R.string.first_34),
                getString(R.string.first_35),
                getString(R.string.first_36),
                getString(R.string.first_37),
                getString(R.string.first_38),
                getString(R.string.first_39),
                getString(R.string.first_40)


        };

        mList = Arrays.asList(strs);

        listView.setAdapter(new one.MyCustomAdapter());

    }


    /*** Custom Adapter ***/
    private class MyCustomAdapter extends ArrayAdapter<String>
    {

        public MyCustomAdapter()
        {
            super(one.this,R.layout.item_layout,mList);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            if(convertView==null) convertView = getLayoutInflater().inflate(R.layout.item_layout,parent,false);

            TextView textViewAtCustomLayout = (TextView)convertView.findViewById(R.id.text_view_at_custom_layout);
            textViewAtCustomLayout.setText(mList.get(position));

            return convertView;
        }
    }
}

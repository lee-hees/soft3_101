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

public class item extends AppCompatActivity {
    ListView listView;
    List<String> mList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dong_layout);


        listView = (ListView) findViewById(R.id.list_view);
        String[] strs = {"미남역", "동래역", "수안역", "낙민역", "충렬사역", "명장역", "서동역", "금사역", "반여농산물시장역", "석대역", "영산대역", "동부산대학역", "고촌역", "안평역"};

        mList = Arrays.asList(strs);

        listView.setAdapter(new MyCustomAdapter());

    }


    /*** Custom Adapter ***/
    private class MyCustomAdapter extends ArrayAdapter<String> {

        public MyCustomAdapter() {
            super(item.this, R.layout.item_layout, mList);
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
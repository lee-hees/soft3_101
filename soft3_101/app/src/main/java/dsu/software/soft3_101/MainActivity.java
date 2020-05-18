package dsu.software.soft3_101;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<String> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list_view);
        String strs[] = {
                getString(R.string.first),
                getString(R.string.second),
                getString(R.string.third),
                getString(R.string.fourth),
                getString(R.string.dong)
        };

        mList = Arrays.asList(strs);

        listView.setAdapter(new MyCustomAdapter());
//        data.add("1호선");
//        data.add("2호선");
//        data.add("3호선");
//        data.add("4호선");
//        data.add("부산 김해선");
//        data.add("동해선");

//        adapter.notifyDataSetInvalidated();

    }

    private class MyCustomAdapter extends ArrayAdapter<String>
    {

        public MyCustomAdapter()
        {
            super(MainActivity.this,R.layout.item_layout,mList);
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
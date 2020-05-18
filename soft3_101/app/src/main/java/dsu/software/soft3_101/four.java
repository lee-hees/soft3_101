package dsu.software.soft3_101;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class four extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.list);

        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        list.setAdapter(adapter);

        data.add("미남역");
        data.add("동래역");
        data.add("수안역");
        data.add("낙민역");
        data.add("충렬사역");
        data.add("명장역");
        data.add("서동역");
        data.add("금사역");
        data.add("반여농산물시장역");
        data.add("석대역");
        data.add("영산대역");
        data.add("동부산대학역");
        data.add("고촌역");
        data.add("안평역");
        adapter.notifyDataSetInvalidated();;
    }
}

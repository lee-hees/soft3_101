package dsu.software.subwaybusan;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class five extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.list);

        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        list.setAdapter(adapter);

        data.add("부전(동해선)역");
        data.add("거제해맞이역");
        data.add("거제역");
        data.add("교대역");
        data.add("동래(동해선)역");
        data.add("안락역");
        data.add("부산원동역");
        data.add("재송역");
        data.add("센텀역");
        data.add("벡스코역");
        data.add("신해운대역");
        data.add("송정역");
        data.add("오시리아역");
        data.add("기장역");
        data.add("일광역");
        adapter.notifyDataSetInvalidated();;
    }
}

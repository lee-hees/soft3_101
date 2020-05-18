package dsu.software.soft3_101;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class one extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.list);

        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        list.setAdapter(adapter);

        data.add("다대포해수욕장역");
        data.add("다디포항역");
        data.add("낫개역");
        data.add("신장림역");
        data.add("장림역");
        data.add("동매역");
        data.add("신평역");
        data.add("하단역");
        data.add("당리역");
        data.add("사하역");
        data.add("괴정역");
        data.add("대티역");
        data.add("서대신역");
        data.add("동대신역");
        data.add("토성역");
        data.add("자갈치역");
        data.add("남포역");
        data.add("중앙역");
        data.add("부산역");
        data.add("초량역");
        data.add("부산진역");
        data.add("좌천역");
        data.add("범일역");
        data.add("범내골역");
        data.add("서면역");
        data.add("부전역");
        data.add("양정역");
        data.add("시청역");
        data.add("연산역");
        data.add("교대역");
        data.add("동래역");
        data.add("명륜역");
        data.add("온천장역");
        data.add("부산대역");
        data.add("장전역");
        data.add("구서역");
        data.add("두실역");
        data.add("남산역");
        data.add("범어사역");
        data.add("노포역");
        adapter.notifyDataSetInvalidated();;
    }
}

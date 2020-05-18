package dsu.software.soft3_101;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class three extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.list);

        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        list.setAdapter(adapter);

        data.add("대저역");
        data.add("체육공원역");
        data.add("강서구청역");
        data.add("구포역");
        data.add("덕천역");
        data.add("숙등역");
        data.add("남산정역");
        data.add("만덕역");
        data.add("미남역");
        data.add("사직역");
        data.add("종합운동장역");
        data.add("거제역");
        data.add("연산역");
        data.add("물만골역");
        data.add("배산역");
        data.add("망미역");
        data.add("수영역");
         adapter.notifyDataSetInvalidated();;
    }
}

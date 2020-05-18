package dsu.software.subwaybusan;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class two extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.list);

        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        list.setAdapter(adapter);

        data.add("양산역");
        data.add("남양산역");
        data.add("부산대양산캠퍼스역");
        data.add("중산역");
        data.add("호포역");
        data.add("금곡역");
        data.add("동원역");
        data.add("율리역");
        data.add("화명역");
        data.add("수정역");
        data.add("덕천역");
        data.add("구명역");
        data.add("구남역");
        data.add("모라역");
        data.add("모덕역");
        data.add("덕포역");
        data.add("감전역");
        data.add("주례역");
        data.add("냉정역");
        data.add("개금역");
        data.add("동의대역");
        data.add("가야역");
        data.add("부암역");
        data.add("서면역");
        data.add("전포역");
        data.add("국제금융센터.부산은행역");
        data.add("문현역");
        data.add("지게골역");
        data.add("못골역");
        data.add("대연역");
        data.add("경성대.부경대역");
        data.add("남천역");
        data.add("금련산역");
        data.add("광안역");
        data.add("수영역");
        data.add("민락역");
        data.add("센텀시티역");
        data.add("벡스코역");
        data.add("동백역");
        data.add("해운대역");
        data.add("중동역");
        data.add("장산역");
        adapter.notifyDataSetInvalidated();;
    }
}

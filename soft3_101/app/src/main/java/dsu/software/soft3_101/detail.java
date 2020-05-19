package dsu.software.soft3_101;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("Registered")
public class detail extends AppCompatActivity {

    static int whichstation;
    static int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);
        final Stations string = new Stations();

        final TextView station = findViewById(R.id.station);
        station.setText(MainActivity.name);

        TextView before = findViewById(R.id.before);
        before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num != 0) {
                    num -= 1;
                    station.setText(string.FS[whichstation][num]);
                }

            }
        });

        TextView after = findViewById(R.id.after);
        after.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num != string.FS[whichstation].length - 1) {
                    num += 1;
                    station.setText(string.FS[whichstation][num]);
                }
            }
        });

    }
}

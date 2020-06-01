package dsu.software.fragment_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText id = findViewById(R.id.id);
        final EditText pw = findViewById(R.id.pw);
        final Button login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (id.getText().toString().equals("admin") && pw.getText().toString().equals("admin")) {
                    Intent login = new Intent(getApplicationContext(), Station_Tab.class);
                    startActivity(login);
                }
                else if(!id.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this, "계정을 확인하세요", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "비밀번호를 확인하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}

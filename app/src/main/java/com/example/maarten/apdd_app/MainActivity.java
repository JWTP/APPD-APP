package com.example.maarten.apdd_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn_get_code;
    Button btn_go_to_home;
    TextView txt_unlock_code;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_go_to_home = (Button)findViewById(R.id.go_home);
        btn_get_code = (Button)findViewById(R.id.button_get_code);
        txt_unlock_code = (TextView)findViewById(R.id.unlock_code);

        btn_go_to_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back_to_home = new Intent(MainActivity.this, Home.class);
                startActivity(back_to_home);
            }
        });

        btn_get_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              String unlock_code = txt_unlock_code.getText().toString();

                int random_number = (int) (1000 + (Math.random()*9000));

                txt_unlock_code.setText(String.valueOf(random_number));

                btn_get_code.setEnabled(false);


            }
        });
    }
}

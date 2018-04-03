package com.example.maarten.apdd_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button btn_unlock_drone;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_unlock_drone = (Button)findViewById(R.id.button_unlock_drone);

        btn_unlock_drone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_to_unlock_code = new Intent(Home.this, MainActivity.class);
                startActivity(go_to_unlock_code);
            }
        });


    }



}

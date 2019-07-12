package com.saraencci.alc4app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("ALC 4 phase 1");
        setContentView(R.layout.activity_main);
        Button btn_web;
        Button btn_profile;
        btn_web = (Button)findViewById(R.id.button_web);
        btn_profile = (Button)findViewById(R.id.button_profile);
        btn_web.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), myWeb.class);
                startActivity(i);

            }
        });

        btn_profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), profileActivity.class);
                startActivity(i);

            }
        });
    }
}

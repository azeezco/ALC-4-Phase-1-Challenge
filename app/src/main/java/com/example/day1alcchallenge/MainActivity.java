package com.example.day1alcchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button AboutALC = (Button)findViewById(R.id.aboutALC);
        final Button MyProfile = (Button)findViewById(R.id.myProfile);
        AboutALC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,About_ALC.class);
                startActivity(intent);
            }
        });


        MyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,My_Profile.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.ss.deadlineslul;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Click1(View view) {
        Intent intent1 = new Intent(MainActivity.this, SRS_TestWindow.class);
        startActivity(intent1);
    }

    public void Click2(View view) {
        Intent intent2 = new Intent(MainActivity.this, Database.class);
        startActivity(intent2);
    }

    public void Click3(View view) {
        Intent intent3 = new Intent(MainActivity.this, programinfo.class);
        startActivity(intent3);
    }

    public void Click4(View view) {
        Intent intent4 = new Intent(MainActivity.this, howtouseprogram.class);
        startActivity(intent4);
    }
}

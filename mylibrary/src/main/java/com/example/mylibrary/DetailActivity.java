package com.example.mylibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        String funnyJokes = getIntent().getStringExtra("joke");

        TextView tv = (TextView) findViewById(R.id.joke);
        tv.setText(funnyJokes);
    }
}

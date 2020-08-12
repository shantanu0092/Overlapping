package com.shantanu.overlappimage;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Data extends AppCompatActivity {

    TextView showdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        showdata = findViewById(R.id.showinput);

        showdata.setText(getIntent().getStringExtra("data"));
    }
}

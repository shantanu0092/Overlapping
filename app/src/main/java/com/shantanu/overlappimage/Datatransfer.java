package com.shantanu.overlappimage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Datatransfer extends AppCompatActivity {

    EditText editText;
    Button buttonone, btn_moveToMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datatransfer);
        editText = findViewById(R.id.edittextone);
        buttonone = findViewById(R.id.button);
        btn_moveToMainActivity = findViewById(R.id.btn_moveToMainActivity);

        buttonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = editText.getText().toString();
                Intent intent = new Intent(Datatransfer.this, Data.class);
                intent.putExtra("data", data);
                startActivity(intent);
            }
        });

        btn_moveToMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Datatransfer.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}



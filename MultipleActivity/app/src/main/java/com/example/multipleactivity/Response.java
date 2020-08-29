package com.example.multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Response extends AppCompatActivity {

    TextView response;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_response);
        response=(TextView)findViewById(R.id.response);
        Intent intent=getIntent();
        String msg="Hello, Welcome "+intent.getStringExtra("message")+".";
        response.setText(msg);
    }
}
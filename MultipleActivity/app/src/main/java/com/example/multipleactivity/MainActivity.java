package com.example.multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText text;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(EditText)findViewById(R.id.text);
        submit=(Button)findViewById(R.id.submit);
    }

    public void clickButton(View view) {
        String sendText=text.getText().toString();
        Intent response=new Intent(getApplicationContext(),Response.class);
        response.putExtra("message",sendText);
        startActivity(response);
    }
}
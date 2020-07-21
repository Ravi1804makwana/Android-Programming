package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
      //  t1=getText("t1");

    }
    public void counter(View view) {
        Toast toast=Toast.makeText(getApplicationContext(),"Hello I am Ravikumar Makwana",5);
        toast.show();
    }
}
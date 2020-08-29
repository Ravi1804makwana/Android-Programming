package com.example.androidbasicuxcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void male(View view) {
        Toast toast= (Toast)Toast.makeText(this,"Male",2);
        toast.show();
    }

    public void female(View view) {
        Toast toast= (Toast)Toast.makeText(this,"Female",2);
        toast.show();
    }

}
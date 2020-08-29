package com.example.signupfrom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username,password,email,phoneNo,country,state,gender,interest,dateOfBirth;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        email=(EditText)findViewById(R.id.email);
        phoneNo=(EditText)findViewById(R.id.phone);
        country=(EditText)findViewById(R.id.country);
        state=(EditText)findViewById(R.id.state);
        dateOfBirth=(EditText)findViewById(R.id.dob);
    }
}
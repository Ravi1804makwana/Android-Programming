package com.example.contactme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText fname,lname,phone,email,address,pinecode,username,password;
    CheckBox h1,h2,h3;
    RadioButton male,female;
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname=(EditText)findViewById(R.id.fname);
        lname=(EditText)findViewById(R.id.lname);
        phone=(EditText)findViewById(R.id.phone);
        email=(EditText)findViewById(R.id.email);
        address=(EditText)findViewById(R.id.address);
        pinecode=(EditText)findViewById(R.id.pinecode);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        h1=(CheckBox)findViewById(R.id.h1);
        h2=(CheckBox)findViewById(R.id.h2);
        h3=(CheckBox)findViewById(R.id.h3);
        male=(RadioButton)findViewById(R.id.male);
        female=(RadioButton)findViewById(R.id.female);
        ratingBar =(RatingBar) findViewById(R.id.rating);
    }

    public void submit(View view) {
        String msg = new String();
        msg = "First Name : " + fname.getText().toString() + "\n";
        msg += "Last Name : " + lname.getText().toString() + "\n";
        msg += "Phone No : " + phone.getText().toString() + "\n";
        msg += "Email Address : " + email.getText().toString() + "\n";
        msg += "Pine Code : " + pinecode.getText().toString() + "\n";
        msg += "Username : " + username.getText().toString() + "\n";
        msg += "Password : " + password.getText().toString() + "\n";
        msg += "First Name : " + fname.getText().toString() + "\n";
        msg += "Hobbies : ";
        if (h1.isChecked()) {
            msg += h1.getText().toString() + " ";
        }
        if (h2.isChecked()) {
            msg += h2.getText().toString() + " ";
        }
        if (h3.isChecked()) {
            msg += h3.getText().toString() + " ";
        }
        msg += "\n";
        msg += "Gender : ";
        if (male.isChecked())
            msg += "Male\n";
        else
            msg += "Female\n";

        msg += "Rating : " + ratingBar.getRating();
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void linkdln(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.linkedin.com/in/ravi-kumar-4a1892199/"));
        startActivity(intent);
    }

    public void github(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/Ravi1804makwana"));
        startActivity(intent);
    }

    public void hackerrank(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://hackerrank.com/Ravi_makwana"));
        startActivity(intent);
    }

    public void website(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ravi-kumar-makwana.herokuapp.com"));
        startActivity(intent);
    }
}
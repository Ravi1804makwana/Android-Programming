package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public EditText username;
    public EditText password;
    public TextView result;
    public Button login;
    public static int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        result=(TextView)findViewById(R.id.result);
        login=(Button)findViewById(R.id.login);
        counter=0;
    }

    public void login(View view) {

        if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
        {
            result.setText("Login Successful !".toString());
            counter=0;
        }
        else
        {
            counter++;
            if(counter==3) {
                result.setText("" + counter + " Try, Login Failed !\nYour Account is Blocked !.".toString());
                login.setEnabled(false);
            }
            else
                result.setText(""+counter+" Try, Login Failed !\nPlease Try Again.".toString());
        }

    }
}
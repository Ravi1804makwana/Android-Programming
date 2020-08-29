package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast toast=(Toast) Toast.makeText(this,"Selected Item : "+item.getTitle(), Toast.LENGTH_SHORT);
        switch (item.getItemId())
        {
            case R.id.m1:
                return true;
            case R.id.m2:
                return true;
            case R.id.m3:
                return true;
            case R.id.m4:
                return true;
            case R.id.m5:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void menu1(MenuItem item) {
        Toast toast=Toast.makeText(this,"Menu 1 is Clicked",Toast.LENGTH_LONG);
        toast.show();
    }

}
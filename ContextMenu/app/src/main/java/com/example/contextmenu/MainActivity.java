package com.example.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView button=findViewById(R.id.b1);
        registerForContextMenu(button);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Choose Option");
        menu.add(0,0,0,"Menu 1");
        menu.add(0,0,0,"Menu 2");
        menu.add(0,0,0,"Menu 3");
        menu.add(0,0,0,"Menu 4");
        menu.add(0,0,0,"Menu 5");
        menu.add(0,0,0,"Menu 6");
        menu.add(0,0,0,"Menu 7");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        Toast toast=Toast.makeText(this,"Seleted Item : "+item.getTitle(),Toast.LENGTH_LONG);
        toast.show();
        return super.onContextItemSelected(item);
    }
}
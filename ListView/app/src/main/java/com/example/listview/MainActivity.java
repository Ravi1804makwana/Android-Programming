package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public String[] mylist={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter=new ArrayAdapter<String>(this,R.layout.activity_list,mylist);
        ListView listView=(ListView)findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }
}
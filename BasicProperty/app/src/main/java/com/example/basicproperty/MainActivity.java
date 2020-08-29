package com.example.basicproperty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static com.example.basicproperty.R.*;

public class MainActivity extends AppCompatActivity {

    private RadioButton geder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        final TextView t1=(TextView) findViewById(R.id.t1);

        Button b1=(Button)findViewById(R.id.b1);

        final RadioGroup rd=(RadioGroup) findViewById(R.id.rd);

        b1.setOnClickListener(new View.OnClickListener() {
            float c=0;
            @Override
            public void onClick(View view) {
                int selectedId=rd.getCheckedRadioButtonId();

                geder=(RadioButton)findViewById(selectedId);
                String msg= t1.getText().toString();
                msg+="Gender " + geder.getText().toString();
                t1.setText(msg);
            }
        });
    }
}
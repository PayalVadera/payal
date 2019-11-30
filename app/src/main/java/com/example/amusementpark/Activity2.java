package com.example.amusementpark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
String name2;
int child,adult,senior;
String bill2;
TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent i=getIntent();

        t1=(TextView)findViewById(R.id.textView);
        name2=i.getStringExtra("name1");
        t1.setText(name2);


        t2=(TextView)findViewById(R.id.textView2);
        bill2=i.getStringExtra("bill1");
        t2.setText(bill2);




    }
}

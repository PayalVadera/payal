package com.example.amusementpark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.*;
import android.app.*;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4;
    int child=0,adult=0,senior=0,bill=0;
    String name="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        AlertDialog.Builder a1 = new AlertDialog.Builder(this);
        a1.setMessage("Are you sure you want to submit?");
        a1.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                hello();
            }
        });
        a1.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
        finish();
            }
        });
        AlertDialog a2 = a1.create();
        a2.show();
    }
    public void hello(){


        int flag=0;
        Intent i=new Intent(this,Activity2.class);
        t1=(EditText)findViewById(R.id.editText3);
        name=t1.getText().toString();
        if(!name.matches("^[a-zA-Z ]*$"))
        {
            t1.requestFocus();
            t1.setError("Illegal name");
            flag=1;
        }
        if(name.length()<5||name.length()>12)
        {
            t1.requestFocus();
            t1.setError("Illegal name length");
            flag=1;

        }
        i.putExtra("name1",name);


        t2=(EditText)findViewById(R.id.editText2);
        child=Integer.parseInt(t2.getText().toString());


        t3=(EditText)findViewById(R.id.editText);
        adult=Integer.parseInt(t3.getText().toString());


        t4=(EditText)findViewById(R.id.editText4);
        senior=Integer.parseInt(t4.getText().toString());


        bill=child*200+adult*500+senior*1000;
        String b=String.valueOf(bill);
        i.putExtra("bill1",b);

        if(flag==0)
        startActivity(i);
        else
            Toast.makeText(this,"Select relevant options first",Toast.LENGTH_SHORT).show();

    }
}

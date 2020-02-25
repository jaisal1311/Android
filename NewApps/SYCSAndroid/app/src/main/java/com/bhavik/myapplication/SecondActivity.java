package com.bhavik.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String str1="";
    String str2="";

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView=findViewById(R.id.textView);

        str1=getIntent().getExtras().getString("Value1");
        str2=getIntent().getExtras().getString("Value2");

        textView.setText(str1+"\n"+str2);

    }
}

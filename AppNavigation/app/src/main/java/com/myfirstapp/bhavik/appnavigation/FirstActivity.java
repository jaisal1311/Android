package com.myfirstapp.bhavik.appnavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    Button btnActionBar;
    Button btnTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnActionBar=(Button)findViewById(R.id.btnActionBar);
        btnTabs=(Button)findViewById(R.id.btnTabs);

        btnActionBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FirstActivity.this,ActionBarNavigation.class);
                startActivity(i);
                finish();
            }
        });

        btnTabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FirstActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}

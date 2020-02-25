package com.myfirstapp.bhavik.appnavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class ActionBarNavigation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar_navigation);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem m){
        if(m.getItemId()==android.R.id.home){
            //super.onBackPressed();
            Intent i=new Intent(ActionBarNavigation.this,FirstActivity.class);
            startActivity(i);
            finish();
        }
        return true;
    }

    @Override
    public void onBackPressed(){

    }
}

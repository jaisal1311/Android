package com.bhavik.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by BHAVIK on 02/01/2020.
 */

public class CustomLayoutAdapter extends ArrayAdapter<String> {

    Activity ac;
    ArrayList<String> name;
    ArrayList<String> number;

    public CustomLayoutAdapter(Activity activity, ArrayList<String> arr_name,ArrayList<String> arr_number){
        super(activity,R.layout.customlayout,arr_name);
        this.ac=activity;
        this.name=arr_name;
        this.number=arr_number;
    }

    @Override
    public View getView(int position,View v,ViewGroup vg){
        LayoutInflater inflater=ac.getLayoutInflater();
        v=inflater.inflate(R.layout.customlayout,null);
        TextView txt1=v.findViewById(R.id.txt1);
        TextView txt2=v.findViewById(R.id.txt2);
        txt1.setText(name.get(position));
        txt2.setText(number.get(position));
        return v;
    }
}

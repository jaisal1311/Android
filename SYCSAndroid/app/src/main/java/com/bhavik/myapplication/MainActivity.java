package com.bhavik.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ListView lstView;
    ArrayList<String> arr_name;
    ArrayList<String> arr_email;
    ArrayList<String> arr_contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle", "onCreate invoked");

        lstView=findViewById(R.id.lstView);

        arr_name=new ArrayList<>();
        arr_contact=new ArrayList<>();
        arr_email=new ArrayList<>();
        arr_name.add("List 1");
        arr_name.add("List 2");
        arr_name.add("List 3");
        arr_name.add("List 4");
        arr_name.add("List 5");
        arr_name.add("List 6");
        arr_name.add("List 7");
        arr_name.add("List 8");
        arr_name.add("List 9");
        arr_name.add("List 10");

        arr_contact.add("121");
        arr_contact.add("122");
        arr_contact.add("123");
        arr_contact.add("124");
        arr_contact.add("125");
        arr_contact.add("126");
        arr_contact.add("127");
        arr_contact.add("128");
        arr_contact.add("129");
        arr_contact.add("130");

        arr_email.add("121@gmail.com");
        arr_email.add("122@gmail.com");
        arr_email.add("123@gmail.com");
        arr_email.add("124@gmail.com");
        arr_email.add("125@gmail.com");
        arr_email.add("126@gmail.com");
        arr_email.add("127@gmail.com");
        arr_email.add("128@gmail.com");
        arr_email.add("129@gmail.com");
        arr_email.add("130@gmail.com");

       /* ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr_name);
        lstView.setAdapter(adapter);*/

        CustomLayoutAdapter custom=new CustomLayoutAdapter(this,arr_name,arr_contact);
        lstView.setAdapter(custom);


        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                final AlertDialog alertDialog=new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setMessage("Selected:"+arr_name.get(position)+"\nContact No:"+arr_contact.get(position)+"\nEmail:"+arr_email.get(position));
                alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });


        /*btnImplicitIntent=findViewById(R.id.btnImplicit);
        btnExplicitIntent=findViewById(R.id.btnExplicit);

        btnExplicitIntent.setOnClickListener(this);*/

        /*btnExplicitIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("Value1", "Android");
                i.putExtra("Value2", "SYCS ");
                startActivity(i);
            }
        });*/

       /* btnImplicitIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent=new Intent(Intent.ACTION_VIEW);
                //intent.setData(Uri.parse("http://www.google.com"));
                //startActivity(intent);

                Intent intent=new Intent(MainActivity.this,RelativeLayout.class);
                startActivity(intent);
            }
        });*/
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle", "onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle", "onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle", "onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle", "onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle", "onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle", "onDestroy invoked");
    }

    @Override
    public void onClick(View view) {
        /*if(view.getId()==R.id.btnExplicit){
            Intent i=new Intent(this,SecondActivity.class);
            i.putExtra("Value1", "Android");
            i.putExtra("Value2", "SYCS ");
            startActivity(i);
        }*/
    }

}

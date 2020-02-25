package com.example.prac5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edName,edEmail,edPass;
    Button btnSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edName = findViewById(R.id.edName);
        edEmail = findViewById(R.id.edEmail);
        edPass = findViewById(R.id.edPass);
        btnSub = findViewById(R.id.btnSub);

        btnSub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(edName.getText().toString().isEmpty() && edEmail.getText().toString().isEmpty() && edPass.getText().toString().isEmpty()
                                ){
                            Toast.makeText(getApplicationContext(),"Please fill empty fields",Toast.LENGTH_SHORT).show();
                        } else if(!(edEmail.getText().toString().contains("@"))){
                            Toast.makeText(getApplicationContext(),"Please enter valid Email",Toast.LENGTH_SHORT).show();
                        } else if(edPass.getText().toString().length() < 8){
                            Toast.makeText(getApplicationContext(),"Password should be at least 8 characters",Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(getApplicationContext(),"Successfully submitted",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );

    }
}

package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText name;
public static final String Extraname="com.example.multiscreen.Extraname";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void openactivity(View v){
            Intent intent=new Intent(this,MainActivity2.class);
            name=findViewById(R.id.name);
            String nametext=name.getText().toString();
            intent.putExtra(Extraname,nametext);

  startActivity(intent);

            
            
            
        }
    }

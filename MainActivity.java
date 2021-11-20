package com.example.multiplicationtables;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
//import android.telecom.TelecomManager;
//import android.text.Layout;
//import android.view.View;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;
//import android.widget.Toast;
//
//import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
SeekBar sk1;
TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sk1 = (SeekBar) findViewById(R.id.sk1);
        text = (TextView) findViewById(R.id.text);
        ListView tables = findViewById(R.id.tables);
sk1.setProgress(0);


            ArrayList<String> table0start = new ArrayList<>();

            table0start.add("0");
            table0start.add("0");
            table0start.add("0");
            table0start.add("0");
            table0start.add("0");
            table0start.add("0");
            table0start.add("0");
            table0start.add("0");
            table0start.add("0");
            table0start.add("0");

            ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(sk1.getContext(), android.R.layout.simple_dropdown_item_1line,table0start);
            tables.setAdapter(arrayAdapter2);



        sk1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int a = 0;


            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                a = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {// String s=a.toString();
                text.setText(String.valueOf(a));
                if(a==0){

                    ArrayList<String> table0 = new ArrayList<>();

                    table0.add("0");
                    table0.add("0");
                    table0.add("0");
                    table0.add("0");
                    table0.add("0");
                    table0.add("0");
                    table0.add("0");
                    table0.add("0");
                    table0.add("0");
                    table0.add("0");

                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(sk1.getContext(), android.R.layout.simple_dropdown_item_1line,table0);
                    tables.setAdapter(arrayAdapter);

                }
             else   if(a==1){
                    ArrayList<String> table1 = new ArrayList<>();
                    table1.add("1");
                    table1.add("2");
                    table1.add("3");
                    table1.add("4");
                    table1.add("5");
                    table1.add("6");
                    table1.add("7");
                    table1.add("8");
                    table1.add("9");
                    table1.add("10");




                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(sk1.getContext(), android.R.layout.simple_dropdown_item_1line,table1);
                    tables.setAdapter(arrayAdapter);

                }
                else if (a == 2){

                    ArrayList<String> table2 = new ArrayList<>();
                    table2.add("2");
                    table2.add("4");
                    table2.add("6");
                    table2.add("8");
                    table2.add("10");
                    table2.add("12");
                    table2.add("14");
                    table2.add("16");
                    table2.add("18");
                    table2.add("20");

                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(sk1.getContext(), android.R.layout.simple_dropdown_item_1line,table2);
                    tables.setAdapter(arrayAdapter);
                }
else if(a==3){
                    ArrayList<String> table3 = new ArrayList<>();
                    table3.add("3");
                    table3.add("6");
                    table3.add("9");
                    table3.add("12");
                    table3.add("15");
                    table3.add("18");
                    table3.add("21");
                    table3.add("24");
                    table3.add("27");
                    table3.add("30");

                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(sk1.getContext(), android.R.layout.simple_dropdown_item_1line,table3);
                    tables.setAdapter(arrayAdapter);
                }

            else if(a==4){
                    ArrayList<String> table4 = new ArrayList<>();
                   table4.add("4");
                    table4.add("8");
                    table4.add("12");
                    table4.add("16");
                    table4.add("20");
                    table4.add("24");
                    table4.add("28");
                    table4.add("32");
                    table4.add("36");
                    table4.add("40");

                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(sk1.getContext(), android.R.layout.simple_dropdown_item_1line,table4);
                    tables.setAdapter(arrayAdapter);
                }
       else if(a==5){
                    ArrayList<String> table5 = new ArrayList<>();
                  table5.add("5");
                    table5.add("10");
                    table5.add("15");
                    table5.add("20");
                    table5.add("25");
                    table5.add("30");
                    table5.add("35");
                    table5.add("40");
                    table5.add("45");
                    table5.add("50");
                      ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(sk1.getContext(), android.R.layout.simple_dropdown_item_1line,table5);
                    tables.setAdapter(arrayAdapter);
                 }
            }

        });




    }
}
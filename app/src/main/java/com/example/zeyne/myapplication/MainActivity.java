package com.example.zeyne.myapplication;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.regex.Matcher;

public class MainActivity extends AppCompatActivity {

    CheckBox c1,c2,c3,c4;
    String[] menu = new String[]{"Ucuzdan Pahalıya","Pahalıdan Ucuza"};
    int kordinaty = 0;
    int x = 0;
    ArrayList<Integer> idler = new ArrayList<>();
    CheckBox checkBox,checkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int id;
        for (int i = 0; i < menu.length; i++){
            x=i;
            id = create();
            idler.add(id);
            checkBox = (CheckBox) findViewById(id);
        }
        checkBox = (CheckBox)findViewById(idler.get(0));
        checkBox2 = (CheckBox)findViewById(idler.get(1));




    }
    int create(){

        CheckBox myButton = new CheckBox(this);
        final RelativeLayout ll = (RelativeLayout)findViewById(R.id.relativeLayout);  // butonun eklenecegi layout tanimlandi
        myButton.setId(x);   // butona id atandi
        myButton.setX(300);  // butona x koordinati verildi
        myButton.setY(kordinaty);  // butona y koordinati verildi
        myButton.setWidth(400);
        myButton.setText(menu[x]);
        myButton.setId(x);
        final int id=myButton.getId();
        ActionBar.LayoutParams lp = new ActionBar.LayoutParams(150,80);
        ll.addView(myButton, lp);
      //  myButton = ((CheckBox) findViewById(id));
        myButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {  // butonun click olayi
                Toast.makeText(view.getContext(),
                        "Button a tiklandi  "+ id, Toast.LENGTH_SHORT)
                        .show();
            }
        });

        kordinaty += 100;
        return id;
    }
}

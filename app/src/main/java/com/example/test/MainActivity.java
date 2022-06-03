package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.actvt_main_add_btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b.getText()=="remove"){
                    remove();
                    b.setText("show");}
                else{
                add();
                b.setText("remove");}
            }
        });
    }

    @SuppressLint("NonConstantResourceId")
    /*public void operation(View view) {
        switch (view.getId()) {
            case R.id.actvt_main_add_btn:
                add();
                b.setVisibility(View.INVISIBLE);
                break;
            case R.id.actcvt_main_remove_btn:
                remove();
                b.setVisibility(View.VISIBLE);
                break;
        }*/


    void add() {

        MyFragment myFragment = new MyFragment();
        getSupportFragmentManager().beginTransaction()
        .add(R.id.actvt_main_frame_layout,myFragment).commit();
    }



    void remove() {
        Fragment f = getSupportFragmentManager().findFragmentById(R.id.actvt_main_frame_layout);
        if (f != null) {
            getSupportFragmentManager().beginTransaction().remove(f).commit();


        }


    }
}












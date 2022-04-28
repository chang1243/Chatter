package com.example.chatter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.chatter.Fragments.fragmentCalls;
import com.example.chatter.Fragments.fragmentChats;
import com.example.chatter.Fragments.fragmentStatus;

public class MainActivity extends AppCompatActivity {
    Button btncall,btnstatus,btnchats;
    ImageView menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btncall = findViewById(R.id.btnCalls);
        btnchats = findViewById(R.id.btnChats);
        btnstatus = findViewById(R.id.btnStatus);




        btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentCalls fragmentcall = new fragmentCalls();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.flFramelayout,fragmentcall);
                transaction.commit();

            }
        });
        btnstatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentStatus fragmentStatus = new fragmentStatus();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.flFramelayout,fragmentStatus);
                transaction.commit();

            }
        });
        btnchats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentChats fragmentchats = new fragmentChats();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.flFramelayout,fragmentchats);
                transaction.commit();

            }
        });




    }
}
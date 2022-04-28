package com.example.chatter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Thread T = new Thread(){

            public void run() {
                try{
                    sleep(2000);

                }

                catch(Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent I = new Intent(SplashActivity.this , MainActivity.class);
                    startActivity(I);

                }


            }
        };T.start();
    }
}
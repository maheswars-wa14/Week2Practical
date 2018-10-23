package com.example.taruc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MYOWN", "Hello my own tag");
        Log.w("WARNINGFROMMAIN", "Hello, this is my warning");
        Log.e("WAITWHAT","This isn't supposed to happen");
        Log.i("FOODFORTHOUGHTS", "This is a very useful information");
    }
}

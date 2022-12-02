package com.nivesh.production.librarytesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nivesh.production.mytoastlibrary.Util;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Util.Companion.msg(MainActivity.this,"Hello");
    }
}
package com.nivesh.production.librarytesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.nivesh.production.testlibtwo.MainActivityLib;

//import com.nivesh.production.mytoastlibrary.Util;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_hello).setOnClickListener(view -> startActivity(new Intent(MainActivity.this, MainActivityLib.class)));

    }
}
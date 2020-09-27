package com.example.myfragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("msg","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("msg","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("msg","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("msg","onDestroy");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("msg","onSaveInstanceState");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("msg","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("msg","onResume");
    }

    @Override
    public void onAttachFragment(@NonNull Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.i("msg","onAttachFragment");
    }
}
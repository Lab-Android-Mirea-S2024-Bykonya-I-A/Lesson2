package com.mirea.bykonyaia.rumireabykonyalesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("MainActivity", "onCreate");
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity", "onStart");
    }
    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState) {
        super.onRestoreInstanceState(saveInstanceState);
        Log.i("MainActivity", "onRestoreInstanceState");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity", "onRestart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity", "onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity", "onPause");
    }
    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState) {
        super.onSaveInstanceState(saveInstanceState);
        Log.i("MainActivity", "onSaveInstanceState");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", "onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity", "onDestroy");
    }
}
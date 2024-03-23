package com.mirea.bykonyaia.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void OnClickToButton(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", ((EditText)findViewById(R.id.editTextText)).getText().toString());
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity", "onStart");
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
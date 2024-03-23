package com.mirea.bykonyaia.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickNewMessageNotification(View v)
    {
        final String text = ((EditText)findViewById(R.id.editTextText2)).getText().toString();
        Toast toast = Toast.makeText(getApplicationContext(),
            "СТУДЕНТ № 5 ГРУППА 9 Количество символов - ".concat(String.valueOf(text.length()))
            , Toast.LENGTH_LONG);
        toast.show();
    }
}
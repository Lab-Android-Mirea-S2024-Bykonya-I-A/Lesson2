package com.mirea.bykonyaia.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onShowSnackbarView(View v) {
        Snackbar.make(findViewById(R.id.content_view), "This is main activity", Snackbar.LENGTH_LONG)
        .setAction("CLOSE", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Test", "Snackbar closed");
            }
        }).show();
    }
    public void onClickShowDialog(View v) {
        new AlertDialogFragment().show(getSupportFragmentManager(), "mirea");
    }
    public void onShowTimePickerClicked(View v) {
        new MyTimeDialogFragment(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        //Log.i("Test", String.valueOf(timePicker.getDrawingTime()));
                    }
                }).show();//DialogFragment(this).show();
    }
    public void onShowDatePickerClicked(View v) {
        new MyDateDialogFragment(this).show();
    }
    public void onShowProgressClicked(View v) {
        new MyProgressDialogFragment(this).show();
    }

    // ============================================================
    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }
    // ============================================================
}
package com.mirea.bykonyaia.dialog;

import android.app.TimePickerDialog;
import android.content.Context;

public class MyTimeDialogFragment extends TimePickerDialog {
    public MyTimeDialogFragment(Context context, OnTimeSetListener listener) {
        super(context, listener, 0, 0, true);
    }
}

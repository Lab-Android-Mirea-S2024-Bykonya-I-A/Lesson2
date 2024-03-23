package com.mirea.bykonyaia.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

import org.jetbrains.annotations.NotNull;

public class AlertDialogFragment extends DialogFragment {
    @NotNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
        .setTitle("Здравствуй МИРЭА!")
        .setMessage("Успех близок?")
        .setIcon(R.mipmap.ic_launcher_round)
        .setPositiveButton("Иду дальше",
            new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {
                    ((MainActivity)getActivity()).onOkClicked();
                    dialog.cancel();
                }
            }
        ).setNeutralButton("На паузе",
            new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {
                    ((MainActivity)getActivity()).onNeutralClicked();
                    dialog.cancel();
                }
            }
        ).setNegativeButton("Нет",
            new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {
                    ((MainActivity)getActivity()).onCancelClicked();
                    dialog.cancel();
                }
        }).create();
    }
}

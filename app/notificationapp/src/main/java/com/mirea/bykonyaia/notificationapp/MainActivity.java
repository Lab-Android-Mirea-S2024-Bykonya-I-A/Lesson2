package com.mirea.bykonyaia.notificationapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.IconCompat;

import android.Manifest;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TEST_CHANNEL_ID = "com.mirea.asd.notification.ANDROID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED) {
            Log.d(MainActivity.class.getSimpleName().toString(), "Разрешения получены");
        } else {
            Log.d(MainActivity.class.getSimpleName().toString(), "Нет разрешений!");
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.POST_NOTIFICATIONS}, 200);
        }
    }
    public void OnSendNotificationMessage(View v) {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED)
            return;

        Notification notification = new NotificationCompat.Builder(this, TEST_CHANNEL_ID)
                .setContentText("Congratulation!")
                .setSmallIcon(com.google.android.material.R.drawable.mtrl_checkbox_button_icon)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setStyle(new NotificationCompat.BigTextStyle()
                .bigText("Much longer text that cannot fit one line..."))
                .setContentTitle("Mirea").build();


        NotificationChannel channel = new NotificationChannel(TEST_CHANNEL_ID, "Student FIO Notification", NotificationManager.IMPORTANCE_DEFAULT);
        channel.setDescription("MIREA Channel");

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        notificationManager.createNotificationChannel(channel);
        notificationManager.notify(1, notification);

//        int importance = NotificationManager.IMPORTANCE_DEFAULT;
//        NotificationChannel channel = new NotificationChannel(TEST_CHANNEL_ID, "Student FIO Notification", importance);
//        channel.setDescription("MIREA Channel");
//        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
//        notificationManager.createNotificationChannel(channel);
//        notificationManager.notify(1, builder.build());
    }
}
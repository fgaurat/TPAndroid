package com.dmr.mybroadcastreceiver;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.widget.Toast;

/**
 * Created by fgaurat on 15/04/15.
 */
public class MySMSReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        //Toast.makeText(context,"SMS_RECEIVED",Toast.LENGTH_SHORT).show();

        PackageManager p = context.getPackageManager();
        Intent i = p.getLaunchIntentForPackage("com.dmr.mynotification");

        //Intent i = new Intent(MainActivity.this,MainActivity.class);
        //Intent i = new Intent(Settings.ACTION_WIFI_SETTINGS);


        PendingIntent pending = PendingIntent.getActivity(context,1,i,0);

        NotificationManager notificationManager =(NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);

        Notification.Builder builder = new Notification.Builder(context).
                setWhen(System.currentTimeMillis()).
                setSmallIcon(R.mipmap.ic_launcher).
                setTicker("Un notification").
                setContentTitle("ContentTitle").setContentText("ContentText").
                setContentIntent(pending);

        notificationManager.notify(2,builder.build());

    }
}

package com.dmr.mynotification;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {


    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PackageManager p = getPackageManager();
                //Intent i = p.getLaunchIntentForPackage("com.dmr.mynotification");

                //Intent i = new Intent(MainActivity.this,MainActivity.class);
                Intent i = new Intent(Settings.ACTION_WIFI_SETTINGS);


                PendingIntent pending = PendingIntent.getActivity(MainActivity.this,1,i,0);

                NotificationManager notificationManager =(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);

                Notification.Builder builder = new Notification.Builder(MainActivity.this).
                                                    setWhen(System.currentTimeMillis()).
                                                    setSmallIcon(R.mipmap.ic_launcher).
                                                    setTicker("Un notification").
                                                    setContentTitle("ContentTitle").setContentText("ContentText").
                                                    setContentIntent(pending);

                notificationManager.notify(2,builder.build());

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

package com.dmr.myservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class MyService extends Service {

    private IBinder myBinder = new ActivityBinder();



    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return myBinder;
    }



    public int add(int a, int b){
        return (a+b);

    }


    public class ActivityBinder extends Binder{
        public MyService getMyService(){
            return MyService.this;
        }
    }
}

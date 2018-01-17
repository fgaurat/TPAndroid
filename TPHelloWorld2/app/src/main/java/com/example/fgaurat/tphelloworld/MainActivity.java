package com.example.fgaurat.tphelloworld;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate");

        Button openActivity;
        openActivity = findViewById(R.id.openActivity);
        openActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent);
            }
        });

        Button openActivity3 = findViewById(R.id.openActivity3);
        Button openActivity4 = findViewById(R.id.openActivity4);
        openActivity3.setOnClickListener(this);
        openActivity4.setOnClickListener(this);

    }

    public void goToActivity2(View v){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onStop() {
        super.onStart();
        Log.i(TAG,"onStop");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.openActivity3:
                doClickButton3();
                break;
            case R.id.openActivity4:
                doClickButton4();
                break;

        }

    }

    private void doClickButton3(){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);

    }

    private void doClickButton4(){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);

    }

}

package com.dmr.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity{

    private String TAG = this.getClass().getSimpleName();
    Button btnNext;
    Button btnGetResult;
    EditText edtName;
    EditText edtFirstname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"onCreate");

        setContentView(R.layout.activity_main);

        btnNext = (Button)findViewById(R.id.btnNext);
        btnGetResult= (Button)findViewById(R.id.btnGetResult);

        edtName = (EditText)findViewById(R.id.edtName);
        edtFirstname = (EditText)findViewById(R.id.edtFirstname);
        btnNext.setOnClickListener(getBtnNextClickListener());
        btnGetResult.setOnClickListener(getBtnGetResultClickListener());


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.i(TAG,"onActivityResult requestCode : "+requestCode+", resultCode : "+resultCode);
    }

    private View.OnClickListener getBtnGetResultClickListener(){

        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ThirdActivity.class);
                startActivityForResult(i,Constant.RQ_CODE_1);
            }
        };

    }

    private View.OnClickListener getBtnNextClickListener(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, firstname;

                name = edtName.getText().toString();
                firstname = edtFirstname.getText().toString();



                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra(Constant.KEY_NAME,name);
                i.putExtra(Constant.KEY_FIRSTNAME,firstname);


                startActivity(i);

                Toast.makeText(MainActivity.this,name+" "+firstname,Toast.LENGTH_SHORT).show();
            }
        };
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
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

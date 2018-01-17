package com.example.fgaurat.tphelloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSend;
    private EditText txtName;
    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnSend = findViewById(R.id.btnSend);
        txtName = findViewById(R.id.txtName);


        btnSend.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        String theNameValue =txtName.getText().toString();
        Log.i(TAG,theNameValue);

        Intent i = new Intent(this,Main3Activity.class);
        i.putExtra("NAME",theNameValue);
        startActivity(i);

    }
}

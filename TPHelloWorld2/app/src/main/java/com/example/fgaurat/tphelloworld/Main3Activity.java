package com.example.fgaurat.tphelloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {


    TextView txtSayHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent i = getIntent();
        String theName = i.getStringExtra("NAME");

        txtSayHello = findViewById(R.id.txtSayHello);

        txtSayHello.setText("Bonjour "+theName);

    }
}

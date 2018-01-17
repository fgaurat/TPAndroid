package fr.dmr.tpres.tpres;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtGoodDay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtGoodDay = findViewById(R.id.txtGoodDay);

        //String strGoodDay = getResources().getString(R.string.goodDay);
        //txtGoodDay.setText(strGoodDay);

         txtGoodDay.setText(R.string.goodDay);



    }
}

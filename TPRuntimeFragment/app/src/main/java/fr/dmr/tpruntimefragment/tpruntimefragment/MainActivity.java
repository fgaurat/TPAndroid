package fr.dmr.tpruntimefragment.tpruntimefragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BlankFragment blankFragment = new BlankFragment();

        //getSupportFragmentManager().beginTransaction().add(android.R.id.content,blankFragment).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.mainContent,blankFragment).commit();



    }
}

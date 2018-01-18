package fr.dmr.tpruntimefragment.tpruntimefragment;


import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BlankFragment blankFragment = new BlankFragment();
        //getSupportFragmentManager().beginTransaction().add(android.R.id.content,blankFragment).commit();

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,blankFragment).commit();


    }

    public void clickChangeFragment(View v){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        BlankFragment2 blankFragment2 = new BlankFragment2();
        transaction.replace(R.id.fragment_container,blankFragment2);
        transaction.commit();
    }

}

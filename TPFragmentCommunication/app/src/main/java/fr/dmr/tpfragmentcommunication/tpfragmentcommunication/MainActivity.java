package fr.dmr.tpfragmentcommunication.tpfragmentcommunication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import fr.dmr.tpfragmentcommunication.tpfragmentcommunication.dummy.DummyContent;

public class MainActivity extends AppCompatActivity implements PizzaListFragment.OnListFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

        BlankFragment detailFragment = (BlankFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_detail);
        if(detailFragment !=null){
            detailFragment.setTheDetail(item);
        }


    }
}

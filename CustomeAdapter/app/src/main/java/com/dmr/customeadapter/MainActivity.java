package com.dmr.customeadapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private ArrayList<Fruit> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Fruit> fruits = getFruits();
        FruitAdapter fruitAdapter = new FruitAdapter(this, R.layout.fruit_item, fruits);

        ListView list = (ListView)findViewById(R.id.listView);
        list.setAdapter(fruitAdapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit f = (Fruit)parent.getItemAtPosition(position);

                Toast.makeText(MainActivity.this,f.getNom()+" "+f.getVariete(),Toast.LENGTH_SHORT).show();
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

    public ArrayList<Fruit> getFruits() {

        ArrayList<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(new Fruit("Pomme","Golden"));
        fruits.add(new Fruit("Pomme","Pink Lady"));
        fruits.add(new Fruit("Pomme","Gala"));
        fruits.add(new Fruit("Poire","William"));
        fruits.add(new Fruit("Pomme","Golden"));
        fruits.add(new Fruit("Pomme","Pink Lady"));
        fruits.add(new Fruit("Pomme","Gala"));
        fruits.add(new Fruit("Poire","William"));
        fruits.add(new Fruit("Pomme","Golden"));
        fruits.add(new Fruit("Pomme","Pink Lady"));
        fruits.add(new Fruit("Pomme","Gala"));
        fruits.add(new Fruit("Poire","William"));
        fruits.add(new Fruit("Pomme","Golden"));
        fruits.add(new Fruit("Pomme","Pink Lady"));
        fruits.add(new Fruit("Pomme","Gala"));
        fruits.add(new Fruit("Poire","William"));
        fruits.add(new Fruit("Pomme","Golden"));
        fruits.add(new Fruit("Pomme","Pink Lady"));
        fruits.add(new Fruit("Pomme","Gala"));
        fruits.add(new Fruit("Poire","William"));
        fruits.add(new Fruit("Pomme","Golden"));
        fruits.add(new Fruit("Pomme","Pink Lady"));
        fruits.add(new Fruit("Pomme","Gala"));
        fruits.add(new Fruit("Poire","William"));

        return fruits;
    }
}

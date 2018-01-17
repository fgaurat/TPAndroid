package com.dmr.mysqliteapp;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Customer c1 = new Customer("DUPONT","Robert");
        Customer c2 = new Customer("DURAND","Jean");
        Customer c3 = new Customer("MARTIN","Louis");

        



        CustomerDAO customerDAO = new CustomerDAO(this);
        customerDAO.openForWrite();
        customerDAO.insertCustomer(c1);
        customerDAO.insertCustomer(c2);
        customerDAO.insertCustomer(c3);

        ArrayList<Customer> chapterList =customerDAO.getAllCustomers();
        customerDAO.close();


        ArrayAdapter<Customer> adapter = new ArrayAdapter<Customer>(this,android.R.layout.simple_list_item_1, chapterList);
        setListAdapter(adapter);
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

package com.dmr.mysqliteapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by fgaurat on 16/04/15.
 */
public class CustomerDAO {

    private static final int VERSION = 1;
    private static final String NOM_BDD = "customer.db";

    private static final String TABLE_CUST = "customers";
    private static final String COL_ID = "ID";
    private static final String COL_NOM = "NOM";
    private static final String COL_PRENOM = "PRENOM";
    private static final int NUM_COL_ID = 0;
    private static final int NUM_COL_NOM = 1;
    private static final int NUM_COL_PRENOM = 2;

    SQLiteDatabase bdd;
    CustomerBDD customers;



    public CustomerDAO(Context context){
        customers = new CustomerBDD(context, NOM_BDD, null, VERSION);

    }

    public void openForWrite() {
        bdd = customers.getWritableDatabase();
    }

    public void openForRead() {
        bdd = customers.getReadableDatabase();
    }

    public void close() {
        bdd.close();
    }

    public SQLiteDatabase getBdd() {
        return bdd;
    }

    public long insertCustomer(Customer customer) {
        ContentValues content = new ContentValues();
        content.put(COL_NOM, customer.getNom());
        content.put(COL_PRENOM, customer.getPrenom());
        return bdd.insert(TABLE_CUST, null, content);
    }

    public int updateCustomer(int id, Customer customer) {
        ContentValues content = new ContentValues();
        content.put(COL_NOM, customer.getNom());
        content.put(COL_PRENOM, customer.getPrenom());
        return bdd.update(TABLE_CUST, content, COL_ID + " =" + id, null);
    }

    public int removeCustomer(int id) {
        return bdd.delete(TABLE_CUST, COL_ID + " = " +id, null);
    }

    public Customer getCustomer(String name) {
        Cursor c = bdd.query(TABLE_CUST, new String[] {COL_ID, COL_NOM,COL_PRENOM}, COL_NOM + " LIKE \"" + name + "\"",null, null, null, COL_NOM);

        return cursorToCustomer(c);
    }

    public Customer cursorToCustomer(Cursor c) {
        if (c.getCount() == 0) {
            c.close();
            return null;
        }
        Customer customer = new Customer();
        customer.setId(c.getInt(NUM_COL_ID));
        customer.setNom(c.getString(NUM_COL_NOM));
        customer.setPrenom(c.getString(NUM_COL_PRENOM));
        c.close();
        return customer;
    }

    public ArrayList<Customer> getAllCustomers() {
        Cursor c = bdd.query(TABLE_CUST, new String[] {
                COL_ID, COL_NOM,COL_PRENOM}, null, null, null, null, COL_NOM);
        if (c.getCount() == 0) {
            c.close();
            return null;
        }
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        while (c.moveToNext()) {
            Customer customer = new Customer();
            customer.setId(c.getInt(NUM_COL_ID));
            customer.setNom(c.getString(NUM_COL_NOM));
            customer.setPrenom(c.getString(NUM_COL_PRENOM));
            customerList.add(customer);
        }
        c.close();
        return customerList;
    }
}

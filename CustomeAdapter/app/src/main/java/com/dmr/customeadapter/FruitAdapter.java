package com.dmr.customeadapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by fgaurat on 14/04/15.
 */
public class FruitAdapter extends ArrayAdapter<Fruit>{

    private List<Fruit> fruits;
    private Context context;
    private int resource;

    private final String TAG = this.getClass().getSimpleName();


    public FruitAdapter(Context context, int resource, List<Fruit> fruits) {
        super(context, resource, fruits);

        this.context = context;
        this.resource = resource;
        this.fruits = fruits;

    }


    @Override
    public int getCount() {
        return fruits.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Fruit f = fruits.get(position);

        LayoutInflater layoutInflater =
                                (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        Log.i(TAG, position + " " + f.getNom()+" "+(convertView==null?"null":convertView));



        convertView = layoutInflater.inflate(resource,parent,false);
        TextView nom =(TextView)convertView.findViewById(R.id.nom);
        TextView variete =(TextView)convertView.findViewById(R.id.variete);


        nom.setText(position+" "+f.getNom());
        variete.setText(f.getVariete());

        return convertView;
    }
}

















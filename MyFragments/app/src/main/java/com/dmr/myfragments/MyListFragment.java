package com.dmr.myfragments;


import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyListFragment extends ListFragment{

    private String[] items = {"Item 1","Item 2","Item 3","Item 4","Item 5","Item 6","Item 7","Item 7","Item 7","Item 7","Item 7","Item 7"};

    public MyListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_list, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(getActivity(), android.R.layout.simple_expandable_list_item_1,items);


        setListAdapter(itemsAdapter);

    }


    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String item = getListAdapter().getItem(position).toString();
        DetailFragment detailFragment = (DetailFragment)getFragmentManager().findFragmentById(R.id.fragment2);


        if(detailFragment!=null && detailFragment.isInLayout()){
            detailFragment.setText(item);

        }
        else{
            Intent i = new Intent(getActivity(),DetailActivity.class);
            i.putExtra("textFromList",item);
            startActivity(i);
        }
    }
}

package com.example.android.cincytourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {



    public ParksFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create an ArrayList of Attraction objects
        final ArrayList<Attraction> parkAttractions = new ArrayList<>();
        parkAttractions.add(new Attraction(getString(R.string.eden_park_name), getString(R.string.eden_park_desc), R.drawable.eden_park));
        parkAttractions.add(new Attraction(getString(R.string.ault_park_name), getString(R.string.ault_park_desc), R.drawable.ault_park));
        parkAttractions.add(new Attraction(getString(R.string.mt_echo_name), getString(R.string.mt_echo_desc), R.drawable.mt_echo_park));
        parkAttractions.add(new Attraction(getString(R.string.devou_park_name), getString(R.string.devou_park_desc), R.drawable.devou_park));
        parkAttractions.add(new Attraction(getString(R.string.smale_riverfront_name), getString(R.string.smale_riverfront_desc), R.drawable.smale_riverfront_park));
        parkAttractions.add(new Attraction(getString(R.string.friendship_park_name), getString(R.string.friendship_park_desc), R.drawable.tm_berry_friendship_park));
        parkAttractions.add(new Attraction(getString(R.string.washington_park_name), getString(R.string.washington_park_desc), R.drawable.washington_park));


        //Create a {@link AttractionAdapter}, whose data source is a list of
        //{@Link Attraction}s. The adapter knows how to cerate list item views for each item
        //in the list.
        AttractionAdapter parkAttractionAdaper = new AttractionAdapter(getActivity(), parkAttractions, R.color.white);

        // Get a refernce to the ListView and attach the adapter to the ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(parkAttractionAdaper);

        return rootView;
    }

}

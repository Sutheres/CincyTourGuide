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
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create an ArrayList of Attraction objects
        final ArrayList<Attraction> festsAttractions = new ArrayList<>();
        festsAttractions.add(new Attraction(getString(R.string.cincy_museum_name), getString(R.string.cincy_museum_desc), R.drawable.cincinnati_museum_center));
        festsAttractions.add(new Attraction(getString(R.string.cincy_art_museum_name), getString(R.string.cincy_art_museum_desc), R.drawable.cincinnati_art_museum));
        festsAttractions.add(new Attraction(getString(R.string.underground_railroad_name), getString(R.string.underground_railroad_desc), R.drawable.underground_railroad_center));
        festsAttractions.add(new Attraction(getString(R.string.sign_museum_name), getString(R.string.sign_museum_desc), R.drawable.american_sign_museum));
        festsAttractions.add(new Attraction(getString(R.string.taft_art_museum_name), getString(R.string.taft_art_museum_desc), R.drawable.taft_art_museum));



        //Create a {@link AttractionAdapter}, whose data source is a list of
        //{@Link Attraction}s. The adapter knows how to create list item views for each item
        //in the list.
        AttractionAdapter parkAttractionAdaper = new AttractionAdapter(getActivity(), festsAttractions, R.color.white);

        // Get a refernce to the ListView and attach the adapter to the ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(parkAttractionAdaper);

        return rootView;
    }

}

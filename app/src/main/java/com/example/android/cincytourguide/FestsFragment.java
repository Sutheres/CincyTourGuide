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
public class FestsFragment extends Fragment {


    public FestsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create an ArrayList of Attraction objects
        final ArrayList<Attraction> festsAttractions = new ArrayList<>();
        festsAttractions.add(new Attraction(getString(R.string.cincy_music_fest_name), getString(R.string.cincy_music_fest_desc), R.drawable.cincinnati_music_festival));
        festsAttractions.add(new Attraction(getString(R.string.opening_day_parade_name), getString(R.string.opening_day_parade_desc), R.drawable.reds_opening_day_parade));
        festsAttractions.add(new Attraction(getString(R.string.flying_pig_name), getString(R.string.flying_pig_desc), R.drawable.flying_pig_marathon));
        festsAttractions.add(new Attraction(getString(R.string.oktoberfest_name), getString(R.string.oktoberfest_desc), R.drawable.oktoberfest_zinzinnati));
        festsAttractions.add(new Attraction(getString(R.string.riverfest_name), getString(R.string.riverfest_desc), R.drawable.riverfest_webn_fireworks));
        festsAttractions.add(new Attraction(getString(R.string.fest_of_lights_name), getString(R.string.fest_of_lights_desc), R.drawable.festival_of_lights));


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

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
public class SportsFragment extends Fragment {


    public SportsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create an ArrayList of Attraction objects
        final ArrayList<Attraction> sportsAttractions = new ArrayList<>();
        sportsAttractions.add(new Attraction(getString(R.string.bengals_name), getString(R.string.bengals_desc), R.drawable.paul_brown_stadium));
        sportsAttractions.add(new Attraction(getString(R.string.reds_name), getString(R.string.reds_desc), R.drawable.great_american_ballpark));
        sportsAttractions.add(new Attraction(getString(R.string.bearcats_name), getString(R.string.bearcats_desc), R.drawable.fifth_third_arena));
        sportsAttractions.add(new Attraction(getString(R.string.musketeers_name), getString(R.string.musketeers_desc), R.drawable.cintas_center));
        sportsAttractions.add(new Attraction(getString(R.string.fc_cincy_name), getString(R.string.fc_cincy_desc), R.drawable.fc_cincinnati));


        //Create a {@link AttractionAdapter}, whose data source is a list of
        //{@Link Attraction}s. The adapter knows how to create list item views for each item
        //in the list.
        AttractionAdapter parkAttractionAdaper = new AttractionAdapter(getActivity(), sportsAttractions, R.color.white);

        // Get a refernce to the ListView and attach the adapter to the ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(parkAttractionAdaper);

        return rootView;
    }

}

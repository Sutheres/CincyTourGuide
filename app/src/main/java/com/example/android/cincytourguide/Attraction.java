package com.example.android.cincytourguide;

/**
 * Created by suthe_000 on 12/3/2016.
 */

public class Attraction {
    //Holds Title
    private String mTitle;
    //Holds Small Attraction Description
    private String mDescription;
    //Holds image resource ID
    private int mImageResourceID;


    /*   Constructor     */
    public Attraction(String title, String description, int image) {
        mTitle = title;
        mDescription = description;
        mImageResourceID = image;
    }

    /*     Methods      */

    //Gets name of attraction
    public String getTitle() {return mTitle;}

    //Gets attraction description
    public String getDescription() {return mDescription;}

    //Gets image of attraction
    public int getImageResourceID() {return mImageResourceID;}
}

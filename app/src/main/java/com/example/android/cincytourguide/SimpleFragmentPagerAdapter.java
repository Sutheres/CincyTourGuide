package com.example.android.cincytourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by suthe_000 on 12/6/2016.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private String mTabTitles[] = new String[4];




    public SimpleFragmentPagerAdapter(FragmentManager fm, String[] tabTitles) {
        super(fm);
        mTabTitles = tabTitles;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ParksFragment();
        } else if (position == 1){
            return new SportsFragment();
        } else if (position == 2){
            return new MuseumsFragment();
        } else {
            return new FestsFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitles[position];
    }
}


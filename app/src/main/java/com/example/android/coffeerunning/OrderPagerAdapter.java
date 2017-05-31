package com.example.android.coffeerunning;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Glen on 30/05/2017.
 */

public class OrderPagerAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    public OrderPagerAdapter(Context context, FragmentManager fm)  {
        super(fm);
        mContext = context;

    }

    @Override
    public Fragment getItem (int position){
        if (position == 0) {
            return new CoffeeFragment();
        } else if (position == 1) {
            return new TeaFragment();
        } else {
            return new IcedDrinksFragment();
        }
    }

    @Override
    public int getCount () {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position){
        if (position == 0) {
            return "COFFEE";
        } else if (position == 1) {
            return "TEA";
        } else {
            return "SMOOTHIES AND SLUSH";
        }
    }
}
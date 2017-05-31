package com.example.android.coffeerunning;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */

public class OrderFragment extends Fragment {

    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;

   /* Drawables to be added next to each tab title
    private int[] tabIcons = {
            R.drawable.ic_settings,
            R.drawable.ic_settings,
            R.drawable.ic_settings };*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {


        View result = inflater.inflate(R.layout.fragment_order, container, false);
        final ViewPager viewpager = (ViewPager) result.findViewById(R.id.viewpager);

        viewpager.setAdapter(buildAdapter());

        TabLayout tabLayout = (TabLayout) result.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewpager);

        /*To add icons next to each tab title
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);*/

        viewpager.setCurrentItem(0);


        final ImageView imageView = (ImageView) result.findViewById(R.id.toolbarBackground);
        imageView.setBackgroundResource(R.color.colorFour);


        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewpager) {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewpager.setCurrentItem(tab.getPosition());

                if (tab.getPosition() == 0) {
                    imageView.setBackgroundResource(R.color.colorFour);
                    return;
                } else if (tab.getPosition() == 1) {
                    imageView.setBackgroundResource(R.color.colorTwo);
                    return;
                } else {
                    imageView.setBackgroundResource(R.color.colorFive);
                    return;
                }
            }
        });

        return (result);
    }

    private PagerAdapter buildAdapter() {
        return (new OrderPagerAdapter(getActivity(), getChildFragmentManager()));
    }
}


//*switch (tab.getPosition()) {
//case 0:
//      imageView.setBackgroundResource(R.drawable.coffeeone);
//    break;
//  case 1:
//imageView.setBackgroundResource(R.drawable.coffeetwo);
//}
//}
//});//




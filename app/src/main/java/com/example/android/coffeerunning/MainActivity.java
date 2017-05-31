package com.example.android.coffeerunning;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FragmentManager fragmentManager = getSupportFragmentManager();

        final Fragment fragment1 = new OrderFragment();
        final Fragment fragment2 = new FavouriteFragment();
        final Fragment fragment3 = new FeatureFragment();
        final Fragment fragment4 = new SettingsFragment();
        final Fragment fragment5 = new ProfileFragment();



        final BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        bottomNavigationView.getMenu().getItem(2).setChecked(true);
        bottomNavigationView.setItemBackgroundResource(R.color.colorThree);
        bottomNavigationView.setBackgroundResource(R.color.colorThree);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.action_profile:
                        Toast.makeText(MainActivity.this, "PROFILE BUTTON CLICKED", Toast.LENGTH_SHORT).show();

                        //Code to change the color of the BNV and the Background behind it.
                        bottomNavigationView.setItemBackgroundResource(R.color.colorOne);
                        bottomNavigationView.setBackgroundResource(R.color.colorOne);

                        //Code to switch to the correct fragment view
                        FragmentTransaction fragmentTransaction5 = fragmentManager.beginTransaction();
                        fragmentTransaction5.replace(R.id.frame_layout, fragment5).commit();


                        return true;

                    case R.id.action_favourites:
                        Toast.makeText(MainActivity.this, "FAVOURITES BUTTON CLICKED", Toast.LENGTH_SHORT).show();

                        //Code to change the color of the BNV and the Background behind it.
                        bottomNavigationView.setItemBackgroundResource(R.color.colorFive);
                        bottomNavigationView.setBackgroundResource(R.color.colorFive);

                        //Code to switch to the correct fragment view
                        FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
                        fragmentTransaction1.replace(R.id.frame_layout, fragment2).commit();

                        return true;

                    case R.id.action_order:
                        Toast.makeText(MainActivity.this, "ORDER BUTTON CLICKED", Toast.LENGTH_SHORT).show();

                        //Code to change the color of the BNV and the Background behind it.
                        bottomNavigationView.setItemBackgroundResource(R.color.colorThree);
                        bottomNavigationView.setBackgroundResource(R.color.colorThree);

                        //Code to switch to the correct fragment view
                        FragmentTransaction fragmentTransaction2 = fragmentManager.beginTransaction();
                        fragmentTransaction2.replace(R.id.frame_layout, fragment1).commit();

                        return true;

                    case R.id.action_features:
                        Toast.makeText(MainActivity.this, "FEATURES BUTTON CLICKED", Toast.LENGTH_SHORT).show();

                        //Code to change the color of the BNV and the Background behind it.
                        bottomNavigationView.setItemBackgroundResource(R.color.colorFour);
                        bottomNavigationView.setBackgroundResource(R.color.colorFour);

                        //Code to switch to the correct fragment view
                        FragmentTransaction fragmentTransaction3 = fragmentManager.beginTransaction();
                        fragmentTransaction3.replace(R.id.frame_layout, fragment3).commit();

                        return true;

                    case R.id.action_settings:
                        Toast.makeText(MainActivity.this, "SETTINGS BUTTON CLICKED", Toast.LENGTH_SHORT).show();

                        //Code to change the color of the BNV and the Background behind it.
                        bottomNavigationView.setItemBackgroundResource(R.color.colorTwo);
                        bottomNavigationView.setBackgroundResource(R.color.colorTwo);

                        //Code to switch to the correct fragment view
                        FragmentTransaction fragmentTransaction4 = fragmentManager.beginTransaction();
                        fragmentTransaction4.replace(R.id.frame_layout, fragment4).commit();

                        return true;
                }
                return true;
            }
        });
    }
}

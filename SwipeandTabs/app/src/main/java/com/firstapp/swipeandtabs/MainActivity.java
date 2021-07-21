package com.firstapp.swipeandtabs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {

    TabLayout myTab;
    ViewPager myPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTab = (TabLayout)findViewById(R.id.myTab);
        myPage = (ViewPager)findViewById(R.id.myPager);

        myPage.setAdapter(new MyOwnPagerAdapter(getSupportFragmentManager()));
        myTab.setupWithViewPager(myPage);

        myTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                myPage.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        }


    }

    class MyOwnPagerAdapter extends FragmentPagerAdapter {

        String data[] = {"Java", "Android", "IOS"};

        public MyOwnPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            if(i == 0){
                return new Java();
            }
            if(i== 1 {
                return new Android();

            }
            if(i == 2){
                return IOS();
            }
        return null;
        }

        @Override
        public int getCount() {
            return data.length;
        }

        @Nullable
        @org.jetbrains.annotations.Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return data[position];
        }
    }

}
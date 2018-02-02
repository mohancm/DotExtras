package com.dotos.dotextras;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dotos.dotextras.fragments.Lockscreen;
import com.dotos.dotextras.fragments.PowerMenu;
import com.dotos.dotextras.fragments.QuickSettings;
import com.dotos.dotextras.fragments.Recents;
import com.dotos.dotextras.fragments.Statusbar;
import com.dotos.dotextras.views.PagerSlidingTabStrip;

public class dotExtrasMain extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final View view = inflater.inflate(R.layout.dot_extras, container, false);
        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(getActivity().getFragmentManager());
        ViewPager mViewPager = view.findViewById(R.id.pagercontainer);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        PagerSlidingTabStrip mTabs = view.findViewById(R.id.tabs);
        mTabs.setViewPager(mViewPager);
        return view;
    }
    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        String titles[] = getTitles();
        private Fragment frags[] = new Fragment[titles.length];
        SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
            frags[0] = new Statusbar();
            frags[1] = new QuickSettings();
            frags[2] = new Recents();
            frags[3] = new PowerMenu();
            frags[4] = new Lockscreen();
        }

        @Override
        public Fragment getItem(int position) {
            return frags[position];
        }
        private String[] getTitles() {
            String titleString[];
            titleString = new String[]{
            getString(R.string.statusbar),
            getString(R.string.quick_settings),
            getString(R.string.recents),
            getString(R.string.power_menu),
            getString(R.string.lockscreen)};
            return titleString;
        }
        @Override
        public int getCount() {
            return frags.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }

    }
}

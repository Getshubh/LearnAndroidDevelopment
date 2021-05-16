package com.getshubh.learnandroiddevelopment.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.getshubh.learnandroiddevelopment.Component;
import com.getshubh.learnandroiddevelopment.R;

import java.util.ArrayList;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;
    ArrayList<Component> component;
    public SectionsPagerAdapter(Context context, FragmentManager fm, ArrayList<Component> component) {
        super(fm);
        mContext = context;
        this.component=component;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return PlaceholderFragment.newInstance(position + 1,component.get(position));
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return component.get(position).getShortDescription();
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return component.size();
    }
}
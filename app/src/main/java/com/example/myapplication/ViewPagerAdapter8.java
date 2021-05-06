package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter8 extends FragmentPagerAdapter  {
    private ArrayList<Fragment> fragments = new ArrayList<>( );
     private ArrayList<String> strings = new ArrayList<>( );

    ViewPagerAdapter8(FragmentManager fm) {
        super(fm);

    }

   @NonNull
   @Override
    public  Fragment getItem(int position){
        switch(position)
        {
            case 0:
                return new FragmentRecord8();
            case 1:
                return new FragmentSavedRecordings8();
            case 2:
                return new FragmentEight();
            default:
                return null;
        }
    }



    @Override
    public int getCount() {
        return fragments.size();
    }


    public void add(Fragment fr, String str) {
        fragments.add(fr);
        strings.add(str);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return strings.get(position);
    }

    public void add(FragmentSavedRecordings8 fragmentSavedRecordings8) {

    }

    public void add(FragmentRecord8 fragmentRecord8) {
    }
    public void add(FragmentEight fragmentEight) {
    }
}

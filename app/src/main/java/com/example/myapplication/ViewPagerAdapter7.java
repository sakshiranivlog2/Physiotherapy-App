package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter7 extends FragmentPagerAdapter  {
    private ArrayList<Fragment> fragments = new ArrayList<>( );
     private ArrayList<String> strings = new ArrayList<>( );

    ViewPagerAdapter7(FragmentManager fm) {
        super(fm);

    }

   @NonNull
   @Override
    public  Fragment getItem(int position){
        switch(position)
        {
            case 0:
                return new FragmentRecord7();
            case 1:
                return new FragmentSavedRecordings7();
            case 2:
                return new FragmentSeven();
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

    public void add(FragmentSavedRecordings7 fragmentSavedRecordings7) {

    }

    public void add(FragmentRecord7 fragmentRecord7) {
    }
    public void add(FragmentSeven fragmentSeven) {
    }
}

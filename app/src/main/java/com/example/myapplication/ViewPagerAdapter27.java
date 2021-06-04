package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter27 extends FragmentPagerAdapter  {
    private ArrayList<Fragment> fragments = new ArrayList<>( );
     private ArrayList<String> strings = new ArrayList<>( );

    ViewPagerAdapter27(FragmentManager fm) {
        super(fm);

    }

   @NonNull
   @Override
    public  Fragment getItem(int position){
        switch(position)
        {
            case 0:
                return new FragmentRecord27();
            case 1:
                return new FragmentFinalSavedRecordings27();

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

    public void add(FragmentRecord27 fragmentrecord27) {

    }
    public void add(FragmentFinalSavedRecordings27 fragmentFinalSavedRecordings27) {

    }

}

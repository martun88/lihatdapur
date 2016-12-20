package com.meivaldi.mejile;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by root on 21/10/16.
 */

public class FragmentAdapterClass extends FragmentStatePagerAdapter {

    int tabCount;

    public FragmentAdapterClass(FragmentManager fragmentManager, int countTab) {
        super(fragmentManager);

        this.tabCount = countTab;
    }

    @Override

    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                NewRecipesActivity newRecipesActivity= new NewRecipesActivity();
                return newRecipesActivity;

            case 1:
                FoodmarkActivity foodmarkActivity = new FoodmarkActivity();
                return foodmarkActivity;

            case 2:
                MyRecipesActivity myRecipesActivity = new MyRecipesActivity();
                return myRecipesActivity;

            default:
                return null;
        }
    }

    @Override

    public int getCount() {
        return tabCount;
    }
}

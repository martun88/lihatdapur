package com.meivaldi.mejile;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by root on 21/10/16.
 */

public class FavoritesActivity extends android.support.v4.app.Fragment {

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInstanceState) {
        return inflater.inflate(R.layout.activity_favorites, container, false);
    }
}

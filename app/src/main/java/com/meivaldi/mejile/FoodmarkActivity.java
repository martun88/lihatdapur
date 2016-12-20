package com.meivaldi.mejile;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by root on 21/10/16.
 */

public class FoodmarkActivity extends Fragment{
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInstanceState) {
        View rootView =  inflater.inflate(R.layout.activity_foodmark, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.recyclerView2);
        rv.setHasFixedSize(true);

        FoodmarkAdapter adapter = new FoodmarkAdapter(new String[] {
                "Getuk Lindrih",
                "Empek - empek",
                "Pecel Medan",
                "Nasi Gurih",
                "Ayam Kalasan",
                "Sala Bule"
        });
        rv.setAdapter(adapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        rv.setLayoutManager(gridLayoutManager);

        return rootView;
    }
}

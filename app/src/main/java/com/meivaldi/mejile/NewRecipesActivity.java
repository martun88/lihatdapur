package com.meivaldi.mejile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by root on 21/10/16.
 */

public class NewRecipesActivity extends android.support.v4.app.Fragment{

    private GridLayoutManager gManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.activity_new_recipes, container, false);
        View rootView = inflater.inflate(R.layout.activity_new_recipes, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.recyclerView1);
        rv.setHasFixedSize(true);

        MyAdapter adapter = new MyAdapter(new String[]{"Makanan Pertama", "Makanan Kedua", "Makanan Ketiga", "Makanan Keempat", "Makanan Kelima"});
        rv.setAdapter(adapter);

//        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
//        rv.setLayoutManager(llm);

        gManager = new GridLayoutManager(getActivity(), 1);
        rv.setLayoutManager(gManager);

        return rootView;
    }
}

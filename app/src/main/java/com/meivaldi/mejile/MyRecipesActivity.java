package com.meivaldi.mejile;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MyRecipesActivity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_my_recipes, container, false);

        String[] recipes = new String[] {"Lontong Malam", "Sate Padang"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.recipes_list, recipes);

        ListView listView = (ListView) view.findViewById(R.id.listMyRecipes);
        listView.setAdapter(adapter);

        Button btnAddRecipes = (Button) view.findViewById(R.id.btnAddRecipes);

        btnAddRecipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), AddRecipesActivity.class));
            }
        });

        return view;
    }
}

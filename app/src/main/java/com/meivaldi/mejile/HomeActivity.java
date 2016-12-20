package com.meivaldi.mejile;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity  {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    FragmentAdapterClass fragmentAdapter;
    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /* Seting tab layout */
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setTabTextColors(ContextCompat.getColorStateList(this, R.color.colorTabText));
        tabLayout.addTab(tabLayout.newTab().setText("New Recipes"));
        tabLayout.addTab(tabLayout.newTab().setText("Foodmark"));

        /* setting View pager ( tempat untuk slide content ) */
        viewPager = (ViewPager) findViewById(R.id.viewPager1);

        /* setting toolbar ( tempat untuk meletakkan icon search, dll ) */
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        /* Menu slide navigation drawer yang disamping */
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        /* FragmentAdapter untuk mengambil fragment fragment tab layout */
        fragmentAdapter = new FragmentAdapterClass(getSupportFragmentManager(), tabLayout.getTabCount());

        /* masukan Fragment yang sudah di collelct di fragmentAdapter ke dalam view pager

           ViewPager adalah tempat untuk meleetakkan content / fragment ke dalam aplikasi
         */
        viewPager.setAdapter(fragmentAdapter);

        /* aksi yang terjadi ketika viewPager di slide / tab layout dipilih */
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Resep Baru");
        tabLayout.getTabAt(1).setText("Foodmark");
//
//        tabLayout.getTabAt(0).setIcon(R.drawable.ic_stars_black_24dp).setText("New Recipes");
//        tabLayout.getTabAt(1).setIcon(R.drawable.ic_bookmark_border_black_24dp).setText("FoodMark");

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            public void onTabSelected(TabLayout.Tab LayoutTab) {

                viewPager.setCurrentItem(LayoutTab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab LayoutTab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab LayoutTab) {

            }
        });

    }


    // Menu icons are inflated just as they were with actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}

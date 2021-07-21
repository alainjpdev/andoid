package com.firstapp.tablauyoutejemplo;

//  https://www.youtube.com/watch?v=y-5HhvNrQA8

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.firstapp.tablauyoutejemplo.Controlador.PagerController;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem tab1, tab2, tab3;
    PagerController pagerController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);

        tab1 = findViewById(R.id.tabcontactos);
        tab2 = findViewById(R.id.tabcorreos);
        tab3 = findViewById(R.id.tabmensajes);
    }
}
package com.firstapp.ejemplorecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElement> elements;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListElement("#775447","Alain", "Mexico", "Activo"));
        elements.add(new ListElement("#607d8b","Pedro", "Nueva York", "Inactivo"));
        elements.add(new ListElement("#03a9f4","Paola", "Mexico", "Cancelado"));
        elements.add(new ListElement("#f44336","Maria", "Mexico", "Activo"));
        elements.add(new ListElement("#000000","Clo", "Mexico", "Cancelado"));
        elements.add(new ListElement("#009968","Clo", "Mexico", "Cancelado"));
        elements.add(new ListElement("#775447","Clo", "Mexico", "Cancelado"));
        elements.add(new ListElement("#775447","Clo", "Mexico", "Cancelado"));



        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);

    }

}
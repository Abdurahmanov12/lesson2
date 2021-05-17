package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {
    RecyclerView rv;
    Adapter adapter;
    ArrayList<Model> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        list.add(new Model("1", "Загаловок","Описание","17.01.21"));
        list.add(new Model("1", "Загаловок","Описание","17.01.21"));
        list.add(new Model("1", "Загаловок","Описание","17.01.21"));
        list.add(new Model("1", "Загаловок","Описание","17.01.21"));
        list.add(new Model("1", "Загаловок","Описание","17.01.21"));
        list.add(new Model("1", "Загаловок","Описание","17.01.21"));
        list.add(new Model("1", "Загаловок","Описание","17.01.21"));
        list.add(new Model("1", "Загаловок","Описание","17.01.21"));
        list.add(new Model("1", "Загаловок","Описание","17.01.21"));
        list.add(new Model("1", "Загаловок","Описание","17.01.21"));
        list.add(new Model("1", "Загаловок","Описание","17.01.21"));
        list.add(new Model("1", "Загаловок","Описание","17.01.21"));
        list.add(new Model("1", "Загаловок","Описание","17.01.21"));
        list.add(new Model("1", "Загаловок","Описание","17.01.21"));
        list.add(new Model("1", "Загаловок","Описание","17.01.21"));
        initRecycler();

    }

    private void initRecycler() {
        rv = findViewById(R.id.recycler);
        adapter = new Adapter();
        adapter.setData(list);
        rv.setAdapter(adapter);
    }
}
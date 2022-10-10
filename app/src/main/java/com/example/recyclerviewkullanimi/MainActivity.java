package com.example.recyclerviewkullanimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ArrayList<String> ulkelerList;
    private BasitRVAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true); // Daha düzenli çalışmasını sağlar.

        rv.setLayoutManager(new LinearLayoutManager(this)); // This MainActivity'i temsil eder.

        ulkelerList = new ArrayList<>();
        ulkelerList.add("Türkiye");
        ulkelerList.add("İtalya");
        ulkelerList.add("Japonya");
        ulkelerList.add("Rusya");

        adapter = new BasitRVAdapter(MainActivity.this,ulkelerList);

         rv.setAdapter(adapter);

    }
}
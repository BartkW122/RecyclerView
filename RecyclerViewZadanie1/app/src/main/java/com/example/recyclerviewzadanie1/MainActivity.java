package com.example.recyclerviewzadanie1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView countiresRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        countiresRecyclerView = findViewById(R.id.countiresRecyclerView);


        List<Country> countries = new ArrayList<>();
        countries.add(new Country("USA"));
        countries.add(new Country("POLSKA"));
        countries.add(new Country("NIEMCY"));
        countries.add(new Country("FRANCJA"));
        countries.add(new Country("CZECHY"));
        countries.add(new Country("SŁOWACJA"));
        countries.add(new Country("ROSJA"));
        countries.add(new Country("LITWA"));
        countries.add(new Country("ŁOTWA"));
        countries.add(new Country("ESTONIA"));

        CountryAdapter adapter = new CountryAdapter(countries);

        
        countiresRecyclerView.setAdapter(adapter);
        countiresRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
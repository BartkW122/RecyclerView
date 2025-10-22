package com.example.recyclerviewzadanie2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView  productsRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productsRecyclerView = findViewById(R.id.productsRecyclerView);

        List<Product> products = new ArrayList<>();

        products.add(new Product("Telefon",2.34));
        products.add(new Product("Biurko",12.34));
        products.add(new Product("Szafa",17.90));
        products.add(new Product("Kanapa",10.45));
        products.add(new Product("Monitor",25.78));
        products.add(new Product("Myszka",18.90));
        products.add(new Product("Klawiatura",15.45));
        products.add(new Product("Samochod",122.50));
        products.add(new Product("Podkladka",19.50));
        products.add(new Product("Komputer",1345.50));

        ProductAdapter adapter = new ProductAdapter(products);

        // 4. Ustaw Adapter i LayoutManager dla RecyclerView
        productsRecyclerView.setAdapter(adapter);
        productsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
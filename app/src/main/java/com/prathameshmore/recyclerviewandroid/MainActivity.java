package com.prathameshmore.recyclerviewandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        productList = new ArrayList<>();

        productList.add(
                new Product(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        R.drawable.mac,
                        "13.3 inch, Silver, 1.35 kg",
                        4.2,
                        54000
                ));

        productList.add(
                new Product(
                        2,
                        "Dell Inspiron 7000 Core i5 7th Gen - (8 GB/1 TB HDD/Windows 10 Home)",
                        R.drawable.dell,
                        "14 inch, Gray, 1.659 kg",
                        4.4,
                        60000
                ));

        productList.add(
                new Product(
                        3,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        R.drawable.surface,
                        "13.3 inch, Silver, 1.35 kg",
                        4.5,
                        70000));

        ProductAdapter productAdapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(productAdapter);

    }
}

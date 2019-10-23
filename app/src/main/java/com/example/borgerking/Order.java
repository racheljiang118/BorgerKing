package com.example.borgerking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Order extends AppCompatActivity {
    private RecyclerView recyclerView2;
    private RecyclerView.LayoutManager layoutManager2;
    public static TextView totalTextView;

    public static ArrayList<Menu> orderList = new ArrayList<>();
    public static ArrayList<Double> orderPrices = new ArrayList<>();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        totalTextView = findViewById(R.id.total);
        recyclerView2 = findViewById(R.id.rv_order);
        layoutManager2 = new LinearLayoutManager(this);
        recyclerView2.setLayoutManager(layoutManager2);
        OrderAdapter orderAdapter = new OrderAdapter();
        orderAdapter.setData(orderList);
        recyclerView2.setAdapter(orderAdapter);


    }


}

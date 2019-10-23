package com.example.borgerking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MenuDetail extends AppCompatActivity {

    private TextView nameTextView;
    private TextView costTextView;
    private TextView descTextView;
    private ImageView imageView;
    private TextView quantityTextView;
    private TextView totalCostTextView;
    private Button addItem;
    private Button add;
    private Button minus;
    //private TextView reminderTextView;

    int amount = 0;
    double cost = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_detail);

        Intent intent = getIntent();
        int foodPosition = intent.getIntExtra("foodID", -1);
        final Menu currentFood = Database.getFoodById(foodPosition);


        nameTextView = findViewById(R.id.oName);
        costTextView = findViewById(R.id.foodCost);
        descTextView = findViewById(R.id.detailDesc);
        imageView = findViewById(R.id.oImage);
        quantityTextView = findViewById(R.id.quantity);
        totalCostTextView = findViewById(R.id.totalCosts);
        addItem = findViewById(R.id.addMe);
        add = findViewById(R.id.plusOne);
        minus = findViewById(R.id.minusOne);
        //reminderTextView = findViewById(R.id.reminder);

        nameTextView.setText(currentFood.getFoodName());
        costTextView.setText(String.format("$" + "%.2f" ,currentFood.getFoodCost()));
        totalCostTextView.setText("$0.00");
        descTextView.setText(currentFood.getFoodDesc());
        imageView.setImageResource(currentFood.getImageDrawableId());
        quantityTextView.setText(String.valueOf(amount));



        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (amount > 0) {
                    amount -= 1;
                    quantityTextView.setText(String.valueOf(amount));
                    //double cost;
                    cost = currentFood.getFoodCost() * amount;
                    totalCostTextView.setText(String.format("$" + "%.2f", cost));
                    currentFood.setItemCount(amount);
                    currentFood.setTotalCost(cost);
                } else {
                    Toast.makeText(getApplicationContext(), "Please choose number of items", Toast.LENGTH_SHORT).show();
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    amount += 1;
                    quantityTextView.setText(String.valueOf(amount));

                    //double cost;
                    cost = currentFood.getFoodCost() * amount;
                    totalCostTextView.setText(String.format("$" + "%.2f", cost));
                    currentFood.setItemCount(amount);
                    currentFood.setTotalCost(cost);


            }
        });
        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (amount != 0) {
                    Order.orderList.add(currentFood);
                    Order.orderPrices.add(cost);
                    Toast.makeText(getApplicationContext(), "Item/s added", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Please choose number of items", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



}

package com.example.borgerking;

import androidx.recyclerview.widget.RecyclerView;

import android.view.ViewGroup;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;


import static com.example.borgerking.Order.totalTextView;
import static com.example.borgerking.Order.orderList;
//import static com.example.borgerking.Order.itemCount;


public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {

    private ArrayList<Menu> ordersToAdapt;


    public void setData(ArrayList<Menu>ordersToAdapt){
        this.ordersToAdapt = ordersToAdapt;
    }

    @NonNull
    @Override
    public OrderAdapter.OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order, parent, false);
        OrderViewHolder orderViewHolder = new OrderViewHolder(view);
        return orderViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderAdapter.OrderViewHolder holder, int position) {


        final Menu foodAtPosition = ordersToAdapt.get(position);

        holder.name.setText(foodAtPosition.getFoodName());
        holder.count.setText(String.format(" X " + foodAtPosition.getItemCount()));
        //holder.desc.setText(foodAtPosition.getFoodDesc());
        holder.image.setImageResource(foodAtPosition.getImageDrawableId());
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, Order.class);
                intent.putExtra("foodID", foodAtPosition.getFoodID());
                context.startActivity(intent);

            }
        });

        //adding total cost of everything
        double price = 0;
        for (int i=0; i<orderList.size(); i++) {
            price += orderList.get(i).getTotalCost();
            String prices = String.format("%,.2f", price);
            totalTextView.setText("$" + prices);
        }



    }

    @Override
    public int getItemCount() {
        return ordersToAdapt.size();
    }

    public static class OrderViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public TextView name;
        public TextView count;
        //public TextView desc;
        public ImageView image;


        public OrderViewHolder(View v){
            super(v);
            view = v;
            name = v.findViewById(R.id.oName);
            count = v.findViewById(R.id.oCount);
            // desc = v.findViewById(R.id.);
            image = v.findViewById(R.id.oImage);
        }
    }
}

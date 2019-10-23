package com.example.borgerking;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    private ArrayList<Menu> menuToAdapt;

    public void setData(ArrayList<Menu>menuToAdapt){

        this.menuToAdapt = menuToAdapt;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu, parent, false);
        MenuViewHolder menuViewHolder = new MenuViewHolder(view);
        return menuViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        final Menu foodAtPosition = menuToAdapt.get(position);

        holder.name.setText(foodAtPosition.getFoodName());
        holder.cost.setText(String.format("$" + "%.2f" ,foodAtPosition.getFoodCost()));
        //holder.desc.setText(foodAtPosition.getFoodDesc());
        holder.image.setImageResource(foodAtPosition.getImageDrawableId());
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, MenuDetail.class);
                intent.putExtra("foodID", foodAtPosition.getFoodID());
                context.startActivity(intent);

            }
        });


    }


    @Override
    public int getItemCount() {
        return menuToAdapt.size();
    }

    public static class MenuViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public TextView name;
        public TextView cost;
        //public TextView desc;
        public ImageView image;

        public MenuViewHolder(View v){
            super(v);
            view = v;
            name = v.findViewById(R.id.oName);
            cost = v.findViewById(R.id.oCount);
           // desc = v.findViewById(R.id.);
            image = v.findViewById(R.id.oImage);
        }
    }
}

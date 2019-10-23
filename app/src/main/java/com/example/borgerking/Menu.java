package com.example.borgerking;

public class Menu {

    private int foodID;
    private String foodName;
    private double foodCost;
    private String foodDesc;
    private int imageDrawableId;
    private int itemCount;
    private double totalCost;



        public Menu(int foodID, String foodName, double foodCost, String foodDesc, int imageDrawableId, int itemCount, double totalCost){
            this.foodID = foodID;
            this.foodName = foodName;
            this.foodCost = foodCost;
            this.foodDesc = foodDesc;
            this.imageDrawableId = imageDrawableId;
            this.itemCount = itemCount;
            this.totalCost = totalCost;

        }

        public int getFoodID(){
            return foodID;
        }

        public String getFoodName(){
            return foodName;
        }

        public double getFoodCost(){
            return foodCost;
        }

        public String getFoodDesc(){
            return foodDesc;
        }

        public void setFoodID(){
            this.foodID = foodID;
        }

        public void setFoodName(){
            this.foodName = foodName;
        }

        public void setFoodCost(){
            this.foodCost = foodCost;
        }

        public void setFoodDesc(){
            this.foodDesc=foodDesc;
        }

        public int getImageDrawableId() {
            return imageDrawableId;
        }

        public void setImageDrawableId(){
            this.imageDrawableId = imageDrawableId;
        }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int c){
        this.itemCount = c;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double c){
        this.totalCost = c;
    }




}

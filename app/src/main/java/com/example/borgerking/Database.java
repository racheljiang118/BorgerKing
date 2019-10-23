package com.example.borgerking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Database {

    public static Menu getFoodById(int foodID){
        return foods.get(foodID);
    }

    public static ArrayList<Menu> getAllFoods() {
        return new ArrayList<Menu>((List) Arrays.asList(foods.values().toArray()));
    }


    // You can ignore everything below this for now.
    private static final HashMap<Integer, Menu> foods = new HashMap<>();
        static {
            foods.put(1, new Menu( 1, "McChicken", 5.50, "A toasted wheat bun, a breaded chicken breast meat patty, shredded lettuce, and mayonnaise.", R.drawable.mcchicken, 0, 0));
            foods.put(2, new Menu(2, "Cheeseburger", 4.50, "A slice of melty cheddar cheese on a juicy 100% Irish beef patty, zippy pickle and onions, ketchup and mustard on a toasted bun.", R.drawable.cheeseburger, 0, 0));
            foods.put(3, new Menu (3, "Quarter Pounder", 5.50, "Take a whole quarter pound* of 100% Aussie beef, then complete the tasty picture with cheese, onions, tangy mustard and pickles.", R.drawable.quarterpounder , 0, 0));
            foods.put(4, new Menu (4, "Beef Wrap", 5.50, "The new Classic Beef McWrap, made with juicy 100% Aussie Beef, Lettuce, Tomato, Grilled Onions, Macca’s Classic Cheese & creamy Signature Sauce all wrapped up in a delicious wholemeal tortilla.", R.drawable.beefwrap, 0, 0));
            foods.put(5, new Menu (5, "Double Cheese", 5.80, "Two 100%  Aussie beef patties, melted cheese, tangy pickles, mustard and sweet ketchup. ", R.drawable.doublecheeseburger, 0, 0));
            foods.put(6, new Menu( 6, "Classic Angus", 6.50, "100% Aussie Angus beef, classic cheese, tomato, onions and pickles with mustard and mayo.", R.drawable.angusburger, 0, 0));
            foods.put(7, new Menu (7, "Big Mac", 4.20, "Then comes the delicious combination of crisp iceberg lettuce, melting signature cheese, onions and pickles, between a toasted sesame seed bun. ", R.drawable.bigmac, 0, 0));
            foods.put(8, new Menu (8, "Filet-O-Fish", 4.50, "Tender portions of fish and enhance their great taste with zesty tartar sauce and cheese.", R.drawable.filetofish, 0, 0));
            foods.put(9, new Menu (9, "French Fries", 3.50, "Crispy and golden on the outside, and fluffy on the inside.", R.drawable.frenchfries, 0, 0));
            foods.put(10, new Menu (10, "Apple Pie", 2.50, "Crisp pastry, lovingly filled with aussie apples for that extra sweet taste.", R.drawable.applepie, 0, 0));
            foods.put(11, new Menu (11, "Chicken Nuggets", 6.00, "Chicken Nuggets in a crisp tempura coating, with no artificial colours, flavours or preservatives!", R.drawable.nuggets, 0, 0));
            foods.put(12, new Menu (12, "Coca-Cola", 3.00, "Thirst quenching soda drink to top off your meal", R.drawable.coke2, 0, 0));
            foods.put(13, new Menu (13, "Orange Juice", 3.00, "Freshly squeezed orange juice", R.drawable.orangejuice, 0, 0));
            foods.put(14, new Menu(14, "Water", 1.50, "Evian bottled water from the springs of Lake Geneva lol", R.drawable.water, 0, 0));
            foods.put(15, new Menu( 15, "Sprite", 3.00, "Sparking lemonade to top off your meal", R.drawable.sprite, 0, 0));

        }

}

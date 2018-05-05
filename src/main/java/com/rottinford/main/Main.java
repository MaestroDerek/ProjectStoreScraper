package main.java.com.rottinford.main;

import main.java.com.rottinford.product.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        //Lets set some test parameters for our first list.
        //This will end up being done in the GUI
        String firstListName =  "My First List";

        ShoppingList myFirstList = new ShoppingList(firstListName);

        //Lets set some test products to add to our list

        ArrayList<Product> myProducts = new ArrayList<>();

        for (int i = 0; i < 5; i++)
        {
            Product coolProduct = new Product(i * 1.5, "Product " + i, Product.itemType.TEST);
            myProducts.add(coolProduct);
        }

        myFirstList.setListOfProducts(myProducts);
        myFirstList.setNumOfItems(myProducts.size());
        ShoppingListHelper.printShoppingListDetails(myFirstList);

    }
}

package main.java.com.rottinford.product;

import java.util.ArrayList;
import java.util.Collections;

public class ShoppingList  {

    private ArrayList<Product>  listOfProducts;
    private int                 numOfItems; //convenience. could just call listOfProducts.size()
    private String              name;

    //No arg constructor
    public ShoppingList () {
        this.listOfProducts = new ArrayList<>(Collections.nCopies(0, null));
        this.numOfItems = this.listOfProducts.size();
        this.name = "Default List Name";
    }

    //most likely, this will be the most used constructor.
    //If a user wants to create a list (simple button press on GUI)
    //Then this is what it will most likely use
    public ShoppingList(String name) {

        this.listOfProducts = new ArrayList<>(0);
        this.numOfItems = 0;
        this.name = name;

    }

    //Constructor for size and name. This might be used
    public ShoppingList(int numOfItems, String name) {

        this.listOfProducts = new ArrayList<>(Collections.nCopies(numOfItems, null));
        this.numOfItems = numOfItems;
        this.name = name;
    }

    //Constructor for all 3 arguments
    public ShoppingList(ArrayList<Product> listOfProducts, int numOfItems, String name) {

        this.listOfProducts = listOfProducts;
        this.numOfItems = numOfItems;
        this.name = name;
    }


    public ArrayList<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(ArrayList<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public int getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfItems(int numOfItems) {
        this.numOfItems = numOfItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

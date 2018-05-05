package main.java.com.rottinford.product;

import java.util.ArrayList;

//Helper class for Shopping Lists
//Gives some useful functions to use in terms of IO
public class ShoppingListHelper {

    private static String prettySpaces = "                              ";

    public static void printShoppingListDetails(ShoppingList list) {

        System.out.println("=================================");
        System.out.println("==INFORMATION FOR SHOPPING LIST==");
        System.out.println("=================================");

        System.out.println("NAME = " + list.getName());
        System.out.println("NUMBER OF ITEMS = " +list.getNumOfItems());
        System.out.println("LIST OF ITEMS: \n\n");

        //TODO: fix this atrocious output style
        System.out.println("NAME" + prettySpaces + "PRICE" + prettySpaces + "TYPE" + prettySpaces);
        System.out.println("----" + prettySpaces + "-----" + prettySpaces + "----" + prettySpaces);

        ArrayList<Product> products = list.getListOfProducts();

        for (int i = 0; i < list.getNumOfItems(); i++)
        {

            Product thisProduct = products.get(i);

            if (thisProduct == null)
            {
                break;
            }
            //Loop through each Product in List one by one in output
            System.out.println( thisProduct.getName() +
                                prettySpaces + thisProduct.getPrice() +
                                prettySpaces + thisProduct.getType());
        }
    }
}

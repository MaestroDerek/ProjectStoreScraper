package main.java.com.rottinford.product;

public class Product {

    private enum itemType {
        FOOD, TECH, TEST
    }

    private double price;
    private String name;
    private itemType type;

    //Default constructor. Fill with basic values
    public Product() {

        this.price = 0.00;
        this.name = "ProductName";
        this.type = itemType.TEST;
    }

    //Constructor
    public Product(double price, String name, itemType type) {
        this.price = price;
        this.name = name;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public itemType getType() {
        return type;
    }

    public void setType(itemType type) {
        this.type = type;
    }
}

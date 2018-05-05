package main.java.com.rottinford.product;

import org.joda.money.Money;

import java.util.Currency;

public class Product {

    public enum itemType {
        FOOD, TECH, TEST
    }

    private Money             price;    //from Joda.money library http://www.joda.org/joda-money/
    private String            name;
    private itemType          type;

    //Default constructor. Fill with basic values
    public Product() {

        this.price = Money.parse ("USD 0.00");
        this.name = "ProductName";
        this.type = itemType.TEST;
    }

    //Constructor
    public Product(double price, String name, itemType type) {
        this.price = Money.parse("USD "  + price);
        this.name = name;
        this.type = type;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(double price) {
        Money.parse("USD "  + price);
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

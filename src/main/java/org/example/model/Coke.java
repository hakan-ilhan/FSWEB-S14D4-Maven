package org.example.model;

import org.example.model.ProductForSale;

public class Coke extends ProductForSale {
    //private String name;
    public Coke(String type, double price, String description) {
        super(type, price, description);
        //this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("type: " + getType() + ", price: " + getPrice() + ", description: "+ getDescription());
    }
}

package org.example.model;

import org.example.model.ProductForSale;

public class Bread extends ProductForSale {
    //private String name;
    public Bread(String type, double price, String description) {
        super(type, price, description);
        //this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("type: " + getType() + ", price: " + getPrice() + ", description: "+ getDescription() );
    }
}

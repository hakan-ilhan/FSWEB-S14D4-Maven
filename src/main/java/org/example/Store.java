package org.example;

import org.example.model.Bread;
import org.example.model.Chocolate;
import org.example.model.Coke;
import org.example.model.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Chocolate",2.5,"Delicious chocolate bar");
        products[1] = new Coke("Coke",1.0,"Refreshing soda drink");
        products[2] =  new Bread("Bread",1.0,"Freshly baked bread");


        listProducts(products);



}
    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale item : products) item.showDetails();
    }
}
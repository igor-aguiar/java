package com.digitalhouse.exercicios.playground.introductionToPoo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> cartItems = new ArrayList<>();
    private Double totalValue = 0.0;

    public ShoppingCart() {
    }

    public void addItem(Product item){
        cartItems.add(item);
        totalValue += item.getValue();
    }

    public Double getTotalValue() {
        return totalValue;
    }
}

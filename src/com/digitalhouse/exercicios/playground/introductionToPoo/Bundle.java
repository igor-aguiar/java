package com.digitalhouse.exercicios.playground.introductionToPoo;

import java.util.ArrayList;
import java.util.List;

public class Bundle extends Product{
    private List<Product> bundleItems;
    private Double discount;
    private Double finalValue = 0.0;

    public Bundle(Double discount) {
        this.discount = discount;
        bundleItems = new ArrayList<>();
    }

    public void addItem(Product item){
        bundleItems.add(item);
    }

    public void apllyDiscount(){
        for (Product item: bundleItems) {
            finalValue += item.getValue();
        }
        finalValue -= (finalValue * discount);
    }

    @Override
    public Double getValue(){
        return finalValue;
    }

    @Override
    public String toString() {
        Double totalItems = 0.0;
        StringBuilder finalString = new StringBuilder();
        finalString.append("Bundle: \n");
        for (Product item: bundleItems) {
            finalString.append(item.toString()).append('\n');
        }
        finalString.append("Total: ");
        finalString.append(finalValue);
        return finalString.toString();
    }
}

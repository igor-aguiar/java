package com.digitalhouse.exercicios.playground.introductionToPoo;

public class Product {
    private String name;
    private ProductSize size;
    private Double value;

    public Product() {
    }

    public Product(String name, ProductSize size, Double value) {
        this.name = name;
        this.size = size;
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return name + " " + size + ", R$ " + value;
    }
}

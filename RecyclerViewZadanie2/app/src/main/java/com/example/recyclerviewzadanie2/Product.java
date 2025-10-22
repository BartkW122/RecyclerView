package com.example.recyclerviewzadanie2;

public class Product {
    private String productName;
    private double priceValue;

    public Product(String productName,double priceValue){
        this.productName = productName;
        this.priceValue = priceValue;
    }
    public String getProductName() {
        return this.productName;
    }

    public double getPriceValue() {
        return this.priceValue;
    }
}

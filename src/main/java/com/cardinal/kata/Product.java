package com.cardinal.kata;
/**
 * As a vendor I want customers to select products
 * So that I can give them an incentive to put money in the machine.
 * There are three products: cola for $1.00, chips for $0.50, and candy for $0.65. 
 */
public enum Product {
    CHIPS(.50),
    COLA(1.00),
    CANDY(.65);   
    
    private double price;
    
    Product(double price) {
        this.price = price;
    }
    
    
}

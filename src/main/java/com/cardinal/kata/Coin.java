package com.cardinal.kata;

/**
 * The temptation here will be to create Coin objects that know their value. 
 * However, this is not how a real vending machine works. 
 * Instead, it identifies coins by their weight and size and then assigns a value 
 * to what was inserted. 
 * 
 */
public enum Coin {
    PENNY(1.1,2.2),
    QUARTER(2,2),
    NICKEL(3,3),
    DIME(4,4);
    
    private double weight;
    private double size;
    
    Coin(double weight, double size) {
        this.weight = weight;
        this.size = size;
    }
}

package com.cardinal.kata;

import java.util.Collection;
import java.util.ArrayList;

public class VendingMachine {
    
 double displayValue;
 Collection<Coin> coinReturn = new ArrayList<Coin>();
 double rejectedCoinValue;
 
 public void insertCoin(Coin coin) {
   if (!isValidCoin(coin)) {
         // return the payment
         rejectPayment(coin);
    }
    acceptPayment(coin);
}    


public boolean isValidCoin(Coin coin) {
    return coin != Coin.PENNY;    
}
 
 public void acceptPayment(Coin coin) {}
 
 /**
  * when the coin inserted is not valid, it is rejected by returning it in the 
  * coin return slot.
  * Here, the coin return slot is reflected as an object that holds a collection of coins. 
  *  The coin value is not reflected in the machine display value.
  * 
  */
 public void rejectPayment(Coin coin) {
    setRejectedCoinValue(getCoinValue(coin));
    coinReturn.add(coin);
 }
 
 public double getDisplay() {
     return displayValue;
 }
 
 private void setRejectedCoinValue(double value) {
     rejectedCoinValue = value;
 }
     
 public double getRejectedCoinValue() {
     return rejectedCoinValue;
 }
 
 private double getCoinValue(Coin coin) {
     double coinValue = 0d;
     
      switch (coin ) {
         case PENNY:
            coinValue = .01;
            break;
         case NICKEL:
            coinValue = .05;
            break;
        case DIME:
            coinValue = .10;
            break;
        case QUARTER:
            coinValue = .25;
            break;
        default:
            break;
        }
        
        return coinValue;
    }
}
package com.cardinal.kata;

import java.util.Collection;
import java.util.ArrayList;

public class VendingMachine {
    
 double displayValue;
 Collection<Coin> coinReturn = new ArrayList<Coin>();
 ArrayList<Coin> changeBin = new ArrayList<Coin>();
 double rejectedCoinValue;
 
 public void insertCoin(Coin coin) {
   if (isInvalidCoin(coin)) {
         // return the payment
         rejectPayment(coin);
    } else {
        acceptPayment(coin);
    }
}    


public boolean isInvalidCoin(Coin coin) {
    return coin == Coin.PENNY;    
}
 
 /**
  * when the payment is accepted, the display value is updated to reflect the additional coin
  * and the total coin value is updated (for change)
  */
 public void acceptPayment(Coin coin) {
    double coinValue = getCoinValue(coin);
    updateDisplay(coinValue);
    setRejectedCoinValue(0d);
    addToChangeBin(coin);
 }

 
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
    
    private void updateDisplay(double coinValue) {
        displayValue += coinValue;
    }
    
    private void addToChangeBin(Coin coin) {
        changeBin.add(coin);
    }
}
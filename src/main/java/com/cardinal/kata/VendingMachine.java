package com.cardinal.kata;

public class VendingMachine {
    
 double displayValue;
 double coinReturn;
 
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
 
 public void rejectPayment(Coin coin) {}
 
 public double getDisplay() {
     return displayValue;
 }
 
 public double coinReturn() {
     return coinReturn;
 }
 
}
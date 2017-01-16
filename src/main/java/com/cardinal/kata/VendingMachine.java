package com.cardinal.kata;

import java.util.ArrayList;

public class VendingMachine {

    CoinSlot        coinSlot;
    double          displayValue;
    ArrayList<Coin> coinReturn = new ArrayList<Coin>();
    ArrayList<Coin> changeBin  = new ArrayList<Coin>();
    double          rejectedCoinValue;


    public VendingMachine() {
        coinSlot = new CoinSlot();
    }

   
    /**
  * When a valid coin is inserted the amount of the coin will be added to the current amount 
  * and the display will be updated.
  */
 private void acceptPayment(Coin coin) {
    double coinValue = getCoinValue(coin);
    updateDisplay(coinValue);
    setRejectedCoinValue(0d);
    addToChangeBin(coin);
 }

 
 /**
  * when the coin inserted is not valid, it is rejected by returning it in the 
  * coin return slot.  Here, the coin return slot is reflected as an object that holds a collection of coins. 
  * The rejected coin value is not reflected in the machine display value, but the last rejected coin value is recorded,
  * in case it is needed.
  * 
  */
 private void rejectPayment(Coin coin) {
    setRejectedCoinValue(getCoinValue(coin));
    coinReturn.add(coin);
 }
 
 /**
  * method accepts the coin and determines if the coin is valid or not.
  * When valid, the payment is accepted. 
  * When not valid the payement is rejected.
  */

    public void insertCoin(Coin coin) {
        try {
            coinSlot.insertCoin(coin);
            acceptPayment(coin);
        } catch (Exception ex) {
            rejectPayment(coin);
        }

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

        switch (coin) {
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

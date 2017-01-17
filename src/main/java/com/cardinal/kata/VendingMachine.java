package com.cardinal.kata;

import java.util.ArrayList;
import java.math.BigDecimal;

public class VendingMachine {

    private static CoinSlot  coinSlot;
    private static VendingMachineDisplay vendingMachineDisplay;
    ArrayList<Coin> coinReturn = new ArrayList<Coin>();
    ArrayList<Coin> changeBin  = new ArrayList<Coin>();
    BigDecimal rejectedCoinValue;


    public VendingMachine() {
        coinSlot = new CoinSlot();
        vendingMachineDisplay = new VendingMachineDisplay();
    }

   
    /**
  * When a valid coin is inserted the amount of the coin will be added to the current amount 
  * and the display will be updated.
  */
 private void acceptPayment(Coin coin) {
    BigDecimal coinValue = getCoinValue(coin);
    updateDisplay(coinValue);
    setRejectedCoinValue(BigDecimal.ZERO);
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
 
    public String getDisplay() {
        return  vendingMachineDisplay.getDisplayText();
    }

    private void setRejectedCoinValue(BigDecimal value) {
        rejectedCoinValue = value;
    }

    public BigDecimal getRejectedCoinValue() {
        return rejectedCoinValue;
    }

    private BigDecimal getCoinValue(Coin coin) {
        BigDecimal coinValue = BigDecimal.ZERO;

        switch (coin) {
            case PENNY:
                coinValue = new BigDecimal(".01");
                break;
            case NICKEL:
                coinValue = new BigDecimal(".05");
                break;
            case DIME:
                coinValue = new BigDecimal(".10");
                break;
            case QUARTER:
                coinValue = new BigDecimal(".25");
                break;
            default:
                break;
        }

        return coinValue;
    }

    private void updateDisplay(BigDecimal coinValue) {
        vendingMachineDisplay.setDisplayValue(coinValue);
    }

    private void addToChangeBin(Coin coin) {
        changeBin.add(coin);
    }
}

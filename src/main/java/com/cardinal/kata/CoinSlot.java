package com.cardinal.kata;

import java.lang.IllegalArgumentException;

/**
 * Validates the coins inserted into the vending machine.
 */
public class CoinSlot {

/**
 * the only coin that is invalid is the PENNY.
 */
private boolean isValidCoin(Coin coin) {
    return coin != Coin.PENNY;    
}
 
public void insertCoin(Coin coin) throws IllegalArgumentException {
   if (!isValidCoin(coin)) {
      throw new IllegalArgumentException("Coin: " + coin + " is invalid");
    }
}    


}

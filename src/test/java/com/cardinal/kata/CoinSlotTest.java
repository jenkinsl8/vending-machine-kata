package com.cardinal.kata;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CoinSlotTest {
    CoinSlot coinSlot;
    
    @Before
    public void init() {
        coinSlot = new CoinSlot();
    }
    
    /**
     * The vending machine will accept valid coins (nickels, dimes, and quarters)
     *  and reject invalid ones (pennies).
     */
    @Test(expected = IllegalArgumentException.class)
    public void rejectPennyCoinTest() {
       coinSlot.insertCoin(Coin.PENNY);
      }
    
    @Test
    public void acceptNickelCoinTest() {
        coinSlot.insertCoin(Coin.NICKEL);
   
    }
    
    @Test
    public void acceptDimeCoinTest() {
        coinSlot.insertCoin(Coin.DIME);
    }

     
    
    @Test
    public void acceptQuarterCoinTest() {
        coinSlot.insertCoin(Coin.QUARTER);
    }

     
}

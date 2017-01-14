package com.cardinal.kata;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {
    VendingMachine vendingMachine;
    
    @Before
    public void init() {
        vendingMachine = new VendingMachine();
    }
    
    /**
     * The vending machine will accept valid coins (nickels, dimes, and quarters)
     *  and reject invalid ones (pennies).
     */
    @Test
    public void rejectPennyCoinTest() {
       vendingMachine.insertCoin(Coin.PENNY);
       assertEquals(.01, vendingMachine.getRejectedCoinValue(),0d);
       assertEquals(0d, vendingMachine.getDisplay(),0d);
    }
    
    @Test
    public void acceptNickelCoinTest() {
        vendingMachine.insertCoin(Coin.NICKEL);
        assertEquals(.05, vendingMachine.getDisplay(), 0d);
        assertEquals(0d, vendingMachine.getRejectedCoinValue(),0d);
    }
    
    @Test
    public void acceptDimeCoinTest() {
        vendingMachine.insertCoin(Coin.DIME);
        assertEquals(.10, vendingMachine.getDisplay(), 0d);
        assertEquals(0d, vendingMachine.getRejectedCoinValue(), 0d);
    }
    
    @Test
    public void acceptQuarterCoinTest() {
        vendingMachine.insertCoin(Coin.QUARTER);
        assertEquals(.25, vendingMachine.getDisplay(), 0d);
        assertEquals(0d, vendingMachine.getRejectedCoinValue(),0d);
    }
}

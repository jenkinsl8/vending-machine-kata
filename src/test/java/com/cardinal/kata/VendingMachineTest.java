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
}

package com.cardinal.kata;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import java.math.BigDecimal;

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
       assertEquals(new BigDecimal(".01"), vendingMachine.getRejectedCoinValue());
       assertEquals("INSERT COIN", vendingMachine.getDisplay());
    }
    
    @Test
    public void acceptNickelCoinTest() {
        vendingMachine.insertCoin(Coin.NICKEL);
        assertEquals("PRODUCT 0.05", vendingMachine.getDisplay());
        assertEquals(BigDecimal.ZERO, vendingMachine.getRejectedCoinValue());
    }
    
    @Test
    public void acceptDimeCoinTest() {
        vendingMachine.insertCoin(Coin.DIME);
        assertEquals("PRODUCT 0.10", vendingMachine.getDisplay());
        assertEquals(BigDecimal.ZERO, vendingMachine.getRejectedCoinValue());
    }
    
    @Test
    public void acceptQuarterCoinTest() {
        vendingMachine.insertCoin(Coin.QUARTER);
        assertEquals("PRODUCT 0.25", vendingMachine.getDisplay());
        assertEquals(BigDecimal.ZERO, vendingMachine.getRejectedCoinValue());
    }
}

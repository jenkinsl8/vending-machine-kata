package com.cardinal.kata;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Test the vendingMachine display logic
 */
public class DisplayTest {
    VendingMachineDisplay display;
   
    
    @Before
    public void init() {
        display = new VendingMachineDisplay();
    }
    
    /**
     * When there are no coins inserted, the machine displays INSERT COIN.
     */
    @Test
    public void newCoinInsertedTest() {
        assertEquals("INSERT COIN", display.getDisplayText());
    }
    
}

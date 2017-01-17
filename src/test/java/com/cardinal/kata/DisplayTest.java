package com.cardinal.kata;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import java.math.BigDecimal;

/**
 * Test the vendingMachine display logic
 */
public class DisplayTest {
    VendingMachineDisplay vendingMachineDisplay;
   
    
    @Before
    public void init() {
        vendingMachineDisplay = new VendingMachineDisplay();
    }
    
    /**
     * When there are no coins inserted, the machine displays INSERT COIN.
     * Validates that the default value of the display is "INSERT COIN".
     */
    @Test
    public void noCoinInsertedTest() {
        assertEquals("INSERT COIN", vendingMachineDisplay.getDisplayText());
    }
    
    /**
     * validates that the display text can be set.
     */
    @Test
    public void changeDisplayText() {
        vendingMachineDisplay.setDisplayValue(BigDecimal.ONE);
        assertEquals("PRODUCT 1.00", vendingMachineDisplay.getDisplayText());
    }
    
}

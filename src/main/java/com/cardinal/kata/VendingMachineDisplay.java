package com.cardinal.kata;

import java.math.BigDecimal;

public class VendingMachineDisplay {
    private BigDecimal displayValue;
    private String displayText = "";
    private static final String PRODUCT_STRING = "PRODUCT";
    private static final String INSERT_COIN_STRING= "INSERT COIN";

    
    public VendingMachineDisplay() {
        displayValue = BigDecimal.ZERO;
        setDisplayText(INSERT_COIN_STRING);
    }
    
    
    /** 
     * sets the text that will appear in the display
     */
    public String getDisplayText() {
        StringBuilder stringBuilder = new StringBuilder();
        
        stringBuilder = stringBuilder.append(displayText);
        
        if (displayValue.compareTo(BigDecimal.ZERO) != 0) {
          stringBuilder.append(" ").append(displayValue);
         }
         
         return stringBuilder.toString();
    }
    
    /**
     * sets the value to display 
     * and sets the text based on the value
     */
    public void setDisplayValue(BigDecimal value) {
        displayValue = value.setScale(2);
        setDisplayText(PRODUCT_STRING);
    }
    
    
    /**
     * sets the text to display
     */
    private void setDisplayText(String text) {
        displayText = text;
    }
}

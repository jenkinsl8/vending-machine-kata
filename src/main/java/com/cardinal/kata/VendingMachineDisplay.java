package com.cardinal.kata;

public class VendingMachineDisplay {
    private String displayText;
    private static final String NO_COIN_INSERTED = "INSERT COIN";
    
    public VendingMachineDisplay() {
    
    }
    
    public String getDisplayText() {
        return displayText;
    }
    
    public void setDisplayText(String text) {
        displayText = text;
    }
}

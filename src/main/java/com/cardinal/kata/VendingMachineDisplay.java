package com.cardinal.kata;

public class VendingMachineDisplay {
    private String displayText;
    private static final String NO_COIN_INSERTED = "INSERT COIN";
    
    public VendingMachineDisplay() {
        displayText = NO_COIN_INSERTED;
    }
    
    public String getDisplayText() {
        return displayText;
    }
    
    public void setDisplayText(String text) {
        displayText = text;
    }
}

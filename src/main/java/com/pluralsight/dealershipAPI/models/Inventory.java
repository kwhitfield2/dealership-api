package com.pluralsight.dealershipAPI.models;

public class Inventory {
    private int inventoryID;
    private int dealershipID;
    private String VIN;

    public Inventory(int inventoryID, int dealershipID, String VIN) {
        this.inventoryID = inventoryID;
        this.dealershipID = dealershipID;
        this.VIN = VIN;
    }

    public int getInventoryID() {
        return inventoryID;
    }

    public int getDealershipID() {
        return dealershipID;
    }

    public String getVIN() {
        return VIN;
    }
}

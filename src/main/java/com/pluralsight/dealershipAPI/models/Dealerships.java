package com.pluralsight.dealershipAPI.models;

public class Dealerships {
    private String address;
    private String customerName;
    private int dealershipID;
    private String phoneNumber;

    public Dealerships(String address, String customerName, int dealershipID, String phoneNumber) {
        this.address = address;
        this.customerName = customerName;
        this.dealershipID = dealershipID;
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getDealershipID() {
        return dealershipID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

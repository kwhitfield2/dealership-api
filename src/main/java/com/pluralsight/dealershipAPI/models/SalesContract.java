package com.pluralsight.dealershipAPI.models;

public class SalesContract {
    private double APR;
    private int contractID;
    private String VIN;

    public SalesContract(double APR, String VIN, int contractID) {
        this.APR = APR;
        this.VIN = VIN;
        this.contractID = contractID;
    }

    public double getAPR() {
        return APR;
    }

    public int getContractID() {
        return contractID;
    }

    public String getVIN() {
        return VIN;
    }
}

package com.pluralsight.dealershipAPI.models;

public class Vehicle {
    private String color;
    private String make;
    private int mileage;
    private String model;
    private double price;
    private String sold;
    private int vehicleYear;
    private String VIN;

    public Vehicle(String color, String make, int mileage, String model, double price, String sold, int vehicleYear, String VIN) {
        this.color = color;
        this.make = make;
        this.mileage = mileage;
        this.model = model;
        this.price = price;
        this.sold = sold;
        this.vehicleYear = vehicleYear;
        this.VIN = VIN;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public int getMileage() {
        return mileage;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getSold() {
        return sold;
    }

    public int getVehicleYear() {
        return vehicleYear;
    }

    public String getVIN() {
        return VIN;
    }
}

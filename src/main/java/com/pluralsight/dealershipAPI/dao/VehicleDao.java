package com.pluralsight.dealershipAPI.dao;



import com.pluralsight.dealershipAPI.models.Vehicle;

import java.util.List;

    public interface VehicleDao {
        List<Vehicle> getAll();
        Vehicle insert(Vehicle vehicle);
        void update(Vehicle vehicle);
        List<Vehicle> getByMinMax(int min, int max);

    }

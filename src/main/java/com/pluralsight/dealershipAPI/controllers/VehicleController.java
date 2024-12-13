package com.pluralsight.dealershipAPI.controllers;

import com.pluralsight.dealershipAPI.dao.VehicleDao;
import com.pluralsight.dealershipAPI.models.Vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {
    private VehicleDao vehicleDao;

    @Autowired
    public VehicleController(VehicleDao vehicleDao) {
        this.vehicleDao = vehicleDao;
    }

    @RequestMapping(path="/vehicle", method = RequestMethod.GET)
    public List<Vehicle> getAllCategories() {
        return this.vehicleDao.getAll();
    }
    @RequestMapping(path="/vehicle", method = RequestMethod.GET)
    public List<Vehicle> getAllCategories(@RequestParam int min, @RequestParam int max) {
        return this.vehicleDao.getAll();
    }












    @RequestMapping(path="/vehicle", method = RequestMethod.POST)
    public Vehicle addAVehicle(@RequestBody Vehicle vehicle) {

        return vehicleDao.insert(vehicle);
    }

    @RequestMapping(path="/vehicle", method = RequestMethod.PUT)
    public void updateVehicle(@RequestBody Vehicle vehicle) {
        vehicleDao.update(vehicle);


    }


}

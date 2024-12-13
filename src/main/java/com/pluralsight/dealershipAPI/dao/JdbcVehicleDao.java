package com.pluralsight.dealershipAPI.dao;

import com.pluralsight.dealershipAPI.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcVehicleDao implements VehicleDao {

    private DataSource dataSource;
    private List<Vehicle> vehicles;

    @Autowired
    public JdbcVehicleDao(DataSource dataSource) {
        this.dataSource = dataSource;
        this.vehicles = new ArrayList<>();
    }


    @Override
    public List<Vehicle> getAll() {
        this.vehicles.clear();
        String sql = "SELECT price FROM

        try(Connection connection = dataSource.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rows = statement.executeQuery();
            while(rows.next()){
                this.vehicles.add(new Vehicle(rows.getInt(1), rows.getString(2)));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return this.vehicles;
    }

    @Override
    public Vehicle insert(Vehicle vehicle) {
        return null;
    }

    @Override
    public void update(Vehicle vehicle) {

    }
}

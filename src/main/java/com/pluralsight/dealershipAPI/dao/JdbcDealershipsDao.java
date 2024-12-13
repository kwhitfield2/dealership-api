package com.pluralsight.dealershipAPI.dao;

import com.pluralsight.dealershipAPI.models.Dealerships;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcDealershipsDao implements DealershipsDao {

    private DataSource dataSource;
    private List<Dealerships> dealerships;

    @Autowired
    public JdbcDealershipsDao(DataSource dataSource){
        this.dataSource = dataSource;
        this.dealerships = new ArrayList<>();
    }


    @Override
    public List<Dealerships> getAll() {
        return this.dealerships;
    }
}
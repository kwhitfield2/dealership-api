package com.pluralsight.dealershipAPI.dao;

import com.pluralsight.dealershipAPI.models.SalesContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcSalesContractDao implements SalesContractDao {

    private DataSource dataSource;
    private List<SalesContract> salesContract;

    @Autowired
    public JdbcSalesContractDao(DataSource dataSource) {
        this.dataSource = dataSource;
        this.salesContract = new ArrayList<>();
    }

    @Override
    public List<SalesContract> getAll() {
        return this.salesContract;
    }
    }
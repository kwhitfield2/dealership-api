package com.pluralsight.dealershipAPI.dao;

import com.pluralsight.dealershipAPI.models.LeaseContract;

import java.util.List;

public interface LeaseContractDao {
    List<LeaseContract> getAll();

}


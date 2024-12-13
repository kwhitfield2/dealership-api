package com.pluralsight.dealershipAPI.dao;



import com.pluralsight.dealershipAPI.models.SalesContract;

import java.util.List;

public interface SalesContractDao {
    List<SalesContract> getAll();
}

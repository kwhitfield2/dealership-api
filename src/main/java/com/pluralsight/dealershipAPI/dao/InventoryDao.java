package com.pluralsight.dealershipAPI.dao;

import com.pluralsight.dealershipAPI.models.Inventory;

import java.util.List;

public interface InventoryDao {
    List<Inventory> getAll();
}

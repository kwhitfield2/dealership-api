package com.pluralsight.dealershipAPI.controllers;

import com.pluralsight.dealershipAPI.dao.SalesContractDao;
import com.pluralsight.dealershipAPI.models.SalesContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
    public class SalesContractController {

        private SalesContractDao salesContractDao;

        @Autowired
        public SalesContractController(SalesContractDao salesContractDao) {
            this.salesContractDao = salesContractDao;
        }

        @RequestMapping(path="/categories{id}", method = RequestMethod.GET)
        public List<SalesContract> getAllCategories() {
            return this.salesContractDao.getAll();
        }
}

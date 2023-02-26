package com.petshop.project.service;

import com.petshop.project.entities.Customer;
import com.petshop.project.repository.ICustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    ICustomerDao customerDao;

    public Customer createCustomer(Customer newCustomer){
        return customerDao.save(newCustomer);
    }
}

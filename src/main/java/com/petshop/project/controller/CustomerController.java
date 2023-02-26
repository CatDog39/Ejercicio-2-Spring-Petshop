package com.petshop.project.controller;

import com.petshop.project.entities.Customer;
import com.petshop.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping(value = "/create")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }
}

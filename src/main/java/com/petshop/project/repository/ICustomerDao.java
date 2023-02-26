package com.petshop.project.repository;

import com.petshop.project.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerDao extends CrudRepository<Customer,Integer> {
}

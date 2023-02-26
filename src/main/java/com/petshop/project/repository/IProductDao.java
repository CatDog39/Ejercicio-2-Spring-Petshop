package com.petshop.project.repository;

import com.petshop.project.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IProductDao extends CrudRepository<Product,Integer> {

    Product findAllById(Integer id);

    public Optional<Product> findByName (String name);

    //public Product findAllById(Integer id);
}

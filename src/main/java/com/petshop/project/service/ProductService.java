package com.petshop.project.service;

import com.petshop.project.entities.Product;
import com.petshop.project.repository.IProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProductDao productDao;

    public Product saveProduct(Product product){
        return productDao.save(product);
    }

    public boolean saveProducts(List<Product> products){
        try {
            productDao.saveAll(products);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public Product getProduct(Integer id){
        return productDao.findAllById(id);
    }

    public Product findNameProduct(String name){
        return productDao.findByName(name).orElse(null);
    }

}

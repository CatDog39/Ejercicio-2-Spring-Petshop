package com.petshop.project.controller;

import com.petshop.project.entities.Product;
import com.petshop.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping(value = "/save")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @PostMapping(value = "/save-all")
    public boolean saveProducts(@RequestBody List<Product> product){
        return productService.saveProducts(product);
    }

    @GetMapping(value = "/get-id")
    public Product getProduct(Integer id){
        return productService.getProduct(id);
    }

    @GetMapping(value = "/get-name")
    public Product findForName(String name){
        return productService.findNameProduct(name);
    }
}

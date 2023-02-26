package com.petshop.project.repository;

import com.petshop.project.entities.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInvoiceDao extends CrudRepository<Invoice,Integer> {
    Invoice findAllById(Integer id);
}

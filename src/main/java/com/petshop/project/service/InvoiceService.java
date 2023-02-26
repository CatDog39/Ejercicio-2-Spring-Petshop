package com.petshop.project.service;

import com.petshop.project.entities.Invoice;
import com.petshop.project.repository.IInvoiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {

    @Autowired
    IInvoiceDao invoiceDao;

    public Invoice newInvoice(Invoice newInvoice){
        return invoiceDao.save(newInvoice);
    }

    public Invoice getInvoice(Integer id){
        return invoiceDao.findAllById(id);
    }
}

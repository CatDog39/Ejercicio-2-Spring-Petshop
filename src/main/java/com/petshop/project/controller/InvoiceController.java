package com.petshop.project.controller;

import com.petshop.project.entities.Invoice;
import com.petshop.project.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/invoices")
public class InvoiceController {

    @Autowired
    InvoiceService invoiceService;

    @PostMapping(value = "/create")
    public Invoice createInvoice(@RequestBody Invoice invoice){
        return invoiceService.newInvoice(invoice);
    }

    @GetMapping(value = "/get")
    public Invoice getInvoice(@RequestBody Invoice invoice){
        return invoiceService.getInvoice(invoice.getId()); //validar
    }
}

package com.example.SemilleroTest.controller;

import com.example.SemilleroTest.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;

    @GetMapping("/{numInvoice}/consult-value")
    public double consultInvoiceValue(@PathVariable Long numInvoice) {
        return invoiceService.consultInvoice(numInvoice);
    }

}

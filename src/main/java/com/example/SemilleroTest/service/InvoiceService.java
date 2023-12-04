package com.example.SemilleroTest.service;


import com.example.SemilleroTest.model.Details;
import com.example.SemilleroTest.model.Invoice;
import com.example.SemilleroTest.repository.DetailsRepository;
import com.example.SemilleroTest.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private DetailsRepository detailsRepository;

    public double consultInvoice(Long numInvoice) {
        Invoice invoice = invoiceRepository.findById(numInvoice).orElseThrow(() -> new RuntimeException("Factura no encontrada"));

        List<Details> detailsInvoice = detailsRepository.findByInvoiceNumInvoice(numInvoice);

        double totalInvoice = detailsInvoice.stream()
                .mapToDouble(details -> details.getAmount() * details.getPrice())
                .sum();

        if (totalInvoice > 1000000 && detailsInvoice.size() >= 5) {
            double discount = 0.10 * totalInvoice;
            totalInvoice -= discount;
        }

        return totalInvoice;
    }

}

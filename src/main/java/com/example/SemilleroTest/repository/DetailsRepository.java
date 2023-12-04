package com.example.SemilleroTest.repository;

import com.example.SemilleroTest.model.Details;
import com.example.SemilleroTest.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.IntStream;

public interface DetailsRepository extends JpaRepository<Details, Long> {
    List<Details> findByInvoiceNumInvoice(Long numInvoice);

    IntStream stream();
}

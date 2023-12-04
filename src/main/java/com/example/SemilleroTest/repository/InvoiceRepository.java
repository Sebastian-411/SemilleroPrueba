package com.example.SemilleroTest.repository;

import com.example.SemilleroTest.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}

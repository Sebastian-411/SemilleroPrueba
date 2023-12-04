package com.example.SemilleroTest.repository;

import com.example.SemilleroTest.model.Invoice;
import com.example.SemilleroTest.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

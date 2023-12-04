package com.example.SemilleroTest.model;
import jakarta.persistence.*;


@Entity
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numDetail;

    @ManyToOne
    @JoinColumn(name = "idInvoice")
    private Invoice invoice;

    @ManyToOne
    @JoinColumn(name = "idProduct")
    private Product product;

    private int amount;
    private double price;

    public Long getNumDetail() {
        return numDetail;
    }

    public void setNumDetail(Long numDetail) {
        this.numDetail = numDetail;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

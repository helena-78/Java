package edu14.hw;

import java.time.LocalDate;

public class Product {
    private String manufactureCategory;
    private LocalDate manufactureDate;
    private double price;

    public Product(String manufactureCategory, LocalDate manufactureDate, double price) {
        this.manufactureCategory = manufactureCategory;
        this.manufactureDate = manufactureDate;
        this.price = price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Product{" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", manufactureDate=" + manufactureDate +
                ", price=" + price +
                '}';
    }
}

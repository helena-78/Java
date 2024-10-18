package edu14.hw;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductApp {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", LocalDate.of(2020, 1, 1), 3100));
        products.add(new Product("Phone", LocalDate.of(2021, 1, 1), 3100));
        products.add(new Product("Phone", LocalDate.of(2022, 1, 1), 3100));
        products.add(new Product("Phone", LocalDate.of(2024, 1, 1), 699.99));
        products.add(new Product("Phone", LocalDate.of(2020, 1, 1), 699.99));
        products.add(new Product("Laptop", LocalDate.of(2020, 1, 1), 699.99));
        products.add(new Product("Laptop", LocalDate.of(2020, 1, 1), 699.99));
        products.add(new Product("Laptop", LocalDate.of(2020, 1, 1), 3100));
        products.add(new Product("Laptop", LocalDate.of(2020, 1, 1), 3100));
        products.add(new Product("Laptop", LocalDate.of(2020, 1, 1), 699.99));
        products.add(new Product("Laptop", LocalDate.of(2020, 1, 1), 699.99));
        products.add(new Product("Laptop", LocalDate.of(2020, 1, 1), 699.99));
        products.add(new Product("Phone", LocalDate.of(2020, 1, 1), 699.99));
        products.add(new Product("Phone", LocalDate.of(2024, 1, 1), 699.99));
        products.add(new Product("Phone", LocalDate.of(2024, 1, 1), 3100));
        products.add(new Product("Phone", LocalDate.of(2020, 1, 1), 699.99));
        products.add(new Product("Phone", LocalDate.of(2024, 1, 1), 3100));
        products.add(new Product("Phone", LocalDate.of(2020, 1, 1), 699.99));
        products.add(new Product("Phone", LocalDate.of(2020, 1, 1), 699.99));
        products.add(new Product("Phone", LocalDate.of(2020, 1, 1), 699.99));

        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getManufactureCategory().equals("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getManufactureDate().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();
        filteredProducts.forEach(System.out::println);
    }
}

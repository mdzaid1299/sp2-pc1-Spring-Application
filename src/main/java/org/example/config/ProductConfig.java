package org.example.config;

import org.example.domain.Product;
import org.springframework.context.annotation.Bean;

public class ProductConfig {
    @Bean("product1")
    public Product getProduct1() {
        return new Product(14, "Santro", "White");
    }

    @Bean("product2")
    public Product getProduct2() {
        return new Product(60, "Eagle 33", "Black");
    }
}

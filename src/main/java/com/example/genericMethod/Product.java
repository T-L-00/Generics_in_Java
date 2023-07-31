package com.example.genericMethod;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Product {
    private String name;
    private double price;

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return " Product{" +
                " name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
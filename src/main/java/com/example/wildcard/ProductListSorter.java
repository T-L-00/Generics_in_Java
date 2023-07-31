package com.example.wildcard;

import com.example.genericMethod.Product;

import java.util.Comparator;
import java.util.List;


public class ProductListSorter {

    private ProductListSorter(){}

    public static void sortProductsByPrice(List<? extends Product> productList) {
        productList.sort(Comparator.comparingDouble(Product::getPrice));
    }
}

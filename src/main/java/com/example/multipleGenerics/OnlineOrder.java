package com.example.multipleGenerics;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;


/**
 * Represents an online order placed by a customer for a list of products with a total amount.
 *
 * @param <T> The type of customer.
 * @param <U> The type of product.
 * @param <V> The type of order total.
 */
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class OnlineOrder <T, U, V> {

    private T customer;
    private List<U> orderedItems;
    private V orderTotal;

    public T getCustomer() {
        return customer;
    }

    public List<U> getOrderedItems() {
        return orderedItems;
    }

    public V getOrderTotal() {
        return orderTotal;
    }
}

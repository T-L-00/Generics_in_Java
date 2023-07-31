package com.example.genericMethod;

import java.util.List;

/**
 * Finds the most expensive item in an online store.
 *
 */
public class OnlineStore {

    private OnlineStore(){}

    // Generics tip for a method - Finding the most expensive and cheapest item in an online store.
    public static <T extends Product> T findMostExpensiveItem (List<T> items) {
        if (items == null || items.isEmpty()) {
            return null;
        }

        T mostExpensiveItem = items.get(0);
        for (T item : items) {
            if (item.getPrice() > mostExpensiveItem.getPrice()) {
                mostExpensiveItem = item;
            }
        }
        return mostExpensiveItem;
    }

    public static <T extends Product> T findCheapestItem(List<T> items) {
        if (items == null || items.isEmpty()) {
            return null;
        }

        T cheapestItem = items.get(0);
        for (T item : items) {
            if (item.getPrice() < cheapestItem.getPrice()) {
                cheapestItem = item;
            }
        }
        return cheapestItem;
    }
}

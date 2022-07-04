package com.spdu.service;

import com.spdu.model.Order;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

public interface ShoppingListService {

    List<Order> getShoppingList(List<Integer> recipeIds);

    List<Order> getSortedShoppingList(List<Order> orders);

    BigDecimal getTotals(List<Order> orders);
}
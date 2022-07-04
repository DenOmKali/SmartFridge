package com.spdu.service;

import com.spdu.model.Order;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

public interface PrintService {

    void print(List<Order> sortedShoppingList, BigDecimal totals);
}

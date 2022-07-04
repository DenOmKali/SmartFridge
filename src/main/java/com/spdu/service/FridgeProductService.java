package com.spdu.service;

import com.spdu.model.FridgeProduct;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FridgeProductService {

    List<FridgeProduct> getAll();
}

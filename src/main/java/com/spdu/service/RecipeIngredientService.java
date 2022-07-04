package com.spdu.service;

import com.spdu.model.FridgeProduct;
import com.spdu.model.RecipeIngredient;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RecipeIngredientService {

    List<RecipeIngredient> get(List<Integer> recipeIds);
}

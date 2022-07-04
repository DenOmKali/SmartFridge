package com.spdu.service;

import com.spdu.model.Recipe;
import com.spdu.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RecipeService {

    List<Recipe> get(List<Integer> ids);

}

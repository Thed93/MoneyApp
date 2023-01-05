package com.example.moneyapp.services.Impl;

import com.example.moneyapp.model.Recipe;
import com.example.moneyapp.services.RecipeService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RecipeServiceImpl implements RecipeService {
    private Map<Integer, Recipe> recipes = new HashMap<>();

    private int id;

    @Override
    public Recipe addRecipe (Recipe recipe) {
        recipes.put(id, recipe);
        id++;
        return recipe;
    }
    @Override
    public Recipe getRecipeById (int recipeID) {
        return recipes.get(recipeID);
    }
}

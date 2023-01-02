package com.example.moneyapp.services;

import com.example.moneyapp.model.Recipe;

import java.util.HashMap;
import java.util.Map;

public class RecipeService {

    private Map <Integer, Recipe> recipes = new HashMap<>();

    private int id;

    public Recipe addRecipe (Recipe recipe) {
        recipes.put(id, recipe);
        id++;
        return recipe;
    }

    public Recipe getRecipeById (int recipeID) {
        return recipes.get(recipeID);
    }

}

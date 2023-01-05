package com.example.moneyapp.services;

import com.example.moneyapp.model.Recipe;

import java.util.HashMap;
import java.util.Map;

public interface RecipeService {

    public Recipe addRecipe (Recipe recipe);


    public Recipe getRecipeById (int recipeID);

}

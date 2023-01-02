package com.example.moneyapp.services;

import com.example.moneyapp.model.Ingredient;

import java.util.HashMap;
import java.util.Map;

public class IngredientService {

    private Map<Integer, Ingredient> ingredients = new HashMap<>();
    private int id = 1;

    public Ingredient addIngredient(Ingredient ingredient) {
        ingredients.put(id, ingredient);
        id++;
        return ingredient;
    }

    public Ingredient getIngredientByID(int ingredientID) {
        return ingredients.get(ingredientID);
    }
}

package com.example.moneyapp.services.Impl;

import com.example.moneyapp.model.Ingredient;
import com.example.moneyapp.services.IngredientService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class IngredientServiceImpl implements IngredientService {
    private Map<Integer, Ingredient> ingredients = new HashMap<>();
    private int id = 1;

    @Override
    public Ingredient addIngredient(Ingredient ingredient) {
        ingredients.put(id, ingredient);
        id++;
        return ingredient;
    }

    @Override
    public Ingredient getIngredientByID(int ingredientID) {
        return ingredients.get(ingredientID);
    }
}

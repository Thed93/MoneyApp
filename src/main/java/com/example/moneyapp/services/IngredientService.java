package com.example.moneyapp.services;

import com.example.moneyapp.model.Ingredient;

import java.util.HashMap;
import java.util.Map;

public interface IngredientService {


    public Ingredient addIngredient(Ingredient ingredient);

    public Ingredient getIngredientByID(int ingredientID);

}

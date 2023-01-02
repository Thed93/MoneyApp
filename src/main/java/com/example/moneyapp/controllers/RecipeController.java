package com.example.moneyapp.controllers;

import com.example.moneyapp.model.Recipe;
import com.example.moneyapp.services.RecipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping("/recipe/add")
    public ResponseEntity createRecipe (@RequestBody Recipe recipe) {
        Recipe createRecipe = recipeService.addRecipe(recipe);
        return ResponseEntity.ok(recipe);
    }

    @GetMapping("/recipe/get")
    public ResponseEntity getRecipeByID (@PathVariable int recipeID) {
        Recipe recipe = recipeService.getRecipeById(recipeID);
        if (recipe == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(recipe);
    }
}

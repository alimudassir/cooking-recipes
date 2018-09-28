package com.maverick.cookingrecipes.services;

import com.maverick.cookingrecipes.models.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}

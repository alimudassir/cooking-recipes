package com.maverick.cookingrecipes.services;

import com.maverick.cookingrecipes.commands.RecipeCommand;
import com.maverick.cookingrecipes.models.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}

package com.maverick.cookingrecipes.repositories;

import com.maverick.cookingrecipes.models.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}

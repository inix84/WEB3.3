package me.shulinina.web33.services;
import me.shulinina.web33.model.Recipe;

public interface RecipeService {
    void addRecipe(Recipe recipe);
    Recipe getRecipeById(int id);
}
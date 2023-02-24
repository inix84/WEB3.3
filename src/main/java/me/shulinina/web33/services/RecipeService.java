package me.shulinina.web33.services;
import me.shulinina.web33.model.Recipe;
public interface RecipeService {
    long addRecipe(Recipe recipe);
    long getRecipe(Recipe recipe);
    Recipe getRecipe(long id);
}
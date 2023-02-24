package me.shulinina.web33.services;
import me.shulinina.web33.model.Ingredient;

public interface IngredientService {
    long addIngredient(Ingredient ingredient);

    long getIngredient(Ingredient ingredient);

    Ingredient getIngredient(long id);
}
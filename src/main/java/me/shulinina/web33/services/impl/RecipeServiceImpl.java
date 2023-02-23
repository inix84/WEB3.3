package me.shulinina.web33.services.impl;
import me.shulinina.web33.model.Recipe;
import me.shulinina.web33.services.RecipeService;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
@Service
public class RecipeServiceImpl implements RecipeService {
    private static int Id = 0;
    private final Map<Integer, Recipe> mapRecipe = new HashMap<>();

    @Override
    public void addRecipe(Recipe recipe) {       //метод добавление рецепта
        mapRecipe.put(Id++, recipe);
    }
    @Override
    public Recipe getRecipeById(int id) {       //метод получение рецепта
        if (mapRecipe.containsKey(id)) {
            return mapRecipe.get(id);
        } else {
            throw new RuntimeException("Не удалось получить рецепт");
        }
    }
}
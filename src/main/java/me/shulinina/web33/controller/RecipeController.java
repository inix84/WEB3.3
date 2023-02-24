package me.shulinina.web33.controller;
               import me.shulinina.web33.model.Recipe;
               import me.shulinina.web33.services.RecipeService;
               import org.springframework.http.ResponseEntity;
               import org.springframework.web.bind.annotation.*;
               import org.springframework.web.bind.annotation.RestController;
               import org.springframework.web.bind.annotation.GetMapping;
               import org.springframework.web.bind.annotation.PostMapping;
@RestController
@RequestMapping("/recipes")
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
         @PostMapping
    public ResponseEntity<Long>addRecipe(@RequestBody Recipe recipe){   //Добавление нового рецепта
        long id =  recipeService.addRecipe(recipe);
        return ResponseEntity.ok(id);
    }
            @GetMapping("/{id}")
    public ResponseEntity<Recipe>getRecipeById(@PathVariable long id){ //Получение рецепта
        Recipe recipe = recipeService.getRecipe(id);
        if (recipe==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(recipe);
    }
}
package me.shulinina.web33.controllers;
               import me.shulinina.web33.model.Recipe;
               import me.shulinina.web33.services.RecipeService;
               import org.springframework.http.ResponseEntity;
               import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/recipe")
public final class RecipeController {
    @GetMapping("/")
    public String helloWorld() {
        return "Добро пожаловать!";
    }
    private RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
    @GetMapping("/get")
    public ResponseEntity<Recipe> getRecipe(@RequestParam int id) {
        return ResponseEntity.ok(recipeService.getRecipeById(id));
    }
    @GetMapping("/")
    public ResponseEntity<Recipe> postRecipe(@RequestBody Recipe recipe){
        recipeService.addRecipe(recipe);
        return ResponseEntity.ok(recipe);
    }
}
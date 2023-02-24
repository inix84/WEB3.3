package me.shulinina.web33.controller;
               import me.shulinina.web33.model.Recipe;
               import me.shulinina.web33.services.RecipeService;
               import org.springframework.http.ResponseEntity;
               import org.springframework.web.bind.annotation.*;
               import org.springframework.web.bind.annotation.RestController;
               import org.springframework.web.bind.annotation.GetMapping;
               import org.springframework.web.bind.annotation.RequestParam;
               import org.springframework.web.bind.annotation.PostMapping;
@RestController
@RequestMapping("/recipe")
public class RecipeController {
     private RecipeService recipeService;
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
    @GetMapping("/get")
    public ResponseEntity<Recipe> getRecipe(@RequestParam int id) {
        return ResponseEntity.ok(recipeService.getRecipeById(id));
    }
    @PostMapping("/")
    public ResponseEntity<Recipe> postRecipe(@RequestBody Recipe recipe){
        recipeService.addRecipe(recipe);
        return ResponseEntity.ok(recipe);
    }
}
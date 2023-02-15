package User;
import Pantry.FoodItem;
import Pantry.Ingredient;
import Pantry.Stock;
import Recipe.Recipe;
import Recipe.RecipeBook;

import java.util.ArrayList;
import java.util.List;

public class User {
  String username;
  String password;
  Stock stock;
  RecipeBook recipeBook;
  Boolean subscribed; //Paying customer

  //Register
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.stock = new Stock();
        this.recipeBook = new RecipeBook();
        this.subscribed = false;
    }

  //TODO: Functions to write
    // add to stock
    // remove from stock
    // edit from stock
    // search from stock
    // add to recipe list
    // remove from recipe list
    // edit from recipe list
    // search from recipe list


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username=username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password=password;
  }

  public Stock getStock() {
    return stock;
  }

  public void setStock(Stock stock) {
    this.stock=stock;
  }

  public RecipeBook getRecipeBook() {
      if(recipeBook == null) {
          recipeBook = new RecipeBook();
      }
    return recipeBook;
  }

  public void setRecipeBook(RecipeBook recipeBook) {
    this.recipeBook=recipeBook;
  }

  public Boolean getSubscribed() {
    return subscribed;
  }

  public void setSubscribed(Boolean subscribed) {
    this.subscribed=subscribed;
  }

  public void addToStock(FoodItem item) {
      if(stock == null) {
          stock = new Stock();
      }
      stock.addItem(item);
  }

  public List<Recipe> getRecipesUserCanMake() {
      List<Recipe> recipes = new ArrayList<Recipe>();
      for(Recipe recipe : recipeBook.getRecipeList()) {
            for(FoodItem ingredient : recipe.getIngredients()) {
                if(!stock.inStock(ingredient)) {
                    break;
                }
                recipes.add(recipe);
            }
      }
      return recipes;
  }
}

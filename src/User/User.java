package User;
import Pantry.Stock;
import Recipe.RecipeBook;

public class User {
  String username;
  String password;
  Stock stock;
  RecipeBook recipeBook;

  //Register
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.stock = new Stock();
        this.recipeBook = new RecipeBook();
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


}
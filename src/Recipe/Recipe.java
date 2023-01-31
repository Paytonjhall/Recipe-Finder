package Recipe;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    //This class will be what we use to keep track of all the recipes
    //We will be saving it out using json and loading back into it the same way.

    String name;
    String instructions;
    String time;
    List<String> ingredients;

    public Recipe(String name, String instructions, String time, List<String> ingredients) {
        this.name = name;
        this.instructions = instructions;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getTime() {
        return time;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}

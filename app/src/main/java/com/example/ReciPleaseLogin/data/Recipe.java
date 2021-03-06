package com.example.ReciPleaseLogin.data;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import static com.example.ReciPleaseLogin.data.DB.pushRecipeName;

public class Recipe {

    public String owner;
    public String recipe_name;
    public String description;
    public Date posted;
    public List<String> ingredients;
    public List<String> instructions;
    public List<String> instruction_pics;
    public int num_ingredients;
    public List<String> tags;
    public List<String> likers;
    public int num_likers;
    public boolean premium;
    public Messages comments;




    public Recipe(){
        ingredients=new Vector<String>();
        instructions= new Vector<String>();
        instruction_pics= new Vector<String>();
        tags=new Vector<String>();
        likers =new Vector<String>();

    }

    public Recipe(String recipe_name, String description, List<String> ingredients)
    {
        this.recipe_name = recipe_name;
        this.description = description;
        this.ingredients = ingredients;
    }


    public String getOwner(){
        return owner;
    }

    public String getRecipe_name()
    {
        return recipe_name;
    }
    public String getDescription() { return description; }
    public List<String> getinstructionPictures() { return instruction_pics; }
    public Date getPosted()
    {
        return posted;
    }
    public List<String> getIngredients()
    {
    return ingredients;
    }
    public List<String> getInstructions()
    {
    return instructions;
    }
    public int getNum_ingredients()
    {
return num_ingredients;
    }
    public List<String> getTags()
    {
return tags;
    }
    public List<String> getLikers()
    {
return likers;
    }
    public int getNum_likers()
    {
return num_likers;
    }
    public boolean getPremium()
    {
return premium;
    }
    public Messages getComments()
    {
return comments;
    }


    public void updateDB(){
        DB.getInstance().pushRecipeName(recipe_name);
        DB.getInstance().pushIngredients(recipe_name, ingredients);
        DB.getInstance().pushDescription(recipe_name, description);
        DB.getInstance().pushInstructions(recipe_name, instructions);
        DB.getInstance().pushTags(recipe_name, tags);

    }
/*
    //fetch new data
    public void updateView(){
        DB.pull(this);
    }
*/


}

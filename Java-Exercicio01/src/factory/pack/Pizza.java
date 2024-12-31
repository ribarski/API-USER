package factory.pack;

import java.util.List;

public abstract class Pizza {

    protected List<Ingrediente> ingredients;

    protected Pizza(){

    }

    public List<Ingrediente> getIngredients(){
        return ingredients;
    }

    @Override
    public String toString(){
        return "Pizza{" +
                "Ingredientes" + ingredients +
                '}';
    }
}

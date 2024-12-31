package factory.pack;

import java.util.List;

public class PepperoniPizza extends Pizza {

    protected PepperoniPizza(){
        this.ingredients = List.of(
                new Ingrediente("Tomate"),
                new Ingrediente("Queijo"),
                new Ingrediente("Sal"),
                new Ingrediente("Orégano"),
                new Ingrediente("Cebola"),
                new Ingrediente("Calabresa")

        );
    }
}

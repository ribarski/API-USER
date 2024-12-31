package factory.pack;

import java.util.List;

public class ChocolatePizza extends Pizza {

    protected ChocolatePizza(){
        this.ingredients = List.of(
                new Ingrediente("Chocolate"),
                new Ingrediente("Creme de Leite"),
                new Ingrediente("Raspas de Chocolate Meio Amargo")
        );
    }
}

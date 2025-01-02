package factory.pack;

public class Ingrediente {

    private String name;

    private Ingrediente(){

    }
    protected Ingrediente(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Ingrediente{" +
                "name='" + name + '\'' +
                '}';

    }
}

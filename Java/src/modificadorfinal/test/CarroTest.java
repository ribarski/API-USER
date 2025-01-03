package modificadorfinal.test;

import modificadorfinal.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.getComprador().setNome("Kuririn");
        System.out.println(c.getComprador());
    }
}

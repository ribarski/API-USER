package interfaces.test;

import interfaces.classes.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto p = new Produto("Note", 4.0, 3000.0);
        p.calculaImposto();
        p.calculaFrete();
        System.out.println(p);
    }
}

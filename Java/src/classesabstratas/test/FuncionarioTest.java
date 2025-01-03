package classesabstratas.test;

import classesabstratas.classes.Funcionario;
import classesabstratas.classes.Gerente;
import classesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Eduardo Scalco", "20102-2", 2000.0, 5000);
        Gerente g = new Gerente("Eduardo Ribarski", "20102-2", 2000.0);;
        v.calculaSalario();
        g.calculaSalario();
        System.out.println(v);
        System.out.println(g);

    }
}

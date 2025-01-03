package sobrescrita.test;

import sobrescrita.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Eduardo Ribarski");
        p.setIdade(25);
        System.out.println(p);

    }
}

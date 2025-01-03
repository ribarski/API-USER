package sobrecargametodos.test;

import sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Eduardo", "111.222.333-44", 4.500, "112233-4");
        Funcionario funcionario2 = new Funcionario();
        funcionario.imprime();
    }
}

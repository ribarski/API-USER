package polimorfismo;

public class Vendedor extends PessoaFisica {

    public Vendedor(String nome, int idade, Integer cpf) {
        super(nome, idade, cpf);
    }

    @Override
    public void receberSalario() {
        System.out.println("Salario com comissão");

    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf=" + cpf +
                '}';
    }
}

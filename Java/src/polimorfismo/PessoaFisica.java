package polimorfismo;

public class PessoaFisica extends Pessoa {

    public PessoaFisica(String nome, int idade, Integer cpf) {
        super(nome, idade, cpf);
    }

    @Override
    public void receberSalario() {
        System.out.println(nome + " Salario sem imposto");
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf=" + cpf +
                '}';
    }
}

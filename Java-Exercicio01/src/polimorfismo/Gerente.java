package polimorfismo;

public class Gerente extends PessoaJuridica {

    public Gerente(String nome, int idade, Integer cpf, Integer cnpj) {
        super(nome, idade, cpf, cnpj);
    }

    public void comissao (double valor){
        if (valor > 100.0) {
            valor = valor * 0.05;
            System.out.println("Valor total da comissão: " + valor);

        } else {
            System.out.println("Voce não tem comissão");
        }
    }

    public void comissao (String produto) {
        if (produto.equals("Computador"))  {
            System.out.println("Pagar comissao");
        } else {
            System.out.println("Sem comissao");
        }

    }

    @Override
    public String toString() {
        return "Gerente{" + super.toString()+
                "\n nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf=" + cpf +
                '}';
    }
}

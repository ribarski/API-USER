package polimorfismo;

public class PessoaJuridica extends Pessoa {
    private Integer cnpj;

    public PessoaJuridica(String nome, int idade, Integer cpf, Integer cnpj) {
        super(nome, idade, cpf);
        this.cnpj = cnpj;
    }

    @Override
    public void receberSalario() {
        System.out.println(nome + " Salario com imposto");
    }

    public void emiteNota(){
        System.out.println("Emitindo nota");
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj=" + cnpj +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf=" + cpf +
                '}';
    }
}

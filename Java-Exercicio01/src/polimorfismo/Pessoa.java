package polimorfismo;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected Integer cpf;

    public Pessoa(String nome, int idade, Integer cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public abstract void receberSalario();

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

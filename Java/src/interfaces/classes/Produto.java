package interfaces.classes;

public class Produto implements Tributavel, Transportavel{
    private String nome;
    private Double peso;
    private Double preco;
    private Double preFinal;
    private Double valorFrete;

    @Override
    public void calculaFrete(){
    this.valorFrete =  this.preco / peso * 0.1;
    }

    @Override
    public void calculaImposto() {
        preFinal = this.preco + (this.preco * IMPOSTO);
    }

    public Produto(String nome, Double peso, Double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", preco=" + preco +
                ", preFinal com Imposto=" + preFinal +
                ", valorFrete=" + valorFrete +
                '}';
    }

    public Double getPreFinal() {
        return preFinal;
    }

    public Double getValorFrete() {
        return valorFrete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

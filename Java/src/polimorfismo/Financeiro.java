package polimorfismo;

public class Financeiro implements Banco{
    private int conta;
    private int valor;

    public Financeiro(int conta) {
        this.conta = conta;
        this.valor = 0;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }


    @Override
    public void pagar() {
        System.out.println("pagou "+ valor + "Para a conta" + conta);
    }


    @Override
    public String toString() {
        return "Financeiro{" +
                "conta=" + conta +
                ", valor=" + valor +
                '}';
    }
}

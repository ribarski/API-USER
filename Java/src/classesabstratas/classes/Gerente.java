package classesabstratas.classes;

public class Gerente extends Funcionario {
    public Gerente (){

    }
    public Gerente(String nome, String clt, Double salario) {
        super(nome, clt, salario);


    }
    @Override
    public void calculaSalario(){
        this.salario = salario + (salario * 0.2);
    }


}

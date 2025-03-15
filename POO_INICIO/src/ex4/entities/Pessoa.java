package ex4.entities;

public class Pessoa {
    public String nome;
    public double salarioBruto;
    public double imposto;
    public double porcentagem;

    public double SalarioLiquido(){
        return salarioBruto - imposto;
    }

    public void AumentarSalario(double porcentagem){
        salarioBruto += salarioBruto * porcentagem / 100;
    }
}

package ex4;

import ex4.entities.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Malu";
        pessoa.salarioBruto = 6000.00;
        pessoa.imposto = 1000.00;

        System.out.println(pessoa.nome + ", R$ " + pessoa.SalarioLiquido());

        pessoa.AumentarSalario(10.0);

        System.out.println("Pós aumento: ");
        System.out.println(pessoa.nome + ", R$ " + pessoa.SalarioLiquido());
    }
}

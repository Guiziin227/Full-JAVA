package aula04_polimorfismo;

import aula04_polimorfismo.entities.Funcionario;
import aula04_polimorfismo.entities.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();
        System.out.println("Digite quantos funcionarios você quer");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Funcionario #" + (i + 1));
            sc.nextLine();
            System.out.println("É terceirizado? (s/n)");
            char escolha = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Horas trabalhadas");
            int horas = sc.nextInt();
            System.out.println("Valor por hora");
            double valorPorHora = sc.nextDouble();
            if (escolha == 's') {
                System.out.println("Gastos adicionais");
                double gastos = sc.nextDouble();
                Funcionario funcionario = new FuncionarioTerceirizado(name, horas, valorPorHora, gastos);
                list.add(funcionario);
            } else {
                Funcionario funcionario = new Funcionario(name, horas, valorPorHora);
                list.add(funcionario);
            }
        }

        for (Funcionario f : list) {
            Double salario = f.payment();
            System.out.println(f.getName() + " -  R$" + salario);
        }
    }
}

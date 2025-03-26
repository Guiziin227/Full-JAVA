package ex02;

import ex02.entities.Contribuintes;
import ex02.entities.PessoaFisica;
import ex02.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuintes> list = new ArrayList<>();

        System.out.println("Quantos irá cadastrar");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++){
            System.out.println("Cadastro #" + (i+1));
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Renda Anual: ");
            double rendaAnual = sc.nextDouble();
            System.out.println("(f/j)");
            char escolha = sc.next().charAt(0);

            if (escolha == 'f'){
                System.out.println("Quanto foi gasto em saude?");
                double saude = sc.nextDouble();
                Contribuintes c = new PessoaFisica(name,rendaAnual,saude);
                list.add(c);
            } else {
                System.out.println("Quantos funcionarios voce tem?");
                int func = sc.nextInt();
                list.add(new PessoaJuridica(name,rendaAnual,func));
            }
        }

        for(Contribuintes cb: list){
            System.out.println(cb.getName() + ": $" + cb.imposto());
        }

        double sum = 0.0;
        for(Contribuintes cb : list){
            sum += cb.imposto();
        }

        System.out.println("Soma total dos impostos: $" + sum);
    }
}

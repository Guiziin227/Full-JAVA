package ex4;

import ex4.entities.Pessoa;

import javax.xml.transform.Source;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serão cadastradas?");
        int n = sc.nextInt();

        Pessoa[] p = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da pessoa %d",i+1);
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            p[i] = new Pessoa(nome,idade,altura);
        }

        double media = 0.0;
        for (Pessoa pessoa : p) {
            media += pessoa.getAltura();
        }
        media = media/n;
        System.out.printf("Altura média: %.2f%n",media);


        System.out.println("Pessoas com menos de 16 anos:");
        int count = 0;
        for (Pessoa pessoa : p) {
            if (pessoa.getIdade() < 16) {
                count += 1;
            }
        }

        double percent = (double) count/n * 100;
        System.out.printf("%.1f%% de pessoas com menos de 16 anos%n",percent);
        for (Pessoa pessoa : p) {
            if (pessoa.getIdade() < 16) {
                System.out.println(pessoa.getNome());
            }
        }
        sc.close();
    }
}

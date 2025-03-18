package aula02_vetores;

import aula02_vetores.entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Products[] products = new Products[n];

        for (int i = 0; i < products.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            Double preco = sc.nextDouble();
            products[i] = new Products(nome, preco);
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += products[i].getPrice();
        }
        double media = soma / n;
        System.out.printf("Média de preços: %.2f%n", media);

        sc.close();
    }
}

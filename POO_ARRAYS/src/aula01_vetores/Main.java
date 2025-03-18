package aula01_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Digite o tamanho do vetor: ");
        double[] vetor = new double[n];

        System.out.println("Digite os valores do vetor: ");
        for(int i = 0; i < n; i++) {
            System.out.println("Digite o valor " + (i + 1) + ": ");
            vetor[i] = sc.nextDouble();
        }

        double media = 0;
        for(int i = 0; i < n; i++) {
            media += vetor[i];
        }
        media /= n;
        System.out.println("Média: " + media);

        sc.close();
    }
}

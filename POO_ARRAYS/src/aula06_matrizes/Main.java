package aula06_matrizes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][]matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(matriz[i][j] + " ");
            }
        }

        System.out.println("Diagonal principal");
        int negativos = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.println(matriz[i][j]);
                }
                if (matriz[i][j] < 0) {
                    negativos++;
                }
            }
        }

        System.out.println("Numeros negativos" + negativos);

        sc.close();
    }
}

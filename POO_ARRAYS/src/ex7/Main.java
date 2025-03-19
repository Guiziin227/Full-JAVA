package ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tamanho");
        int tamanho = sc.nextInt();
        int [][]matriz = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.printf("%d\t",matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("Digite o numero que você quer visitar");
        int x = sc.nextInt();


        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Posição: x" + i + "y" + j);
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                    if (j < matriz[i].length-1) {
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if (i < matriz.length-1) {
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}

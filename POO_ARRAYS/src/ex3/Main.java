package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(vetor[i]%2==0){
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}

package ex2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos numeros você quer?");
        int n = input.nextInt();
        double[] numbers = new double[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        System.out.println("Soma: " + sum);
        double media = sum / n;
        System.out.println("Média: " + media);

        input.close();
    }
}

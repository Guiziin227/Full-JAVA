package ex6;

import ex6.calculator.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o raio: ");
        double radius = sc.nextDouble();

        System.out.printf("Circunferência: %.2f\n", Calculator.circumference(radius));
        System.out.printf("Volume: %.2f",Calculator.volume(radius));
    }
}

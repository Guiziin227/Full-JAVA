//Criando um problema de calcular areas de triangulos sem usar POO

package ex1_nopoo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        double xA, xB,xC, yA, yB, yC;

        System.out.println("Entre com as medidas do triângulo X: ");
        xA = ler.nextDouble();
        xB = ler.nextDouble();
        xC = ler.nextDouble();
        System.out.println("Entre com as medidas do triângulo Y: ");
        yA = ler.nextDouble();
        yB = ler.nextDouble();
        yC = ler.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área: X");
        } else if(areaY > areaX) {
            System.out.println("Maior área: Y");
        } else {
            System.out.println("Áreas iguais");
        }

        ler.close();
    }
}
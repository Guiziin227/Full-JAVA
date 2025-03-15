package ex3;

import ex3.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle retangulo = new Rectangle();
        System.out.println("Entre com a largura e altura do retângulo: ");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        System.out.println("Área = " + retangulo.area());
        System.out.println("Perímetro = " + retangulo.perimeter());
        System.out.println("Diagonal = " + retangulo.diagonal());
    }
}

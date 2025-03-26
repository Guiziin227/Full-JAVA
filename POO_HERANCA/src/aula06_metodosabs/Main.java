package aula06_metodosabs;

import aula06_metodosabs.entities.Circle;
import aula06_metodosabs.entities.Retangle;
import aula06_metodosabs.entities.Shape;
import aula06_metodosabs.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of shapes: ");

        List<Shape> list = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i<n;i++){
            System.out.println("Shape #" + i + " data: ");
            System.out.println("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.println("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r'){
                System.out.println("Width: ");
                double width = sc.nextDouble();
                System.out.println("Height: ");
                double height = sc.nextDouble();
                Shape sh = new Retangle(color,width,height);
                list.add(sh);
            } else {
                System.out.println("Radius: ");
                double radius = sc.nextDouble();
                Shape sh = new Circle(color,radius);
                list.add(sh);
            }
        }

        System.out.println();

        System.out.println("SHAPE AREAS: ");

        for (Shape shape : list){
            System.out.println(shape.getColor());
            System.out.println(shape.area());
        }

        sc.close();
    }
}

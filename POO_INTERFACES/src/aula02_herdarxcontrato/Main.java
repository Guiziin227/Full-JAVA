package aula02_herdarxcontrato;

import aula02_herdarxcontrato.model.entities.AbstractShape;
import aula02_herdarxcontrato.model.entities.Circle;
import aula02_herdarxcontrato.model.entities.Retangle;
import aula02_herdarxcontrato.model.entities.Shape;
import aula02_herdarxcontrato.model.enums.Color;




public class Main {
    public static void main(String[] args) {

        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Retangle(Color.WHITE, 2.0, 3.0);

        System.out.println("Circle area: " + s1.area() + " - Color: " + s1.getColor());
        System.out.println("Rectangle area: " + s2.area() + " - Color: " + s2.getColor());
    }
}

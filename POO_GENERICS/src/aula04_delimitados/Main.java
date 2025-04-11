package aula04_delimitados;

//Fazer um método para retornar as soma das areas de uma lista de figuras

import aula04_delimitados.model.entities.Retangle;
import aula04_delimitados.model.entities.Shape;
import aula04_delimitados.model.entities.Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> myNumbers = Arrays.asList(1.3, 2.49);
        List<Object> myObjects = new ArrayList<>();
        myObjects.add("Maria");

        copy(myInts, myObjects);
        copy(myNumbers, myObjects);

        for (Object obj : myObjects) {
            System.out.println(obj);
        }

//        List<Shape> list = new ArrayList<>();
//        list.add(new Retangle(3.0, 2.0));
//        list.add(new Triangle(2.0, 3.0));
//
//        List<Triangle> myTriangles = new ArrayList<>();
//        myTriangles.add(new Triangle(2.0, 3.0));
//        myTriangles.add(new Triangle(3.0, 4.0));
//        myTriangles.add(new Triangle(4.0, 5.0));
//
//        System.out.println("Total area: " + totalArea(myTriangles));



    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number num : source) {
            destiny.add((num));
        }
    }

//    public static double totalArea(List<? extends Shape> list) {
//        double sum = 0.0;
//        for (Shape shape : list) {
//            sum += shape.area();
//        }
//        return sum;
//    }
}

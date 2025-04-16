package aula04_function;

import aula04_function.model.entities.Product;
import aula04_function.model.entities.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 200.00));
        list.add(new Product("Jbl", 700.00));
        list.add(new Product("Tablet", 500.00));

        //list.stream().map(new UpperCaseName()).collect(Collectors.toList()).forEach(System.out::println); usando a classe UpperCaseName
        //list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList()).forEach(System.out::println); non static method
        //list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList()).forEach(System.out::println);  static method

        //Function<Product, String> function = p1 -> p1.getName().toUpperCase();
        list.stream().map(p1 -> p1.getName().toUpperCase()).collect(Collectors.toList()).forEach(System.out::println); // lambda expression
    }
}

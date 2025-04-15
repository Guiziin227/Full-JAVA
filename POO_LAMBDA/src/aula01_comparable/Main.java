package aula01_comparable;

import aula01_comparable.model.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));

//        Comparator<Product> comp = (p1, p2) ->
//                -p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

//        new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return -o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
//            }
//        };

        list.sort( (p1, p2) ->
                -p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product product : list) {
            System.out.println(product);
        }
    }
}
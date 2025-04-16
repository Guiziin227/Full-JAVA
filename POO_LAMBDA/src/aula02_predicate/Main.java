package aula02_predicate;

import aula02_predicate.model.entities.ProductPredicate;
import aula02_predicate.model.entities.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Products> list = new ArrayList<>();

        list.add(new Products("Tv", 900.0));
        list.add(new Products("Mouse", 200.0));
        list.add(new Products("Jbl", 700.0));
        list.add(new Products("Tablet", 500.0));

        //list.removeIf(new ProductPredicate()); "interface"
        //list.removeIf(Products::staticProductPredicate); static method
        //list.removeIf(Products::nonStaticProductPredicate); non static method

        //Predicate<Products> pred = p1 -> p1.getPrice() > 500;
        //list.removeIf(pred); lambda expression

        list.removeIf(p1 -> p1.getPrice() > 500); //lamba inline

        for(Products p : list){
            System.out.println(p);
        }

    }
}

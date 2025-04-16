package aula03_consumer;

import aula03_consumer.model.entities.PriceUpdate;
import aula03_consumer.model.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 200.00));
        list.add(new Product("Jbl", 700.00));
        list.add(new Product("Tablet", 500.00));

        //list.forEach(new PriceUpdate()); consumer interface
        //list.forEach(Product::nonStaticPriceUpdate); method reference non static
        //list.forEach(Product::staticPriceUpdate); method reference

        //Consumer<Product> consumer = p -> p.setPrice(p.getPrice() * 1.1);
        //list.forEach(consumer);

        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        list.forEach(System.out::println);
    }
}

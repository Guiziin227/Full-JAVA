package aula02_predicate.model.entities;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Products> {

    @Override
    public boolean test(Products product) {
        return product.getPrice() > 500;
    }
}

package aula01_generics.model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<Types> {

    private List<Types> list = new ArrayList<>();

    public void addValue(Types value) {
        list.add(value);
    }

    public Types first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[ ");
        for (Types integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println("]");
    }
}

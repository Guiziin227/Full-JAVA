package aula06_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");
        System.out.println("Tamanho do hashset: " + set.size());
        System.out.println(set.contains("Notebook"));

       // set.removeIf(x -> x.charAt(0) == 'T');

        for (String p : set) {
            System.out.println(p);
        }

        System.out.println("Tamanho do hashset: " + set.size());
        System.out.println("Ordenando o hashset:");

        List<String> list = new ArrayList<>();
        list.addAll(set);
        list.sort((c1, c2) -> c1.toString().compareTo(c2.toString()));
        for (String p : list) {
            System.out.println(p);
        }

        System.out.println("Limpando o hashset:");
        set.clear();
        System.out.println("Tamanho do hashset: " + set.size());
    }
}

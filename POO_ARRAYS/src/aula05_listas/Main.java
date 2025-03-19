package aula05_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // Declaração de uma lista de strings

        list.add("Malu");
        list.add("Guilherme");
        list.add("Pedro");
        list.add("Ingrid");
        list.add(2, "Biju");
        list.add("Ana");
        list.add("Arthur");
        list.add("Clenio");

        System.out.println("Tamanho da lista: " + list.size());
        for(String nome: list){
            System.out.println(nome);
        }

        System.out.println("Removendo elementos da lista");
                        //predicado lambda
        list.removeIf(x -> x.charAt(0) == 'P');
        for(String nome: list){
            System.out.println(nome);
        }

        System.out.println("Quem começa com a letra A");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String nome: result){
            System.out.println(nome);
        }
        System.out.println("Primeira ocorrência de quem começa com a letra A");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}

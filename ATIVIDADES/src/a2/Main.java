package a2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String mostFrequentWord(String[] words) {
        Map<String, Integer> wordCount = new HashMap<>();

        // Contar a frequência de cada palavra
        for(String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        String mostFrequent = null;

        int maxCount = 0;

        // Encontrar a palavra mais frequente

        for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        // Se houver um empate, retorna a primeira palavra encontrada

        if(mostFrequent != null) {
            return mostFrequent;
        }


        return "";
    }

    public static void main(String[] args) {
        // Teste o método mostFrequentWord
        // com um array de palavras


        String[] input = {"apple", "banana", "apple", "cherry", "banana", "apple"};
        System.out.println(mostFrequentWord(input)); // Deve imprimir "apple"
    }
}
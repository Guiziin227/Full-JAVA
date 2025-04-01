package aula03_filewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] lines = new String[]{
                "Bom dia",
                "Boa tarde",
                "Boa noite",
                "Tchau"
        };

        String path = "./text.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, false))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

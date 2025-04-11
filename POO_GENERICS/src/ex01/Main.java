package ex01;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        String path = "./POO_GENERICS/src/ex01/in.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write("biju" + " " + Instant.now());
            bw.newLine();
            bw.write("malu" + " " + Instant.now());
            bw.newLine();
            bw.write("gui" + " " + Instant.now());
            bw.newLine();
            bw.write("biju" + " " + Instant.now());
            bw.newLine();
            bw.write("gui" + " " + Instant.now());
            bw.newLine();
            bw.write("ana" + " " + Instant.now());
            bw.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] fields = line.split(" ");
                if (set.add(fields[0])) {
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Contagem usuário únicos: " + set.size());

    }
}

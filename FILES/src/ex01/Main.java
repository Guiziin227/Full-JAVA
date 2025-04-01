package ex01;

import ex01.model.entities.Product;


import java.io.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();


        System.out.println("File path");
        String filePath = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();

            while (line != null) {
                String[] palavras = line.split(",");
                String name = palavras[0];
                Double price = Double.parseDouble(palavras[1]);
                Integer quantity = Integer.parseInt(palavras[2]);

                Product p = new Product(name, price, quantity);
                list.add(p);
                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        Double[] valor = new Double[list.size()];
        int i = 0;

        for (Product p : list) {
            valor[i] = p.valor();
            i++;
        }

        new File("C:\\Users\\PC-Gamer\\Desktop\\Programacao\\FullJava" + "/subdir").mkdir();

        String wrPath = "C:\\Users\\PC-Gamer\\Desktop\\Programacao\\FullJava\\subdir\\out.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(wrPath))){
            for (Product p : list) {
                bw.write("Name: " + p.getName() + ", Value: " + p.valor());
                bw.newLine();
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }



    }
}

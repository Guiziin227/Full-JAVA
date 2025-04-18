package ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String path = "./POO_LAMBDA/src/ex01/in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> products = new ArrayList<>();

            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                products.add(new Product(name, price));

                // Sum the prices of all products


            }

            double avg = products.stream().map(Product::getPrice).reduce(0.0, Double::sum) / products.size();
            System.out.println(avg);


            Comparator<String> comp = (s1, s2) -> -s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = products.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(p -> p.getName()).sorted(comp)
                    .collect(Collectors.toList());

            names.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }

    }
}

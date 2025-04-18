package ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String path = "./POO_LAMBDA/src/ex02/in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Person> people = new ArrayList<>();

            String line;

            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                people.add(new Person(fields[0], fields[1], Double.parseDouble(fields[2])));
            }

            List<String> names = people.stream()
                    .filter(p -> p.getSalary() < 2000.0)
                    .map(Person::getName)
                    .collect(Collectors.toList());

            double sum = people.stream().filter(p -> p.getName().charAt(0) == 'M').collect(Collectors.summingDouble(Person::getSalary));

            System.out.println("Soma dos salarios comecando com M: " + sum);

            for (String p : names) {
                System.out.println(p);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

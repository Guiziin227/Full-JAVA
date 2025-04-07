package aula04_comparable;

import aula04_comparable.model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "./POO_INTERFACES/src/aula04_comparable/names.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv;
            while ((employeeCsv = br.readLine()) != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
            }
            Collections.sort(list);
            for (Employee s : list) {
                System.out.println(s.getName()+ " - " + s.getSalary());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

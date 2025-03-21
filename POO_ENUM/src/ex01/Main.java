package ex01;

import ex01.entities.Departament;
import ex01.entities.HourContract;
import ex01.entities.Worker;
import ex01.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);

        System.out.println("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.println("Name: ");
        String workerName = sc.nextLine();
        System.out.println("Level: ");
        String workerLevel = sc.nextLine();
        System.out.println("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary, new Departament(departmentName));

        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Enter contract #" + (i+1) + " data: ");
            System.out.println("Date (DD/MM/YYYY): ");
            Date date = sdf.parse(sc.nextLine());
            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(date, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        double income = worker.income(year, month);

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", income));


    }
}

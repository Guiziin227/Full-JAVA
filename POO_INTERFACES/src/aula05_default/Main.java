package aula05_default;

import aula05_default.model.services.BrazilInterestService;
import aula05_default.model.services.InterestService;
import aula05_default.model.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.printf("Payment after %d months: %.2f%n", months, payment);

        InterestService is2 = new UsaInterestService(1.0);
        double payment2 = is2.payment(amount, months);
        System.out.printf("Payment after %d months: %.2f%n", months, payment2);

        sc.close();
    }
}

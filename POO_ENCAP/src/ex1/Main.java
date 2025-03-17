package ex1;

import ex1.entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double value = 0.0;
        Bank account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account name: ");
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            value = sc.nextDouble();
            account = new Bank(number, name, value);
        } else {
            account = new Bank(number, name);
        }

        System.out.println("Account data:");
        System.out.println("Account number: " + account.getNumber());
        System.out.println("Account name: " + account.getName());
        System.out.println("Account balance: " + account.getValue());

        System.out.print("\nEnter a deposit value: ");
        value = sc.nextDouble();
        account.deposit(value);
        System.out.println("Updated account data:");
        System.out.println(account.toString());

        System.out.print("\nEnter a withdraw value: ");
        value = sc.nextDouble();
        account.withdraw(value);
        System.out.println("Updated account data:");
        System.out.println(account.toString());

        System.out.println("Digite seu novo nome: ");
        sc.nextLine();
        name = sc.nextLine();
        account.setName(name);
        System.out.println("Uptaded name account: " + account.getName());

        sc.close();
    }
}

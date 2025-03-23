package aula01_heranca;

import aula01_heranca.entities.BusinessAccount;

public class Main {
    public static void main(String[] args) {
         BusinessAccount account = new BusinessAccount(8010, "Bob Brown", 0.0, 500.0);
         System.out.println(account.getBalance());
         account.deposit(100.0);
         System.out.println(account.getBalance());
         account.withdraw(50.0);
         System.out.println(account.getBalance());
         account.loan(200.0);
         System.out.println(account.getBalance());
    }
}
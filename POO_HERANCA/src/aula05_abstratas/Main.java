package aula05_abstratas;

import aula05_abstratas.entities.Account;
import aula05_abstratas.entities.BusinessAccount;
import aula05_abstratas.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 1000.0, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 2000.0));
        list.add(new SavingsAccount(1005, "Bob", 1200.0, 0.01));
        list.add(new BusinessAccount(1003, "Ana", 5000.0, 2000.0));

        double sum = 0.0;
        for(Account a : list){
            sum += a.getBalance();
        }

        System.out.println(sum);

        for (Account a : list){
            a.deposit(10.0);
        }

        for (Account a: list){
            System.out.println(a.getBalance());
        }
    }
}

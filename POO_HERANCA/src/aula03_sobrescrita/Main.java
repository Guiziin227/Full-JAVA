package aula03_sobrescrita;

import aula03_sobrescrita.entities.Account;
import aula03_sobrescrita.entities.BusinessAccount;
import aula03_sobrescrita.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc1 = new Account(1234,"Gui",1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        acc1 = new SavingsAccount(1234,"Gui",1000.0,0.01);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        acc1 = new BusinessAccount(1234,"Gui",1000.0,500.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

    }
}

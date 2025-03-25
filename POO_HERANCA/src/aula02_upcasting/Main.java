package aula02_upcasting;

import aula02_upcasting.entities.Account;
import aula02_upcasting.entities.BusinessAccount;
import aula02_upcasting.entities.SavingAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);

        //DOWNCASTING

        BusinessAccount bacc1 = (BusinessAccount) acc2;
        bacc1.loan(100.0);

        //BusinessAccount bacc2 = (BusinessAccount) acc3;

        if(acc2 instanceof BusinessAccount){
            BusinessAccount bacc2 = (BusinessAccount) acc2;
            bacc2.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingAccount){
            SavingAccount sacc2 = (SavingAccount) acc3;
            sacc2.updateBalance();
            System.out.println("Update!");
        }

        if(acc1 instanceof BusinessAccount){
            BusinessAccount bacc3 = (BusinessAccount) acc1;
            bacc3.loan(300.0);
            System.out.println("Account!");
        }

    }
}

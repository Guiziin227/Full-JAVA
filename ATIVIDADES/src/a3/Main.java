package a3;

import a3.expections.DomainExceptions;
import a3.model.Customer;
import a3.service.BankAccount;
import a3.service.CheckingAccount;
import a3.service.SavingsAccount;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SavingsAccount b1 = new SavingsAccount(1234, 1000.0);
        SavingsAccount b2 = new SavingsAccount(4234, 2000.0);
        CheckingAccount c1 = new CheckingAccount(6234, 500.0);

        Customer c = new Customer("Guilherme Weber");

        c.addAccount(b1);
        c.addAccount(b2);
        c.addAccount(c1);
        b1.deposito(200.0);
       c1.saque(100.0);
        b1.applyInterest();

        System.out.println("Contas do " + c.getName());
        for (BankAccount customer : c.getAccounts()) {
            System.out.println("Conta " + customer.getAccountType() + " " + customer.getNumeroConta() + " " + "Saldo: R$" + customer.getSaldo());
        }

        System.out.println(c.getTotalBalance());
    }
}

package a3.model;

import a3.service.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;

    private List<BankAccount> accounts;

    public String getName() {
        return name;
    }

    public List<BankAccount> getAccounts(){
        return accounts;
    }

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount conta){
        accounts.add(conta);
    }

    public double getTotalBalance(){
        double amount = 0.0;
        for (BankAccount a : accounts){
            amount += a.getSaldo();
        }

        return  amount;
    }
}

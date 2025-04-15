package a3.service;

import a3.expections.DomainExceptions;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(Integer numeroConta, Double saldo) {
        super(numeroConta, saldo);
    }

    @Override
    public void saque(Double amount) throws DomainExceptions {
        if (amount > saldo) {
            throw new DomainExceptions("Valor maior do que o saldo");
        } else if (amount > 200) {
            throw new DomainExceptions("Valor maior que o limite");
        } else {
            saldo -= amount;
        }
    }

    @Override
    public String getAccountType(){
        return "Corrente";
    }
}

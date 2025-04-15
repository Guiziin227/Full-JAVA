package a3.service;

import a3.expections.DomainExceptions;

public abstract class BankAccount {

    private Integer numeroConta;
    protected Double saldo;

    public BankAccount(Integer numeroConta, Double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void deposito(Double amount) {
        if (amount > 0){
            saldo += amount;
        }
    }

    public void saque(Double amount) throws DomainExceptions {
        if (amount > saldo) {
            throw new DomainExceptions("Valor maior do que o saldo");
        } else {
            saldo -= amount;
        }
    }

    public abstract String getAccountType();
}

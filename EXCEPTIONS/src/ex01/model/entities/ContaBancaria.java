package ex01.model.entities;

import aula02_personalizados.model.exceptions.DomainException;

public class ContaBancaria {

    private Integer numberAccount;
    private String holder;
    private Double initialBalance;
    private Double withdrawLimit;

    public ContaBancaria(){}

    public ContaBancaria(Integer numberAccount, String holder, Double initialBalance, Double withdrawLimit) {
        this.numberAccount = numberAccount;
        this.holder = holder;
        this.initialBalance = initialBalance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(Integer numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(Double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        initialBalance += amount;
    }

    public void withdraw(Double amount) throws DomainException{
        if (initialBalance < amount){
            throw new DomainException("Erro de withdraw, a retirada é maior do que o saldo da conta");
        }
        else if (withdrawLimit < amount ){
            throw new DomainException("Erro de withdraw, o saque é maior do que o limite");
        }
        else{
            initialBalance -= amount;
            System.out.println("Saque feito com sucesso!");
        }
    }
}

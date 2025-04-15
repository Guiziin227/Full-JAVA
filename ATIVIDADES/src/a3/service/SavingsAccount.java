package a3.service;

public class SavingsAccount extends BankAccount{

    private static final double JUROS = 5.0;

    public SavingsAccount(Integer numeroConta, Double saldo){
        super(numeroConta,saldo);
    }

    public double applyInterest(){
        setSaldo(saldo + (saldo * (JUROS/100)));
        return getSaldo();
    }

    @Override
    public String getAccountType() {
        return "Poupança";
    }
}

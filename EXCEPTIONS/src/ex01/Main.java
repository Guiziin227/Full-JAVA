package ex01;

import aula02_personalizados.model.exceptions.DomainException;
import ex01.model.entities.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ContaBancaria account = new ContaBancaria(1234,"Guilherme Weber",
                100.0, 500.0);

        try{
            System.out.println("Quanto você quer retirar da conta?");
            Double valor = sc.nextDouble();

            account.withdraw(valor);
        }catch (DomainException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

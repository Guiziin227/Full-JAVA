package petshop;

import petshop.model.exceptions.DomainExceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao petshop do gui");
        int escolha;
        try {
            do {
                System.out.println("Menu: ");
                System.out.println("1 - Cadastrar pet");
                System.out.println("2 - Alterar os dados do pet cadastrado");
                System.out.println("3 - Deletar um pet cadastrado");
                System.out.println("4 - Listar todos os pets cadastrados ");
                System.out.println("5 - Listar pets por algum critério (idade, nome, raça)");
                System.out.println("6 - Sair\n");

                escolha = sc.nextInt();
                if (escolha <= 0 || escolha > 6) {
                    System.out.println("Numero inválido");
                }

                switch (escolha) {
                    case 1:
                        System.out.println("Cadastro");
                        break;
                    case 2:
                        System.out.println("Alterar");
                        break;
                    case 3:
                        System.out.println("Deletar");
                        break;
                    case 4:
                        System.out.println("Listar");
                        break;
                    case 5:
                        System.out.println("Listar ordenado");
                        break;
                    case 6:
                        System.out.println("Saindo...");
                        break;
                }


            } while (escolha != 6);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            sc.next();
        }
    }
}
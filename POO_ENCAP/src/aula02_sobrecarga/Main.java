package aula02_sobrecarga;

import aula02_sobrecarga.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do produto: ");

        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Preço: ");
        double price = sc.nextDouble();

        Produto produto = new Produto(name, price);
        System.out.println("Dados do produto: " + produto);

        System.out.println("Digite o número de produtos a ser adicionado ao estoque: ");
        int quantity = sc.nextInt();
        produto.addProducts(quantity);
        System.out.println("Dados atualizados: " + produto);

        System.out.println("Digite o número de produtos a ser removido do estoque: ");
        quantity = sc.nextInt();
        produto.removeProducts(quantity);
        System.out.println("Dados atualizados: " + produto);
    }
}

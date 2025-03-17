/*
    Exercício 2:
    Ler dados de um produto em estoque (nome, preço e quantidade no estoque). Em seguida:
    - Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
    - Realizar uma entrada no estoque e mostrar novamente os dados do produto
    - Realizar uma saída no estoque e mostrar novamente os dados do produto
 */

package aula01;

import aula01.entities.Produto;

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
        System.out.print("Quantidade no estoque: ");
        int quantity = sc.nextInt();

        Produto produto = new Produto(name, price, quantity);
        System.out.println("Dados do produto: " + produto);

        System.out.println("Digite o número de produtos a ser adicionado ao estoque: ");
        quantity = sc.nextInt();
        produto.addProducts(quantity);
        System.out.println("Dados atualizados: " + produto);

        System.out.println("Digite o número de produtos a ser removido do estoque: ");
        quantity = sc.nextInt();
        produto.removeProducts(quantity);
        System.out.println("Dados atualizados: " + produto);
    }

}

/*
    Exercício 2:
    Ler dados de um produto em estoque (nome, preço e quantidade no estoque). Em seguida:
    - Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
    - Realizar uma entrada no estoque e mostrar novamente os dados do produto
    - Realizar uma saída no estoque e mostrar novamente os dados do produto
 */

package ex2;

import ex2.product.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product produto = new Product();

        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        produto.name = sc.nextLine();
        System.out.print("Preço: ");
        produto.price = sc.nextDouble();
        System.out.print("Quantidade no estoque: ");
        produto.quantity = sc.nextInt();

        //System.out.println("Dados do produto: " + produto.name + ", R$ " + produto.price + ", " + produto.quantity + " unidades, Total: R$ " + produto.totalValueInStock());
        System.out.println("Dados do produto: " + produto); //apos a criação do toString() no Product.java
        System.out.println("Digite o número de produtos a ser adicionado ao estoque: ");
        int quantity = sc.nextInt();
        produto.addProducts(quantity);
        //        int quantity = sc.nextInt();
        //        produto.quantity += quantity;
        //System.out.println("Dados atualizados: " + produto.name + ", R$ " + produto.price + ", " + produto.quantity + " unidades, Total: R$ " + produto.totalValueInStock());
        System.out.println("Dados atualizados: " + produto);
        System.out.println("Digite o número de produtos a ser removido do estoque: ");
        quantity = sc.nextInt();
        produto.removeProducts(quantity);
        //        quantity = sc.nextInt();
        //        produto.quantity -= quantity;
        //System.out.println("Dados atualizados: " + produto.name + ", R$ " + produto.price + ", " + produto.quantity + " unidades, Total: R$ " + produto.totalValueInStock());
        System.out.println("Dados atualizados: " + produto);
    }

}

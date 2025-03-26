package ex01;

import ex01.entities.ImportedProduct;
import ex01.entities.Product;
import ex01.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        System.out.println("Quantos produtos deseja cadastrar");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Produto #" + (i+1));
            System.out.println("Commom,imported,used(c,i,u)");
            sc.nextLine();
            char escolha = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            if (escolha == 'i'){
                System.out.println("Fee: ");
                double fee = sc.nextDouble();
                Product produto = new ImportedProduct(name,price,fee);
                list.add(produto);
            } else if(escolha == 'u'){
                System.out.println("Date the manufacture(dd/mm/yyyy)");
                Date date = sdf.parse(sc.nextLine());
                Product produto = new UsedProduct(name,price,date);
                list.add(produto);
            } else{
                Product produto = new Product(name,price);
                list.add(produto);
            }
        }

        System.out.println("Price tag: ");

        for (Product p : list){
            System.out.println(p.priceTag());
        }
        }
    }

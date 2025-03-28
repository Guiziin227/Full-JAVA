package aula01_trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        method();

        System.out.println("End of program");
    }

    public static void method(){
        System.out.println("***METHOD START***");

        method2();

        System.out.println("***METHOD END***");
    }

    public static void method2(){
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);

        try {
            String [] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e){
            System.out.println("Input error");
        }

        System.out.println("***METHOD2 END***");
        sc.close();
    }
}
package ex5;

import ex5.entities.Aluguel;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented?(max 10)");
        int n = sc.nextInt();
        Aluguel []rent = new Aluguel[10];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Rent #" + (i+1));
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Room: ");
            int room = sc.nextInt();
            rent[room] = new Aluguel(name,email,room);
        }

        for (Aluguel a : rent) {
            if (a != null) {
                System.out.println(a.getRoom() + ": " + a.getNome() + ", " + a.getEmail());
            }
        }

        sc.close();
    }
}

package aula01_interfaces;

import aula01_interfaces.model.entities.CarRental;
import aula01_interfaces.model.entities.Vehicles;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do carro: ");
        String model = sc.nextLine();
        System.out.print("Data e hora de retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), formatter);
        System.out.print("Data e hora de devolução (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), formatter);

        CarRental cr = new CarRental(start, finish, new Vehicles(model));

        System.out.print("Preço por hora: ");


        sc.close();
    }
}
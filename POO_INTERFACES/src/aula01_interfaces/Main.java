package aula01_interfaces;

import aula01_interfaces.model.entities.CarRental;
import aula01_interfaces.model.entities.Vehicles;
import aula01_interfaces.model.services.BrazilTaxService;
import aula01_interfaces.model.services.RentalService;

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

        System.out.println("Entre com o preço por hora:");
        double pricePerHour = sc.nextDouble();
        System.out.println("Entre com o preço por dia:");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour,pricePerDay,new BrazilTaxService());
        rentalService.processInvoice(cr);

        System.out.println("FATURA:");
        System.out.println("Pagamento basico: " + cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());

        sc.close();
    }
}
package aula02_personalizados;

import aula02_personalizados.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number: ");
        int roomNumber = sc.nextInt();
        System.out.println("Check-in date (dd/MM/yyyy): ");
        Date chekin = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/MM/yyyy): ");
        Date checkout = sdf.parse(sc.next());

        if (!checkout.after(chekin)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(roomNumber, chekin, checkout);
            System.out.println("Reservation: " + reservation);
            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.println("Check-in date (dd/MM/yyyy): ");
            chekin = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkout = sdf.parse(sc.next());


            String error = reservation.updateDates(chekin, checkout);

            if (error != null) {
                System.out.println(error);
            } else {
                System.out.println("Reservation: " + reservation);
            }

        }
        sc.close();
    }
}

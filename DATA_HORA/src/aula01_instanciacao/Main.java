package aula01_instanciacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-07-12");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-12T01:40:24");
        Instant d06 = Instant.parse("2022-07-12T01:40:24Z");
        Instant d07 = Instant.parse("2022-07-12T01:40:24-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2022", java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:40:24", java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        LocalDate d10 = LocalDate.of(1970, 1, 1);
        LocalDateTime d11 = LocalDateTime.of(1970, 1, 1, 0, 0, 0);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);

    }
}
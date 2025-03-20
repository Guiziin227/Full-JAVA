package aula02_ptexto;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-12");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-12T01:40:24");
        Instant d06 = Instant.parse("2022-07-12T01:40:24Z");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        System.out.println(d04.format(formatter));
        System.out.println(formatter.format(d04));

        System.out.println(d05.format(formatter2));
        System.out.println(formatter2.format(d05));

        System.out.println(formatter3.format(d06));

    }
}

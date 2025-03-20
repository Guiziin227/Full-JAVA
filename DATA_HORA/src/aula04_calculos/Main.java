package aula04_calculos;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-12");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-12T01:40:24");
        Instant d06 = Instant.parse("2022-07-12T01:40:24Z");

        LocalDate pastWeek = d04.minusWeeks(1);
        System.out.println(pastWeek);
        LocalDate nextWeek = d04.plusWeeks(1);
        System.out.println(nextWeek);

        LocalDateTime pastWeek2 = d05.minusWeeks(1);
        System.out.println(pastWeek2);
        LocalDateTime nextWeek2 = d05.plusWeeks(1);
        System.out.println(nextWeek2);

        Instant pastWeek3 = d06.minus(7, ChronoUnit.DAYS);
        System.out.println(pastWeek3);
        Instant nextWeek3 = d06.plusSeconds(60 * 60 * 24 * 7);
        System.out.println(nextWeek3);

        Duration duration = Duration.between(pastWeek.atTime(0,0), d04.atTime(0,0));
        System.out.println(duration.toDays());
    }
}

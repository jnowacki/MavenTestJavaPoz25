package pl.jnowacki;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        LocalDate localDate;
        LocalTime localTime;

        LocalDateTime localDateTime = LocalDateTime.of(2020, 4, 4, 14, 0);
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE));
        System.out.println("--------");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy MM dd HH:mm:ss");
        System.out.println(localDateTime.format(dateTimeFormatter));
        System.out.println("--------");

        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plus(5, ChronoUnit.DAYS)).getDays());
        System.out.println("--------");
        System.out.println(Duration.between(LocalDateTime.now(), LocalDateTime.now().plus(5, ChronoUnit.DAYS)).getSeconds());

        ZonedDateTime zonedDateTime = LocalDateTime.now().atZone(ZoneId.of("Europe/Belgrade"));
        System.out.println("--------");
        System.out.println(ZoneId.systemDefault());
        System.out.println("--------");
        System.out.println(ZoneId.getAvailableZoneIds());
        System.out.println("--------");
        System.out.println(
                LocalDateTime
                        .now()
                        .atZone(ZoneId.of("Europe/Belgrade"))
                        .withZoneSameInstant(ZoneId.of("Asia/Singapore")));
    }
}

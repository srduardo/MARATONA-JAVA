package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

// Datas

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 10, 18);
        LocalDate agora = LocalDate.now();

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear()); //ano bissexto
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(agora);
    }
}

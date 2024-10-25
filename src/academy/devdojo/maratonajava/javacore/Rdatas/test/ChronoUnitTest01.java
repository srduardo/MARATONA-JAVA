package academy.devdojo.maratonajava.javacore.Rdatas.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2004, Month.DECEMBER, 11, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Dias:" + ChronoUnit.DAYS.between(aniversario, now));
        System.out.println("Semanas:" + ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println("Meses:" + ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println("Anos:" + ChronoUnit.YEARS.between(aniversario, now));

    }
}

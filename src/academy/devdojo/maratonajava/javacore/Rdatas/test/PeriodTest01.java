package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfter2Years = LocalDate.now()
                .plusYears(2)
                .plusDays(7);

        System.out.println(Period.between(now, nowAfter2Years));
        System.out.println(Period.ofYears(7));
        System.out.println(Period.ofMonths(5));
        System.out.println(Period.ofWeeks(20));
        System.out.println(Period.ofDays(367));
    }
}

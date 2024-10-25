package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

// Classe voltada para medição e definição de tempo entre datas;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfter2Years = LocalDate.now()
                .plusYears(2)
                .plusDays(7);

        System.out.println(Period.between(now, nowAfter2Years));
        System.out.println(Period.ofYears(7));
        System.out.println(Period.ofMonths(5));
        int p = Period.ofWeeks(200).getDays();
        System.out.println(p);
        System.out.println(Period.ofDays(367));
        System.out.println(Period.between(now, now.plusDays(p)).getMonths());
        System.out.println(now.until(now.plusDays(p), ChronoUnit.MONTHS));
    }
}

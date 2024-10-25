package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfter7Years = LocalDateTime.now()
                .plusYears(7)
                .plusMinutes(8)
                .plusSeconds(56)
                .plusNanos(20);

        System.out.println(Duration.between(now, nowAfter7Years));

        LocalTime nowLocalTime = LocalTime.now();
        LocalTime nowLocalTimeAfter8Hours = LocalTime.now()
                .plusHours(8);

        System.out.println(Duration.between(nowLocalTime, nowLocalTimeAfter8Hours));

        System.out.println(Duration.ofDays(2));

        System.out.println(Duration.of(5, ChronoUnit.DAYS));
    }
}

package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        if (c.DAY_OF_WEEK == 7) {
            System.out.println("Sábado");
        }

        c.add(Calendar.MONTH, 2);
        Date date = c.getTime();

        System.out.println(date);
    }
}

package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Paraná' dd 'de' MMMM 'de' YYYY";
        SimpleDateFormat spf = new SimpleDateFormat(pattern);
        System.out.println(spf.format(new Date()));

        try {
            System.out.println(spf.parse("Paraná 19 de outubro de 2024"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}

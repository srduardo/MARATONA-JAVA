package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        // "format" = LocalDate -> String
        System.out.println();
        String formatDate1 = date.format(DateTimeFormatter.ISO_DATE);
        String formatDate2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String formatDate3 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(formatDate1);
        System.out.println(formatDate2);
        System.out.println(formatDate3);

        // "parse" = String = LocalDate
        System.out.println();
        LocalDate parse1 = LocalDate.parse("20241026", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);
        LocalDate parse2 = LocalDate.parse("2024-10-26", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse2);
        LocalDate parse3 = LocalDate.parse("2024-10-26", DateTimeFormatter.ISO_DATE);
        System.out.println(parse3);

        // "format" = LocalDateTime -> String
        System.out.println();
        LocalDateTime now = LocalDateTime.now();
        String formatDateTime1 = now.format(DateTimeFormatter.ISO_TIME);
        System.out.println(formatDateTime1);
        String formatDateTime2 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(formatDateTime2);
        String formatDateTime3 = now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(formatDateTime3);

        // Patterns:
        // dd/MM/yyyy (BR)
        // MM/dd/yyyy (EUA)
        // yyyy/MM/dd (JP)

        System.out.println();
        DateTimeFormatter dateTimeFormatterPattern = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.CANADA);
        String dateFormatPattern = LocalDate.now().format(dateTimeFormatterPattern);
        System.out.println(dateFormatPattern);
        LocalDate parsePattern = LocalDate.parse("26 October 2004", dateTimeFormatterPattern);
        System.out.println(parsePattern);
    }
}

package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "ITA");
        Locale localeFrench = new Locale("fr", "FRA");
        Locale localeFula = new Locale("ff", "FUL");
        Locale localeIndonesian = new Locale("id", "IND");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeFrench);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeFula);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeIndonesian);

        System.out.println(df1.format(calendar.getTime()));
        System.out.println(df2.format(calendar.getTime()));
        System.out.println(df3.format(calendar.getTime()));
        System.out.println(df4.format(calendar.getTime()));
    }
}

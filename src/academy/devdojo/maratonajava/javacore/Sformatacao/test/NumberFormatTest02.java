package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeItaly = Locale.ITALY;
        Locale localeFrench = Locale.FRENCH;
        Locale localeJp = Locale.JAPAN;

        NumberFormat[] nbf = new NumberFormat[4];
        nbf[0] = NumberFormat.getCurrencyInstance();
        nbf[1] = NumberFormat.getCurrencyInstance(localeFrench);
        nbf[2] = NumberFormat.getCurrencyInstance(localeItaly);
        nbf[3] = NumberFormat.getCurrencyInstance(localeJp);

        for (NumberFormat numberFormat : nbf) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(1_000.526));
        }
        String valor = "￥1,001";
        try {
            System.out.println(nbf[0].parse(valor));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}

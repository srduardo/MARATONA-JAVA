package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeItaly = Locale.ITALY;
        Locale localeFrench = Locale.FRENCH;
        Locale localeJp = Locale.JAPAN;

        NumberFormat[] nbf = new NumberFormat[4];
        nbf[0] = NumberFormat.getNumberInstance();
        nbf[1] = NumberFormat.getNumberInstance(localeFrench);
        nbf[2] = NumberFormat.getNumberInstance(localeItaly);
        nbf[3] = NumberFormat.getNumberInstance(localeJp);

        for (NumberFormat numberFormat : nbf) {
            System.out.println(numberFormat.format(1_000.526));
        }

    }
}

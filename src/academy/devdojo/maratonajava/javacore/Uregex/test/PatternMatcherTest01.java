package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba"; // Expressão regular
        String texto = "abababa";

        Pattern pattern = Pattern.compile(regex); // Compila a expressão regular para um pattern (padrão)
        Matcher matcher = pattern.matcher(texto); // Verifica se o texto é compatível com o padrão

        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");

        while (matcher.find()) {
            System.out.print(matcher.start() + " ");

        }
    }
}

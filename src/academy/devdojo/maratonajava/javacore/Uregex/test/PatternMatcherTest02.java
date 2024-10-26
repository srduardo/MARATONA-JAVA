package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d -> Todos os digitos
        // \D -> Todos os caracteres, exceto os digitos
        // \s -> Todos os espaços em branco \t \n \f \r
        // \S -> Tudo o que não for espaços em branco
        // \w -> Todos os caracteres de a-z A-Z, digitos, _
        // \W -> Tudo o que não constar no \w

        String regex = "\\W"; // Expressão regular
        String texto = "ad_ds 6456d2@da5#";

        Pattern pattern = Pattern.compile(regex); // Compila a expressão regular para um pattern (padrão)
        Matcher matcher = pattern.matcher(texto); // Verifica se o texto é compatível com o padrão

        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");

        }
    }
}

package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d -> Todos os digitos
        // \D -> Todos os caracteres, exceto os digitos
        // \s -> Todos os espaços em branco \t \n \f \r
        // \S -> Tudo o que não for espaços em branco
        // \w -> Todos os caracteres de a-z A-Z, digitos, _
        // \W -> Tudo o que não constar no \w
        // []
        // ? -> zero ou uma
        // * -> zero ou mais
        // + -> uma ou mais
        // () -> agrupamento
        // | -> "ou" e.g -> o(v|c)o result: "ovo" ou "oco"
        // $ -> "ponto final"
        // {x,y} -> de x até y
        // . -> 1.3 -> 113, 123, 1A3, 133, 1@3 (tudo o que estiver entre 1 e 3)

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)"; // Expressão regular
        String texto = "12 0x 0X 0xFFABCFE 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex); // Compila a expressão regular para um pattern (padrão)
        Matcher matcher = pattern.matcher(texto); // Verifica se o texto é compatível com o padrão

        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");

        }
    }
}

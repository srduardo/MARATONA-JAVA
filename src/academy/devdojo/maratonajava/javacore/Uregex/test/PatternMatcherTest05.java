package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // ^([a-zA-Z])+ -> Obtém a primeira palavra que seja compatível com a expressão regular
        // [^abc] -> Indica a negação, ou seja, não pode retornar os valores da expressão (abc)
        String regex = "^([a-zA-Z0-9])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; // Expressão regular
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail ";

        Pattern pattern = Pattern.compile(regex); // Compila a expressão regular para um pattern (padrão)
        Matcher matcher = pattern.matcher(texto); // Verifica se o texto é compatível com o padrão

        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim());
        System.out.println(texto.split(",")[1].trim().matches(regex));

        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");

        }
    }
}

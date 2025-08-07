package academy.devdojo.maratonajava.javacore.ZZEstreams.first_test;

import java.util.List;

public class Exercises01 {
    public static void main(String[] args) {
        System.out.println("---> Filtrar números pares:");
        List<Integer> oddList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> result = oddList.stream().filter(n -> n % 2 == 1).toList();
        result.forEach(System.out::println);
        System.out.println();

        System.out.println("---> Converter lista de nomes para maiúscula:");
        List<String> strings = List.of("eduardo, lucas, augusto, gustavo, sofia");
        List<String> upperCases = strings.stream().map(String::toUpperCase).toList();
        upperCases.forEach(System.out::println);
        System.out.println();

        System.out.println("---> Somar todos os números de uma lista:");
        List<Integer> sumList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        String string = sumList.stream().reduce(Integer::sum).toString();
        System.out.println(string);
        System.out.println();

        System.out.println("---> Ordenar uma lista de palavras:");
        List<String> words = List.of("Queijo", "Armadilha", "Rato", "Gato", "Computador");
        List<String> ordened = words.stream().sorted().toList();
        ordened.forEach(System.out::println);
        System.out.println();

        System.out.println("---> Contar palavras com mais de cinco letras:");
        List<String> countWords = List.of("Queijo", "Armadilha", "Rato", "Gato", "Computador");
        long count = countWords.stream().filter(w -> w.length() > 5).count();
        System.out.println(count);
    }
}

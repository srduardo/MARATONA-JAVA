package academy.devdojo.maratonajava.javacore.ZZEstreams.second_test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SecondStreamTest05 {

    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");

        List<String[]> splitedWords = words.stream().map(w -> w.split("")).toList();
        List<String> letters = splitedWords.stream().flatMap(Arrays::stream).toList();

        System.out.println(letters);

        // Flatmap também funciona normalmente com strings, considerando que elas são como arrays.
    }
}

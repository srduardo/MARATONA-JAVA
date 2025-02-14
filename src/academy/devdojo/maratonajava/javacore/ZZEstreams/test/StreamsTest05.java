package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StreamsTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        List<String> list = words.stream().map(w -> w.split("")).flatMap(Arrays::stream).toList();
        System.out.println(list);
    }
}

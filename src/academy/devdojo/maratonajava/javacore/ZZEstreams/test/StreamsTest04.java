package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Collection;
import java.util.List;

public class StreamsTest04 {
    public static void main(String[] args) {
        List<String> studants = List.of("Eduardo", "Lucas", "Eduarda", "Gustavo", "Matheus");
        List<String> teachers = List.of("Ávila", "Michael", "Tomia", "Paulinho", "Giulio");
        List<List<String>> college = List.of(studants, teachers);
        college.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}

package academy.devdojo.maratonajava.javacore.ZZEstreams.second_test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class SecondStreamTest04 {

    public static void main(String[] args) {
        List<String> developers = List.of("Eduardo", "Gustavo", "Lucas");
        List<String> managers = List.of("Matheus", "Michael", "Giulius");
        List<String> students = List.of("João", "Pedro", "Gabriel");
        List<List<String>> college = new ArrayList<>();
        college.add(developers);
        college.add(managers);
        college.add(students);

        college.stream().flatMap(Collection::stream).forEach(System.out::println);
        // Flatmap permite transformar streams aninhadas em uma única stream.
    }
}

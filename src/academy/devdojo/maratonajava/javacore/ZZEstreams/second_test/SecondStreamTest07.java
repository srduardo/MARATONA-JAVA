package academy.devdojo.maratonajava.javacore.ZZEstreams.second_test;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class SecondStreamTest07 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        integers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);

        System.out.println();

        integers.stream().reduce((x, y) -> x * y).ifPresent(System.out::println);

        System.out.println();

        integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        integers.stream().reduce(Integer::max).ifPresent(System.out::println);

        // Reduce realiza uma operação com todos os elementos da stream e retorna um único valor.
    }
}

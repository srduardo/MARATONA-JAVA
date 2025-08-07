package academy.devdojo.maratonajava.javacore.ZZEstreams.first_test;

import java.util.List;

public class StreamsTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        integers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
        System.out.println((integers.stream().reduce(Integer::sum)));

        System.out.println("-----------");

        integers.stream().reduce((x,y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println((integers.stream().reduce(Integer::max)));

        System.out.println("-----------");

        System.out.println((integers.stream().reduce(1, (x,y) -> x + y)));
        System.out.println((integers.stream().reduce(1, Integer::sum)));

    }
}

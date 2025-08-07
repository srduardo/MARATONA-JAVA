package academy.devdojo.maratonajava.javacore.ZZEstreams.second_test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.second_domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SecondStreamTest03 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Overlord", 8.90),
            new LightNovel("Tensei no Shittara", 1.90),
            new LightNovel("Monogatari", 2.90),
            new LightNovel("Kumo Desuga", 3.90),
            new LightNovel("Kumo Desuga", 3.90)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = list.stream();

        list.forEach(System.out::println); // Use sempre o foreach do Iterable para poupar processamento;

        long count = stream
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();

        System.out.println(count);
    }
}

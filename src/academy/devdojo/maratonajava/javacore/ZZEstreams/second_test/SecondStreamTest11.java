package academy.devdojo.maratonajava.javacore.ZZEstreams.second_test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.second_domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondStreamTest11 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Overlord", 8.90),
            new LightNovel("Tensei no Shittara", 1.90),
            new LightNovel("Monogatari", 2.90),
            new LightNovel("Kumo Desuga", 3.90)
    ));

    public static void main(String[] args) {
        System.out.println(list.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(list.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        System.out.println(list.stream().count());
        System.out.println(list.stream().collect(Collectors.counting()));

        list.stream().mapToDouble(LightNovel::getPrice).max().ifPresent(System.out::println);
        System.out.println(list.stream().collect(Collectors.minBy(Comparator.comparing(LightNovel::getPrice))));

        System.out.println(list.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice)));
    }
}

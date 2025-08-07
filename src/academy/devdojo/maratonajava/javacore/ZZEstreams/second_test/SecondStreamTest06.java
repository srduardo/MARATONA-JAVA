package academy.devdojo.maratonajava.javacore.ZZEstreams.second_test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.second_domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondStreamTest06 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Overlord", 8.90),
            new LightNovel("Tensei no Shittara", 1.90),
            new LightNovel("Monogatari", 2.90),
            new LightNovel("Kumo Desuga", 3.90)
    ));

    public static void main(String[] args) {
        System.out.println(list.stream().anyMatch(l -> l.getPrice() > 3));
        System.out.println(list.stream().allMatch(l -> l.getPrice() > 3));
        System.out.println(list.stream().noneMatch(l -> l.getPrice() > 3));

        list.stream()
                .filter(l -> l.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        list.stream()
                .filter(l -> l.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);


        list.stream()
                .filter(l -> l.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

        list.stream()
                .filter(l -> l.getPrice() > 3)
                .min(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}

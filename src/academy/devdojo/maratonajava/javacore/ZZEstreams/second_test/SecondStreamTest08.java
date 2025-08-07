package academy.devdojo.maratonajava.javacore.ZZEstreams.second_test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.second_domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class SecondStreamTest08 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Overlord", 8.90),
            new LightNovel("Tensei no Shittara", 1.90),
            new LightNovel("Monogatari", 2.90),
            new LightNovel("Kumo Desuga", 3.90)
    ));

    public static void main(String[] args) {
        list.stream().map(LightNovel::getPrice).filter(p -> p < 4).reduce(Double::sum).ifPresent(System.out::println);
        double sum = list.stream().mapToDouble(LightNovel::getPrice).filter(p -> p < 4).sum();
        System.out.println(sum);

        // MapToDouble permite que a operação seja realizada sem que o Java precise fazer a troca entre  wrappers e primitivos.
    }
}

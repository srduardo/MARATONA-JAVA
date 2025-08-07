package academy.devdojo.maratonajava.javacore.ZZEstreams.second_test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.second_domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondStreamTest02 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Overlord", 8.90),
            new LightNovel("Tensei no Shittara", 1.90),
            new LightNovel("Monogatari", 2.90),
            new LightNovel("Kumo Desuga", 3.90)
    ));
    
    public static void main(String[] args) {
        List<String> titles = list.stream()
                .sorted((Comparator.comparing(LightNovel::getTitle)))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .toList();

        System.out.println(titles);
    }
}

package academy.devdojo.maratonajava.javacore.ZZEstreams.second_test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.second_domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondStreamTest01 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Overlord", 8.90),
            new LightNovel("Tensei no Shittara", 1.90),
            new LightNovel("Monogatari", 2.90),
            new LightNovel("Kumo Desuga", 3.90)
    ));

    public static void main(String[] args) {
        list.sort(Comparator.comparing(LightNovel::getTitle));
        System.out.println(list);

        List<String> titles = new ArrayList<>();
        for (LightNovel l : list) {
            if (l.getPrice() <= 4) {
                titles.add(l.getTitle());
            }

            if (titles.size() >= 3) {
                break;
            }
        }
        System.out.println(titles);
    }
}

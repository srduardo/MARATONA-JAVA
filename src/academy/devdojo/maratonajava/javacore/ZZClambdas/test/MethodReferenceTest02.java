package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Naruto", 500), new Anime("Borito", 300), new Anime("Dragon Ball", 400)));
        AnimeComparators comparators = new AnimeComparators();
        animes.sort(comparators::animeByEpisodeNonStatic);
        System.out.println(animes);
    }
}

package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.AnimeComparators;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> animeComparatorsSupplier = AnimeComparators::new;
        AnimeComparators animeComparators = animeComparatorsSupplier.get();

        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        BiFunction<String, Integer, Anime> animeBiFunction1 = (title, episodes) -> new Anime(title, episodes);
        System.out.println(animeBiFunction.apply("Jjk", 50));
    }
}

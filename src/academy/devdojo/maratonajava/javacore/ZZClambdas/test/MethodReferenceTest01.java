package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Naruto", 500), new Anime("Borito", 300), new Anime("Dragon Ball", 400)));
        animes.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle())); // 1° forma de ordenar uma lista com lambdas e method reference.
        animes.sort(AnimeComparators::animeByEpisode); // 2° forma de ordenar uma lista com lambdas e method reference (recomendada).
        // Para realizar o method reference é necessário que só haja 1 metodo na lambda.
        // Isse method reference é uma referencia para métodos estáticos!
    }
}

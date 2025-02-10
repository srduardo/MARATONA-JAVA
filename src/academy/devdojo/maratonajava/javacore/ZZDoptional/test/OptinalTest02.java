package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptinalTest02 {
    public static void main(String[] args) {
        Optional<Manga> borutoTbv = MangaRepository.findByTitle("Boruto TBV");
        System.out.println(borutoTbv);

        Optional<Manga> byId = MangaRepository.findById(2);
        byId.orElseThrow(NullPointerException::new);

        Manga manga = MangaRepository.findByTitle("Jujutsu Kaisen")
                .orElseGet(() -> new Manga(3, "Jujutsu Kaisen", 300));
        System.out.println(manga);
    }
}

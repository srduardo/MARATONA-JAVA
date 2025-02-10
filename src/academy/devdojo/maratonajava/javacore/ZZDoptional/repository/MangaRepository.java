package academy.devdojo.maratonajava.javacore.ZZDoptional.repository;

import academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {

    private static List<Manga> mangas = List.of(new Manga(1, "Boruto TBV", 20), new Manga(2, "One Piece", 1000));

    public static Optional<Manga> findByTitle(String title) {
        return findBy(m -> m.getTitle().equals(title));
    }

    public static Optional<Manga> findById(Integer id) {
        return findBy(m -> m.getId().equals(id));
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;

        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }

        return Optional.ofNullable(found);
    }

}

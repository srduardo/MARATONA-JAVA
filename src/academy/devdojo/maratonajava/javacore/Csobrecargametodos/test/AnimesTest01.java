package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Animes;

public class AnimesTest01 {
    public static void main(String[] args) {
        Animes anime = new Animes();

        anime.init("Akudama Drive", "TV", 12, "Ação");

//        anime.setNome("Akudama Drive");
//        anime.setTipo("TV");
//        anime.setEpisodios(12);
        anime.imprime();
    }
}

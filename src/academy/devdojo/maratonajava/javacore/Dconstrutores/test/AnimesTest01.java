package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Animes;

public class AnimesTest01 {
    public static void main(String[] args) {
        Animes anime = new Animes("Haikyuu", "TV", 12, "Ação", "Production IG");
        anime.imprime();
    }
}

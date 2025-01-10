package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Livro;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Livro> livros = new HashSet<>(); // Pode usar o LinkedHashSet para manter a ordem de inserção
        livros.add(new Livro(5L, "Caixa de Pássaros", 22.99, 5));
        livros.add(new Livro(2L, "Garotos Corvos", 55.99, 0));
        livros.add(new Livro(1L, "Senhor dos Anéis", 99.90, 0));
        livros.add(new Livro(4L, "Estrutura de dados", 200.50, 3));
        livros.add(new Livro(3L, "Duna", 90.00, 0));

        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}

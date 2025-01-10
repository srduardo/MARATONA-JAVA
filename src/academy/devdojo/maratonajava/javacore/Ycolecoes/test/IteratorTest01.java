package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Livro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>(8);
        livros.add(new Livro(5L, "Caixa de Pássaros", 22.99, 5));
        livros.add(new Livro(2L, "Garotos Corvos", 55.99, 0));
        livros.add(new Livro(1L, "Senhor dos Anéis", 99.90, 0));
        livros.add(new Livro(4L, "Estrutura de dados", 200.50, 3));
        livros.add(new Livro(3L, "Duna", 90.00, 0));

        // Programação hiperativa:
        Iterator<Livro> livroIterator = livros.iterator();

        while (livroIterator.hasNext()) {
            if (livroIterator.next().getQuantidade() == 0) {
                livroIterator.remove();
            }
        }

        System.out.println(livros);

        // Programação funcional:
        livros.removeIf(livro -> livro.getQuantidade() == 0);

        System.out.println(livros);
    }
}

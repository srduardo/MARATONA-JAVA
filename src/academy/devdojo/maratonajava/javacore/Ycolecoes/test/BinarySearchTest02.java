package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Livro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>(8);
        livros.add(new Livro(5L, "Caixa de Pássaros", 22.99));
        livros.add(new Livro(2L, "Garotos Corvos", 55.99));
        livros.add(new Livro(1L, "Senhor dos Anéis", 99.90));
        livros.add(new Livro(4L, "Estrutura de dados", 200.50));
        livros.add(new Livro(3L, "Duna", 90.00));

        LivroByIdComparator2 comparator = new LivroByIdComparator2();
        Livro livroToSearch = new Livro(1L, "Senhor dos Anéis", 99.90);

        livros.sort(comparator);

        System.out.println(Collections.binarySearch(livros, livroToSearch, comparator));
    }
}

class LivroByIdComparator2 implements Comparator<Livro> {

    @Override
    public int compare(Livro o1, Livro o2) {
        return o1.getId().compareTo(o2.getId());
    }
}


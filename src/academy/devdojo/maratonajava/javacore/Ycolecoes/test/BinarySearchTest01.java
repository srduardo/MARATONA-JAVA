package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Livro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>(8);
        livros.add(new Livro(5L, "Caixa de Pássaros", 22.99));
        livros.add(new Livro(2L, "Garotos Corvos", 55.99));
        livros.add(new Livro(1L, "Senhor dos Anéis", 99.90));
        livros.add(new Livro(4L, "Estrutura de dados", 200.50));
        livros.add(new Livro(3L, "Duna", 90.00));

        Collections.sort(livros);

        for (Livro livro : livros) {
            System.out.println(livro);
        }

        Livro livroToSearch = new Livro(1L, "Senhor dos Anéis", 99.90);
        System.out.println(Collections.binarySearch(livros, livroToSearch) );
    }
}

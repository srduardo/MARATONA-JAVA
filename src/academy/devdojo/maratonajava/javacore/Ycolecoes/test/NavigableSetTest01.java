package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Livro;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest01 {
    public static void main(String[] args) {

        // O NavigableSet cria um Set apenas de classes que possuem um Comparable,
        // Ou classes que possuem outra classe de Comparator para elas.

        // O Set o NavigableSet sempre será ordenado, portanto ele não segue muito
        // bem a regra de elementos não duplicados, na verdade, pelo fato do NavigableSet
        // não usar o .equals() para verificar os elementos iguais. Ele usa o Comparable/Comparator
        // para fazer a checagem, e portanto ele adicionará sim elementos repetidos caso hoje
        // alguma alteração no atributo que estiver sendo usado para fazer a ordenação.

        NavigableSet<Livro> livroSet = new TreeSet<>();
        livroSet.add(new Livro(5L, "Caixa de Pássaros", 22.99, 5));
        livroSet.add(new Livro(2L, "Garotos Corvos", 55.99, 0));
        livroSet.add(new Livro(1L, "Senhor dos Anéis", 99.90, 0));
        livroSet.add(new Livro(4L, "Estrutura de dados", 200.50, 3));
        livroSet.add(new Livro(3L, "Duna", 90.00, 0));
        livroSet.add(new Livro(3L, "Duna 2", 90.00, 0));

        for (Livro livro : livroSet) {
            System.out.println(livro);
        }

        // O NavigableSet dispõe alguns métodos de busca interessantes para os elementos do Set criado

        // lower - Retorna o menor objeto do que o objeto passado
        // higher - Retorna o maior objeto do que o objeto passado
        // cealing - Retorna um objeto maior ou igual ao objeto passado
        // floor - Retorna um objeto menor ou igual ao objeto passado
        Livro livroToSearch = new Livro(2L, "Garotos Corvos", 55.99, 0);

        System.out.println("=====================");
        System.out.println(livroSet.lower(livroToSearch));

        System.out.println("=====================");
        System.out.println(livroSet.higher(livroToSearch));

        System.out.println("=====================");
        System.out.println(livroSet.ceiling(livroToSearch));

        System.out.println("=====================");
        System.out.println(livroSet.floor(livroToSearch));


    }
}

class livroNameComparator implements Comparator<Livro> {
    @Override
    public int compare(Livro o1, Livro o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

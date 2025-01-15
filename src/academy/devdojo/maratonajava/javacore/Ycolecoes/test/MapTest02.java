package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Livro;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Eduardo");
        Consumidor consumidor2 = new Consumidor("Sofia");

        Livro livro1 = new Livro(5L, "Caixa de Pássaros", 22.99, 5);
        Livro livro2 = new Livro(2L, "Garotos Corvos", 55.99, 0);
        Livro livro3 = new Livro(1L, "Senhor dos Anéis", 99.90, 0);
        Livro livro4 = new Livro(4L, "Estrutura de dados", 200.50, 3);
        Livro livro5 = new Livro(3L, "Duna", 90.00, 0);

        Map<Consumidor, Livro> consumidorLivroMap = new HashMap<>();
        consumidorLivroMap.put(consumidor1, livro5);
        consumidorLivroMap.put(consumidor2, livro1);

        for (Map.Entry<Consumidor, Livro> entry : consumidorLivroMap.entrySet()) {
            System.out.println(entry.getKey().getNome() + " : " + entry.getValue().getNome());
        }
    }
}

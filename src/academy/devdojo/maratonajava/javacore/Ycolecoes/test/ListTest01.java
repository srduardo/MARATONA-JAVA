package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {

        // A declaração da variável sempre ocorre na maioria das vezes
        // com o tipo mais genérico de interfacie. E o objeto delarado
        // normalmente é o mais adequado para a situação.
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);

        // Os tipos que podem ser atribuidos no generics de um list deve sempre
        // ser um Wrapper, e não um tipo primitivo

        nomes.add("Eduardo");
        nomes.add("Sofia");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.remove(1);
        nomes.remove(0);
        nomes2.add("Augusto");
        nomes2.add("Rose");
        nomes2.add("Marcelo");
        nomes.addAll(nomes2);

        System.out.println("==============");

        // Não é recomendado alterar o tamanho da lista dentro de um for
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}

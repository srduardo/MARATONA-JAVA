package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.List;
import java.util.Objects;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsultas(gatos);
    }
    // Type Erasure
    public static void printConsultas(List<? extends Animal> animals) { // Permite qualquer lista do tipo animal ou inferior
        for (Animal animal : animals) {
            animal.consulta();
        }

        // animals.add(new Cachorro()); -> Não é permitido operações de adição na lista, porque pode haver conflitos entre as classes filhas
    }

    public static void printConsultasAnimal(List<? super Animal> animals) { // Permite qualquer lista do tipo animal ou superior
        for (Object o : animals) {
            System.out.println(o);
        }

        animals.add(new Gato()); // Permitido operações de adição porque não interage com as classes filhas
    }
}

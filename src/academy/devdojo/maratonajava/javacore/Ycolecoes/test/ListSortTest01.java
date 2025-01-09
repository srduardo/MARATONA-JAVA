package academy.devdojo.maratonajava.javacore.Ycolecoes.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> planetas = new ArrayList<>(8);

        planetas.add("Urano");
        planetas.add("Terra");
        planetas.add("Marte");
        planetas.add("Netuno");

        System.out.println("===> Ordem alfabética");

        for (String p : planetas) {
            System.out.println(p);
        }

        Collections.sort(planetas); // Organiza uma List em ordem alfabética
        System.out.println("=========");

        for (String p : planetas) {
            System.out.println(p);
        }

        List<Double> numeros = new ArrayList<>(8);

        numeros.add(25.8);
        numeros.add(19D);
        numeros.add(95.8);
        numeros.add(33.1);

        System.out.println("===> Ordem numérica");

        for (Double n : numeros) {
            System.out.println(n);
        }

        Collections.sort(numeros); // Organiza uma List em ordem numérico
        System.out.println("=========");

        for (Double n : numeros) {
            System.out.println(n);
        }
    }
}

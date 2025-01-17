package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Eduardo", "Eduardo"));

        for (String s : list) {
            System.out.println(s);
        }

        add(list, new Consumidor("Eduardo"));

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void add(List list, Consumidor consumidor) {
        list.add(consumidor);
    }
}

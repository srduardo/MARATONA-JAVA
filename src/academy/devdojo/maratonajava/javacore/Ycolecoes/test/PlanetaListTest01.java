package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Planeta;

import java.util.ArrayList;
import java.util.List;

public class PlanetaListTest01 {
    public static void main(String[] args) {
        Planeta p1 = new Planeta("Netuno");
        Planeta p2 = new Planeta("Terra");
        Planeta p3 = new Planeta("Marte");

        List<Planeta> planetas = new ArrayList<>(6);
        planetas.add(p1);
        planetas.add(p2);
        planetas.add(0, p3);

        for (Planeta p : planetas) {
            System.out.println(p);
        }

        Planeta p4 = new Planeta("Terra");
        System.out.println(planetas.contains(p4));
        int index = planetas.indexOf(p4);
        System.out.println(planetas.get(index));
    }
}

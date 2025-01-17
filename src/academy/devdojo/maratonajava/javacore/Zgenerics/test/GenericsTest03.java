package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest03 {
    public static void main(String[] args) {
        List<Carro> carro = listar(new Carro("Corola"));
        System.out.println(carro);
    }

    private static <T> List<T> listar(T t) {
        List<T> list = new ArrayList<>();
        list.add(t);
        return list;
    }
}

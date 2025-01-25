package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Eduardo", "Sofia", "Augusto", "Kauane");
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        forEach(integers, num -> System.out.println(num));
        forEach(nomes, n -> System.out.println(n));

    }

    public static <T> void forEach(List<T> list, ConsumerTest<T> consumer){
        for (T e : list) {
            consumer.accept(e);
        }
    }
}

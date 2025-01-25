package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Eduardo", "Sofia", "Augusto", "Kauane");
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println(map(nomes, n -> n.length()));
        System.out.println(map(integers, integer -> integer * 2));
    }

    public static <R, T> List<R> map(List<T> list, Function<T, R> function) { // Recebe um tipo e retorna outro
        List<R> result = new ArrayList<>();
        for (T t : list) {
            R apply = function.apply(t);
            result.add(apply);
        }
        return result;
    }
}

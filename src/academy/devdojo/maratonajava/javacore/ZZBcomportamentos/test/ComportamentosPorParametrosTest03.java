package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.domain.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.interfaces.PredicateCar;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentosPorParametrosTest03 {
    private static List<Car> cars = List.of(
            new Car("black", 2014),
            new Car("blue", 1997),
            new Car("white", 2001)
    );

    public static void main(String[] args) {
        System.out.println(filter(cars, car -> car.getYear() < 2000));

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println(filter(nums, num -> num % 2 == 1));
    }

    public static <T> List<T> filter(List<T> objects, Predicate<T> predicate) {
        List<T> filteredObjects = new ArrayList<>();

        for (T obj : objects) {
            if (predicate.test(obj)) {
                filteredObjects.add(obj);
            }
        }

        return filteredObjects;
    }

}

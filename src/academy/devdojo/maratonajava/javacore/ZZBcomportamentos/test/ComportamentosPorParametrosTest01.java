package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentosPorParametrosTest01 {
    private static List<Car> cars = List.of(
            new Car("black", 2014),
            new Car("blue", 1997),
            new Car("white", 2001)
    );

    public static void main(String[] args) {
        System.out.println(filterCarByColor("white"));
        System.out.println();
        System.out.println(filterCarByYear(2014));
    }

    public static List<Car> filterCarByColor(String color) {
        List<Car> filteredCars = new ArrayList<>();

        for (Car car1 : cars) {
            if (car1.getColor().equals(color)) {
                filteredCars.add(car1);
            }
        }

        return filteredCars;
    }

    public static List<Car> filterCarByYear(Integer year) {
        List<Car> filteredCars = new ArrayList<>();

        for (Car car1 : cars) {
            if (car1.getYear() < year) {
                filteredCars.add(car1);
            }
        }

        return filteredCars;
    }


}

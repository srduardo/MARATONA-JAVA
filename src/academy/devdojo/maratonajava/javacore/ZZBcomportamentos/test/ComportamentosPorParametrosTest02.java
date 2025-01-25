package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.domain.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.interfaces.PredicateCar;

import java.util.ArrayList;
import java.util.List;

public class ComportamentosPorParametrosTest02 {
    private static List<Car> cars = List.of(
            new Car("black", 2014),
            new Car("blue", 1997),
            new Car("white", 2001)
    );

    public static void main(String[] args) {
        System.out.println(filter(cars, new PredicateCar() { // Classe anônima com implementação da interface PredicateCar
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("black");
            }
        }));

        System.out.println(filter(cars, car -> car.getColor().equals("blue")));
    }

    public static List<Car> filter(List<Car> cars, PredicateCar predicateCar) {
        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars) {
            if (predicateCar.test(car)) {
                filteredCars.add(car);
            }
        }

        return filteredCars;
    }

}

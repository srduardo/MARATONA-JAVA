package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.project;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.project.domain.Product;
import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.project.interfaces.Filter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(new Product("Requeijão", 7.00), new Product("Miojo", 2.00), new Product("Manga", 14.00));

        System.out.println(productFilter(products, product -> product.getName().equals("Miojo")));
        System.out.println(productFilter(products, product -> product.getPrice() > 3));
    }

    public static List<Product> productFilter(List<Product> list, Filter filter) {
        ArrayList<Product> objects = new ArrayList<>();

        for (Product t : list) {
            if (filter.test(t)) {
                objects.add(t);
            }
        }

        return objects;
    }
}

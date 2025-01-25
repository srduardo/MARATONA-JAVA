package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.project.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.project.domain.Product;

import javax.management.ObjectName;

public interface Filter {
    boolean test(Product obj);
}

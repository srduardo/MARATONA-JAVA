package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;

public class StreamsTest08 {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook", 3500.00),
                new Produto("Smartphone", 2500.00),
                new Produto("Teclado Mecânico", 400.00),
                new Produto("Monitor 24'", 1200.00),
                new Produto("Mouse Gamer", 250.00)
        );

        Optional<Double> reduce = produtos.stream()
                .map(Produto::getValue)
                .filter(n -> n > 1000)
                .reduce(Double::sum); // Necessitará fazer o Wrapper e Unwrapper do value
        System.out.println(reduce);

        double sum = produtos.stream()
                .mapToDouble(Produto::getValue) // Evita o Wrapper e Unwrapper (bom para poupar processamento)
                .filter(n -> n > 1000)
                .sum();
        System.out.println(sum);

        //DoubleStream doubleStream = produtos.stream()
        //        .mapToDouble();

        // DoubleStream
        // IntStream
        // FloatStream
    }
}

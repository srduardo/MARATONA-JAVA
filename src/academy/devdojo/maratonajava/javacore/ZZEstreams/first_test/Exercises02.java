package academy.devdojo.maratonajava.javacore.ZZEstreams.first_test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.first_domain.Cliente;
import academy.devdojo.maratonajava.javacore.ZZEstreams.first_domain.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Exercises02 {
    public static void main(String[] args) {
        System.out.println("---> Verificação de Presença de Palavras-Chave:");
        List<String> phrases1 = List.of("Aprender Java pode abrir muitas oportunidades na área de tecnologia.",
                "Python é uma linguagem popular para análise de dados e machine learning.",
                "Muitas empresas utilizam Java para desenvolver aplicações empresariais.",
                "O mercado de tecnologia está sempre em busca de bons desenvolvedores.",
                "Para se destacar, é importante aprender lógica de programação e algoritmos.");
        System.out.println(phrases1.stream().anyMatch(p -> p.contains("Java"))); //Verifica se algum elemento é compatível com a condição
        System.out.println(phrases1.stream().allMatch(p -> p.length() >= 5)); //Verifica se todos os elementos são compatíveis com a condição
        System.out.println(phrases1.stream().noneMatch(p -> p.contains("Python"))); //Verifica se nenhum elemento é compatível com a condição
        System.out.println();

        System.out.println("---> Busca de um Número Maior que um Valor Específico:");
        List<Integer> numbers = List.of(12, 45, 67, 23, 89, 34, 78, 56, 99, 15, 7, 50, 14);
        Optional<Integer> number = numbers.stream().filter(n -> n > 50).findFirst(); //Retorna o primeiro elemento de uma stream
        System.out.println(number);
        Optional<Integer> any = numbers.stream().filter(n -> n % 7 == 0).findAny();
        System.out.println(any);

        System.out.println("---> Listagem de Palavras Únicas de Frases:");
        List<String> phrases2 = List.of("Aprender Java pode abrir muitas oportunidades na área de tecnologia.",
                "Python é uma linguagem popular para análise de dados e machine learning.",
                "Muitas empresas utilizam Java para desenvolver aplicações empresariais.",
                "O mercado de tecnologia está sempre em busca de bons desenvolvedores.",
                "Para se destacar, é importante aprender lógica de programação e algoritmos.");
        Stream<String> stringStream = phrases2.stream().flatMap(p -> Arrays.stream(p.split(" "))).flatMap(p -> Arrays.stream(p.split(""))).distinct().sorted();
        stringStream.forEach(System.out::println);

        System.out.println("---> Filtrando e Mapeando Produtos:");
        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook", 3500.00),
                new Produto("Smartphone", 2500.00),
                new Produto("Teclado Mecânico", 400.00),
                new Produto("Monitor 24'", 1200.00),
                new Produto("Mouse Gamer", 250.00),
                new Produto("Cadeira Ergonômica", 850.00),
                new Produto("Fone de Ouvido Bluetooth", 300.00),
                new Produto("SSD 1TB", 600.00),
                new Produto("Placa de Vídeo RTX 3060", 2800.00),
                new Produto("Processador Ryzen 7", 1600.00)
        );
        List<String> list = produtos.stream().filter(p -> p.getValue() > 100).map(Produto::getName).toList();
        System.out.println(list);
        System.out.println();

        System.out.println("Busca de Cliente VIP:");
        List<Cliente> clientes = Arrays.asList(
                new Cliente("Ana", Arrays.asList(
                        new Produto("Notebook", 3500.00),
                        new Produto("Teclado Mecânico", 400.00)
                )),
                new Cliente("Bruno", Arrays.asList(
                        new Produto("Smartphone", 2500.00),
                        new Produto("Fone de Ouvido Bluetooth", 300.00)
                )),
                new Cliente("Carlos", Arrays.asList(
                        new Produto("Monitor 24'", 1200.00),
                        new Produto("SSD 1TB", 600.00),
                        new Produto("Mouse Gamer", 250.00)
                )),
                new Cliente("Daniela", Arrays.asList(
                        new Produto("Placa de Vídeo RTX 3060", 2800.00),
                        new Produto("Processador Ryzen 7", 1600.00)
                ))
        );
        Optional<Produto> list1 = clientes.stream().flatMap(cliente -> cliente.getCompras().stream()).filter(p -> p.getValue() > 1000).findAny();
        System.out.println(list1);
    }
}

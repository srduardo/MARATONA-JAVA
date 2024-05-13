package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(20, 10);
        System.out.println(result);

        double result02 = calculadora.divideDoisNumeros02(86, 5);
        System.out.println(result02);

        calculadora.imprimeDivisao(72, 0);

    }
}

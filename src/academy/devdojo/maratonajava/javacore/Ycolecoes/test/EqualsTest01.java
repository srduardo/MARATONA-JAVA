package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Planeta;

public class EqualsTest01 {

    public static void main(String[] args) {
        Planeta p1 = new Planeta("Netuno");
        Planeta p2 = new Planeta("Netuno");

        System.out.println("Teste 1: " + p1.equals(p2));

        // .equals() = compara se o valor em memória do p1 é o mesmo do p2,
        // neste caso retornará "false" porque por mais que sejam valores iguais,
        // ainda são dois objetos diferentes.
        // (o .equlas() da classe planeta foi personalizado, então retornará "true").

        System.out.println("---------------");

        Planeta p3 = new Planeta("Terra");
        Planeta p4 = p3;

        System.out.println("Teste 2: " + p3.equals(p4));

        // Já neste caso, será retornado "true", porque as duas variáveis estão
        // referenciando o mesmo valor/objeto em memória.

    }
}

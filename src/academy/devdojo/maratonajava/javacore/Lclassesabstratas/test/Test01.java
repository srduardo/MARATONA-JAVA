package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class Test01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Eduardo", 10000);
        System.out.println(desenvolvedor);
    }

}

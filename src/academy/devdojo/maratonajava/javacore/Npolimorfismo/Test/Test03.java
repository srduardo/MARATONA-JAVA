package academy.devdojo.maratonajava.javacore.Npolimorfismo.Test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class Test03 {
    public static void main(String[] args) {
        Computador produto = new Computador("Ryzen 5 5500", 900);
        Tomate tomate = new Tomate("Quadrado", 15);
        tomate.setDataDeValidade("11/12/2025");
        CalculadoraImposto.calcularImposto(tomate);
    }
}

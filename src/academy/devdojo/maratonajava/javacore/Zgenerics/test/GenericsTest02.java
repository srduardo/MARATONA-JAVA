package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("GTR34"), new Carro("Palio")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Balça")));

        RentavelService<Carro> rentavelService = new RentavelService<>(carrosDisponiveis);
        Carro carro = rentavelService.buscarObjetoDisponivel();
        rentavelService.devolverObjetoDisponivel(carro);
    }
}

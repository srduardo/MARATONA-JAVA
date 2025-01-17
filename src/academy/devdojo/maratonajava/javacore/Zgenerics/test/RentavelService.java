package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.List;

public class RentavelService<T> {
    private List<T> objetosDisponiveis;

    public RentavelService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel() {
        System.out.println("Buscando objeto disponivel...");
        T objeto = this.objetosDisponiveis.remove(0);
        System.out.println("Objetos disponíveis: ");
        System.out.println(this.objetosDisponiveis);
        return objeto;
    }

    public void devolverObjetoDisponivel(T objeto) {
        System.out.println("Devolvendo objeto disponivel");
        this.objetosDisponiveis.add(objeto);
        System.out.println("Objetos disponíveis: ");
        System.out.println(this.objetosDisponiveis);
    }
}

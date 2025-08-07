package academy.devdojo.maratonajava.javacore.ZZEstreams.first_domain;

import java.util.List;

public class Cliente {
    String nome;
    List<Produto> compras;

    public Cliente(String nome, List<Produto> compras) {
        this.nome = nome;
        this.compras = compras;
    }

    public String getNome() {
        return nome;
    }

    public List<Produto> getCompras() {
        return compras;
    }

    @Override
    public String toString() {
        return nome + " - Compras: " + compras;
    }
}

package academy.devdojo.maratonajava.javacore.Ycolecoes.domain;

import java.util.Objects;

public class Livro implements Comparable<Livro> {
    private Long id;
    private String nome;
    private double preco;
    private Integer quantidade;

    public Livro(Long id, String nome, double preco) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(nome);
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Livro(Long id, String nome, double preco, Integer quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(id, livro.id) && Objects.equals(nome, livro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Livro livro) {
        // nevativo se this < livro
        // 0 se this == livro
        // positivo se this > livro

        // ==> Algoritmo de seleção para ordenação
        // if (this.id < livro.getId()) return -1;
        // else if (this.id.equals(livro.getId())) return 0;
        // else return 1;

        // ==> Outra alternativa para a mesma solução
         return this.id.compareTo(livro.getId());

        // ==> Outra alternativa para ordenação alfabética
        // return this.nome.compareTo(livro.getNome());

        // ==> Outra alternativa para ordenação com tipos primitivos
        // return Double.valueOf(this.preco).compareTo(livro.getPreco());

        // ==> Outra alternativa para ordenação com tipos primitivos
//        return Double.compare(this.preco, livro.getPreco());
    }
}

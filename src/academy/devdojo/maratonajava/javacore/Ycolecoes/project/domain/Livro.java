package academy.devdojo.maratonajava.javacore.Ycolecoes.project.domain;

import java.util.Comparator;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Livro implements Comparable<Livro>{
    private Long isbn;
    private String titulo;
    private String autor;
    private Integer quantidade;

    public Livro(String titulo, String autor, Integer quantidade) {
        this.isbn = ThreadLocalRandom.current().nextLong(0, 100000);
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
    }

    public Livro() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(isbn, livro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn=" + isbn +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Livro o) {
        return this.getIsbn().compareTo(o.isbn);
    }
}

class LivroPorNome implements Comparator<Livro> {

    @Override
    public int compare(Livro o1, Livro o2) {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
}

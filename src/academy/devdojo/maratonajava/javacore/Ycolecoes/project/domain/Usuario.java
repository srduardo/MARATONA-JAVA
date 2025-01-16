package academy.devdojo.maratonajava.javacore.Ycolecoes.project.domain;

import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class Usuario {
    private Integer id;
    private String nome;
    private Queue<Livro> livrosEmprestados;

    public Usuario(String nome) {
        this.id = ThreadLocalRandom.current().nextInt(0, 100000);
        this.nome = nome;
        this.livrosEmprestados = new PriorityQueue<>();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", livrosEmprestados=" + livrosEmprestados +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Queue<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(Queue<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
}

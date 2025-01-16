package academy.devdojo.maratonajava.javacore.Ycolecoes.project.domain;

import java.util.*;

public class Biblioteca {
    private Map<Long, Livro> livrosArmazenados;
    private Map<Integer, Livro> historicoEmprestimos;
    private Queue<Livro> livrosEmEspera;
    private Map<Integer, Usuario> usuariosCadastrados;

    public Biblioteca(Map<Long, Livro> livrosArmazenados) {
        this.livrosArmazenados = livrosArmazenados;
        this.historicoEmprestimos = new HashMap<>();
        this.livrosEmEspera = new PriorityQueue<>();
        this.usuariosCadastrados = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "livrosArmazenados=" + livrosArmazenados +
                ", historicoEmprestimos=" + historicoEmprestimos +
                ", livrosEmEspera=" + livrosEmEspera +
                '}';
    }

    public Map<Long, Livro> getLivrosArmazenados() {
        return livrosArmazenados;
    }

    public void setLivrosArmazenados(Map<Long, Livro> livrosArmazenados) {
        this.livrosArmazenados = livrosArmazenados;
    }

    public Map<Integer, Livro> getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }

    public void setHistoricoEmprestimos(Map<Integer, Livro> historicoEmprestimos) {
        this.historicoEmprestimos = historicoEmprestimos;
    }

    public Queue<Livro> getLivrosEmEspera() {
        return livrosEmEspera;
    }

    public void setLivrosEmEspera(Queue<Livro> livrosEmEspera) {
        this.livrosEmEspera = livrosEmEspera;
    }

    public Map<Integer, Usuario> getUsuariosCadastrados() {
        return usuariosCadastrados;
    }

    public void setUsuariosCadastrados(Map<Integer, Usuario> usuariosCadastrados) {
        this.usuariosCadastrados = usuariosCadastrados;
    }

    public boolean validarDado(Object objeto) {
        if (objeto == null)
            return true;

        return false;
    }

    public void cadastrarLivro(Livro livro) {
        if (validarDado(livro)) {
            return;
        }

        for (Map.Entry<Long, Livro> entry : this.livrosArmazenados.entrySet()) {
            if (entry.getKey().equals(livro.getIsbn())) {
                System.out.println("Livro já adicionado!");
                return;
            }
        }

        this.getLivrosArmazenados().put(livro.getIsbn(), livro);
    }

    public Livro buscarLivro(String titulo) {
        Livro livroBuscado = new Livro();

        for (Map.Entry<Long, Livro> entry : this.livrosArmazenados.entrySet()) {
            if (entry.getValue().getTitulo().equals(titulo)) {
                livroBuscado = entry.getValue();
            }
        }

        return  livroBuscado;
    }

    public void emprestarLivro(Usuario usuario, Livro livro) {
        if (validarDado(livro)) {
            return;
        }

        for (Map.Entry<Long, Livro> entry : this.livrosArmazenados.entrySet()) {
            if (entry.getKey().equals(livro.getIsbn())) {
                entry.getValue().setQuantidade(entry.getValue().getQuantidade() - 1);
            }
        }

        usuario.getLivrosEmprestados().add(livro);
        this.historicoEmprestimos.put(usuario.getId(), livro);
        this.livrosEmEspera.add(livro);
    }

    public void devolverLivro(Usuario usuario, Livro livro) {
        if (validarDado(livro)) {
            return;
        }

        for (Map.Entry<Long, Livro> entry : this.livrosArmazenados.entrySet()) {
            if (entry.getKey().equals(livro.getIsbn())) {
                entry.getValue().setQuantidade(entry.getValue().getQuantidade() + 1);
            }
        }

        usuario.getLivrosEmprestados().remove(livro);
        this.livrosEmEspera.remove(livro);
    }

    public void listarLivros() {
        NavigableSet<Livro> livrosOrdemAlfabetica = new TreeSet<>(new LivroPorNome());

        for (Map.Entry<Long, Livro> entry : this.livrosArmazenados.entrySet()) {
            livrosOrdemAlfabetica.add(entry.getValue());
        }

        for (Livro livro : livrosOrdemAlfabetica) {
            System.out.println(livro.getTitulo());
        }
    }

    public void cadastrarUsuario(Usuario usuario) {
        if (validarDado(usuario)) {
            return;
        }

        this.usuariosCadastrados.put(usuario.getId(), usuario);
    }
}

package academy.devdojo.maratonajava.javacore.Ycolecoes.project.main;

import academy.devdojo.maratonajava.javacore.Ycolecoes.project.domain.Biblioteca;
import academy.devdojo.maratonajava.javacore.Ycolecoes.project.domain.Livro;
import academy.devdojo.maratonajava.javacore.Ycolecoes.project.domain.Usuario;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Long, Livro> livrosBiblioteca = new HashMap<>();
        Livro livro1 = new Livro("Garotos Corvos", "Gustavo", 10);
        Livro livro2 = new Livro("Senhor dos Aneis", "Romeu", 12);
        Livro livro3 = new Livro("As Aventuras de TimTim", "Julieta", 8);
        livrosBiblioteca.put(livro1.getIsbn(), livro1);

        Biblioteca biblioteca = new Biblioteca(livrosBiblioteca);
        biblioteca.cadastrarLivro(livro2);
        biblioteca.cadastrarLivro(livro3);
//        System.out.println(biblioteca.buscarLivro("Garotos Corvos"));

        Usuario usuario = new Usuario("Eduardo");

        biblioteca.emprestarLivro(usuario, livro1);
        System.out.println(biblioteca.getLivrosEmEspera().peek());
//        biblioteca.devolverLivro(usuario, livro1);
//        System.out.println(biblioteca.getLivrosEmEspera().peek());
        biblioteca.listarLivros();
        biblioteca.cadastrarUsuario(usuario);
        System.out.println(biblioteca.getUsuariosCadastrados());
    }
}

package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    //1 - O objeto é alocado em um espaço na memória
    //2 - Os atributos são inicializados com os valores default ou o que for atribuido a eles
    //3 - O bloco de inicialização é executado
    //4 - O construtor é executado

    {
        this.episodios = new int[100];
        for (int i = 0; i < this.episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime() {
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}

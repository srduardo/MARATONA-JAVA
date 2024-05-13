package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    //0 - O bloco de inicialização estático é executado quando a JVM carrega a classe (e é executado apenas uma vez)
    //1 - O objeto é alocado em um espaço na memória
    //2 - Os atributos são inicializados com os valores default ou o que for atribuido a eles
    //3 - O bloco de inicialização é executado
    //4 - O construtor é executado

    static {
        System.out.println("Dentro do bloco de inicialização estático 1");
        Anime.episodios = new int[100];
        for (int i = 0; i < Anime.episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    //Blocos de inicialização estáticos são excutados apenas uma vez
    static {
        System.out.println("Dentro do bloco de inicialização estático 2");

    }

    //Blocos de inicialização estáticos são executados quando a JVM carrega a classe

    //Blocos de inicialização estáticos não interagem com propriedades não estáticas da classe
    //enquanto estiverem sendo executadas, pois ela é executada antes do objeto ser alocado na memória
    //portanto, existe a grande chance das propriedades nem sequer portarem um valor para a interação
    static {
        System.out.println("Dentro do bloco de inicialização estático 3");

    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
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

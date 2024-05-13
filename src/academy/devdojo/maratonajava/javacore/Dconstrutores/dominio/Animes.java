package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Animes {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;
//Construtores - sobrecarga:
    public Animes(String nome, String tipo, int episodios, String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    public Animes(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }
    public Animes(){
        System.out.println("Dentro do construtor sem argumentos");
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio );
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getNome(){
        return this.nome;
    }
    public String getTipo(){
        return this.tipo;
    }
    public int getEpisodios(){
        return this.episodios;
    }
    public String getGenero(){
        return this.genero;
    }
}

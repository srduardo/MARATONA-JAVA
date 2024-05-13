package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public final Comprador COMPRADOR = new Comprador();
    public static final double VELOCIDADE_LIMITE;

    static{
        VELOCIDADE_LIMITE = 250;
    }

    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

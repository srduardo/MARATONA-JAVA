package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{
    private final static double IMPOSTO = 0.21;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }
    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da televisão");
        return this.valor * IMPOSTO;
    }
}

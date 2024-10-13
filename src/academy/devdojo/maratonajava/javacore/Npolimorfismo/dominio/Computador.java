package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto{
    private final static double IMPOSTO = 0.21;
    private String dataFabricacao;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador");
        return this.valor * IMPOSTO;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
}

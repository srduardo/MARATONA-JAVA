package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private int media;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salario == null) {
            return;
        }

        for (double valor : this.salario)
            System.out.print(valor + " ");
    }

    public void calculaMedia() {
        if (salario == null) {
            return;
        }

        for (double valor : this.salario) {
            this.media += valor;
        }

        this.media /= this.salario.length;
        System.out.println("\nMédia: " + this.media);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public int getMedia() {
        return media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }
}

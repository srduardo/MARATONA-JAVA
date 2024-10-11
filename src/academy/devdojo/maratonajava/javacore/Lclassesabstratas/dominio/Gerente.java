package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, int salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.2;
    }
}

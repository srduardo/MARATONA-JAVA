package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private long salario;

    static{
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentrou do construtor de Funcionario");
    }

    public long getSalario() {
        return salario;
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioDePagamento(){
        System.out.println("Eu " + this.nome + "recebi o salário: " + this.salario);
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }
}

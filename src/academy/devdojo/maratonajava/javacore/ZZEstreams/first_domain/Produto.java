package academy.devdojo.maratonajava.javacore.ZZEstreams.first_domain;

public class Produto {
    private String name;
    private double value;

    public Produto(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}

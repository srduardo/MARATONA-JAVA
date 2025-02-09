package academy.devdojo.maratonajava.javacore.Ycolecoes.domain;

public class Planeta {
    private String nome;

    public Planeta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    // Simétrico: se x.equals(y) for true, então y.equals(x) também deve ser true
    // Transitividade: se x.equals(y) for true e x.equals(z) também, então y.equals(z) também deve ser true
    // Consistência: x.equals(x) sempre retorna true se x for diferente de null
    // caso x seja null, então retornará false.
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;

        Planeta planeta = (Planeta) obj;

        return nome != null && nome.equals(planeta.getNome());
    }

    // se x.equals(y) == true, então y.hashCode() == x.hashCode()
    // se y.hashCode() == x.hashCode(), não necessariamente será x.equals(y)
    // se y.hashCode() != x.hashCode(), então x.equals(y) == false
    // o hashCode deve sempre trabalhar em sincronia com o equals
    @Override
    public int hashCode() {
        return this.nome == null ? 0 : this.nome.hashCode();
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

package academy.devdojo.maratonajava.introducao;

public class Aula06Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, double, float = 0
        // char = '\u0000' ' '
        // String = null
        // boolean = false

        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Ichigo";
        nomes[2] = "Naruto";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        nomes = new String[4];
        nomes[3] = "Boruto";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}

package academy.devdojo.maratonajava.introducao;

public class Aula05Repeticao02 {
    public static void main(String[] args) {
        int valor = 50;

        for (int i = 0; i < valor; i++) {
            if (i > 25){
                break;
            }

            System.out.println(i);
        }
    }
}

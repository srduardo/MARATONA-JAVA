package academy.devdojo.maratonajava.introducao;

public class Aula04Condicionais03 {
    public static void main(String[] args) {
        // salario > 5000 (pode doar)
        int salario = 6000;
        // Condição   ?    Verdadeiro   :   Falso
        String resultado = salario > 5000 ? "Pode doar" : "Não pode doar";

        System.out.println(resultado);

    }
}

package academy.devdojo.maratonajava.introducao;

public class Aula05Repeticao04 {
    public static void main(String[] args) {
        double valor = 30000;

        for (int i = (int) valor; i >= 1; i--) {
            double valorParcela = valor / i;

            if (valorParcela < 1000){
                continue;
            }

            System.out.println("Parcela "+ i+ " R$"+ valorParcela);
        }
    }
}

package academy.devdojo.maratonajava.introducao;

public class Aula05Repeticao03 {
    public static void main(String[] args) {
        double valor = 30000;
        for (int i = 1; i < valor; i++) {
            double valorParcela = valor / i;
            if (valorParcela < 1000){
                break;
            }

            System.out.println("Parcela "+ i+ " R$"+ valorParcela);
        }
    }
}

package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest03 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (fim - inicio) + "ms");

         inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
         fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (fim - inicio) + "ms");

         inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
         fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (fim - inicio) + "ms");
    }

    public static void concatString(int tamanho) {
        String texto = "";

        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    public static void concatStringBuilder(int tamanho) {
        StringBuilder texto = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            texto.append(i);
        }
    }

    public static void concatStringBuffer(int tamanho) {
        StringBuffer texto = new StringBuffer(tamanho);

        for (int i = 0; i < tamanho; i++) {
            texto.append(i);
        }
    }
}

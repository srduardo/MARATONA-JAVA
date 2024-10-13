package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        try {
            divisor(2, 0);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("CÓDIGO CONTINUA!");
    }

    public static int divisor(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Não pode ser 0");
        }
        return 0;
    }
}

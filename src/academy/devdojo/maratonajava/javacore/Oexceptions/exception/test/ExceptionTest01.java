package academy.devdojo.maratonajava.javacore.Oexceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        excecao();
    }

    public static void excecao() {
        File file = new File("src\\academy\\devdojo\\maratonajava\\arquivo\\test.txt");

        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

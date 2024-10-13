package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

import java.awt.*;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        conexao2();
    }

    public static void conexao() throws RuntimeException {
        try {
            System.out.println("Abrindo conexão");
            throw new RuntimeException("Error");
            //System.out.println("Escrevendo arquivo");
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando conexão");
        }
    }

    public static void conexao2() throws RuntimeException {
        try {
            System.out.println("Abrindo conexão");
            throw new RuntimeException("Error");
            //System.out.println("Escrevendo arquivo");
        } finally {
            System.out.println("Fechando conexão");
        }
    }
}

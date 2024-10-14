package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            multiplasExcecoes();
        } catch (SQLException | IOException e) {
            System.out.println("Dentro do SQLException");
        } catch (Exception e) {
            System.out.println("Dentro do Exception");
        }

        try {
            throw new IllegalStateException();
        } catch (IllegalArgumentException | ArithmeticException | IllegalAccessError e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }
    }

    public static void multiplasExcecoes() throws SQLException, IOException {
        throw new IOException();
    }
}

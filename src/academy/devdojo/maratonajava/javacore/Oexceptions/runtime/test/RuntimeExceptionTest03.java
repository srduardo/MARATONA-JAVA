package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.sql.SQLException;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        try {
            multiplasExcecoes();
        } catch (SQLException e) {
            System.out.println("Dentro do SQLException");
        } catch (IOException e) {
            System.out.println("Dentro do IOException");
        } catch (Exception e) {
            System.out.println("Dentro do Exception");
        }

        try {
            throw new IllegalStateException();
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }
    }

    public static void multiplasExcecoes() throws SQLException, IOException {
        throw new IOException();
    }
}

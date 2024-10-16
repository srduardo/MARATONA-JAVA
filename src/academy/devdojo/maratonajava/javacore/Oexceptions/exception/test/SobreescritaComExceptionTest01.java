package academy.devdojo.maratonajava.javacore.Oexceptions.exception.test;

import academy.devdojo.maratonajava.javacore.Oexceptions.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexceptions.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexceptions.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobreescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

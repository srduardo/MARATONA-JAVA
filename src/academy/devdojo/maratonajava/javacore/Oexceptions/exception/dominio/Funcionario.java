package academy.devdojo.maratonajava.javacore.Oexceptions.exception.dominio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Funcionario extends Pessoa{

    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando");
    }
}

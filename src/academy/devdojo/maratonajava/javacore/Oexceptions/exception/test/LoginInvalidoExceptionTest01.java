package academy.devdojo.maratonajava.javacore.Oexceptions.exception.test;

import academy.devdojo.maratonajava.javacore.Oexceptions.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidoException{
        Scanner input = new Scanner(System.in);
        String usernameDB = "Eduardo";
        String senhaDB = "abc123";
        System.out.println("Username:");
        String usernameInput = input.nextLine();
        System.out.println("Senha:");
        String senhaInput = input.nextLine();

        if (!usernameDB.equals(usernameInput) || !senhaDB.equals(senhaInput)) {
            throw new LoginInvalidoException();
        }

        System.out.println("Login concluído com sucesso!");
    }
}



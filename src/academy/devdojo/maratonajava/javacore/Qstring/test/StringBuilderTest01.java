package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        StringBuilder nome = new StringBuilder("Eduardo");
        nome.append(" Rodrigues");
        nome.reverse();
        System.out.println(nome);
        nome.reverse();
        String substring = nome.substring(3);
        System.out.println(substring);
    }
}

package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome1 = "Eduardo";
        String nome2 = "Eduardo";
        nome1 = nome1.concat(" Rodrigues");
        System.out.println(nome1 == nome2);
        String nome3 = new String("Eduardo");
        System.out.println(nome2 == nome3.intern());
    }
}
